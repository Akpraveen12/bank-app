package com.bank.service;

import com.bank.model.Account;
import com.bank.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BankService {

    private final List<Account> accounts = new ArrayList<>();
    private final List<Transaction> transactions = new ArrayList<>();

    public Account findAccount(int no) {
        return accounts.stream().filter(a -> a.getAccountNumber() == no).findFirst().orElse(null);
    }

    public String createAccount(int no, String name) {
        if (no <= 0) return "Account number must be positive.";
        if (name == null || name.isBlank()) return "Name cannot be empty.";
        if (name.contains("|")) return "Name must not contain the '|' character.";
        if (findAccount(no) != null) return "Account #" + no + " already exists.";
        accounts.add(new Account(no, name));
        log("account", "Account created: #" + no + " (" + name + ")");
        return "ok:Account #" + no + " created successfully for " + name + ".";
    }

    public String deposit(int no, double amount) {
        Account acc = findAccount(no);
        if (acc == null) return "Account not found.";
        if (amount <= 0) return "Amount must be greater than zero.";
        acc.deposit(amount);
        log("deposit", String.format("₹%.2f deposited → #%d (%s)", amount, no, acc.getName()));
        return String.format("ok:Deposit successful. New balance: ₹%.2f", acc.getBalance());
    }

    public String withdraw(int no, double amount) {
        Account acc = findAccount(no);
        if (acc == null) return "Account not found.";
        if (amount <= 0) return "Amount must be greater than zero.";
        if (!acc.withdraw(amount))
            return String.format("Insufficient balance. Available: ₹%.2f", acc.getBalance());
        log("withdraw", String.format("₹%.2f withdrawn ← #%d (%s)", amount, no, acc.getName()));
        return String.format("ok:Withdrawal successful. New balance: ₹%.2f", acc.getBalance());
    }

    public String transfer(int from, int to, double amount) {
        if (from == to) return "Cannot transfer to the same account.";
        Account sender = findAccount(from);
        Account receiver = findAccount(to);
        if (sender == null) return "Sender account not found.";
        if (receiver == null) return "Receiver account not found.";
        if (amount <= 0) return "Amount must be greater than zero.";
        if (!sender.withdraw(amount))
            return String.format("Insufficient balance. Available: ₹%.2f", sender.getBalance());
        receiver.deposit(amount);
        log("transfer", String.format("₹%.2f from #%d → #%d", amount, from, to));
        return String.format("ok:Transfer successful. %s → %s: ₹%.2f", sender.getName(), receiver.getName(), amount);
    }

    public String checkBalance(int no) {
        Account acc = findAccount(no);
        if (acc == null) return "Account not found.";
        return String.format("ok:%s — Account #%d — Balance: ₹%.2f", acc.getName(), no, acc.getBalance());
    }

    public String deleteAccount(int no) {
        Account acc = findAccount(no);
        if (acc == null) return "Account not found.";
        if (acc.getBalance() > 0)
            return String.format("Account has balance of ₹%.2f. Withdraw before deleting.", acc.getBalance());
        accounts.remove(acc);
        log("account", "Account deleted: #" + no + " (" + acc.getName() + ")");
        return "ok:Account #" + no + " deleted successfully.";
    }

    public List<Account> getAllAccounts() { return Collections.unmodifiableList(accounts); }
    public List<Transaction> getTransactions() { return Collections.unmodifiableList(transactions); }

    public double getTotalBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    private void log(String type, String desc) {
        transactions.add(0, new Transaction(type, desc));
    }
}
