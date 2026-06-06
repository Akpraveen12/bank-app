package com.bank.controller;

import com.bank.model.Account;
import com.bank.model.Transaction;
import com.bank.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BankController {

    private final BankService bank;
    public BankController(BankService bank) { this.bank = bank; }

    @PostMapping("/accounts")
    public Map<String,Object> createAccount(@RequestBody Map<String,Object> body) {
        int no = (int) body.get("accountNumber");
        String name = (String) body.get("name");
        return respond(bank.createAccount(no, name));
    }

    @PostMapping("/deposit")
    public Map<String,Object> deposit(@RequestBody Map<String,Object> body) {
        int no = (int) body.get("accountNumber");
        double amt = ((Number) body.get("amount")).doubleValue();
        return respond(bank.deposit(no, amt));
    }

    @PostMapping("/withdraw")
    public Map<String,Object> withdraw(@RequestBody Map<String,Object> body) {
        int no = (int) body.get("accountNumber");
        double amt = ((Number) body.get("amount")).doubleValue();
        return respond(bank.withdraw(no, amt));
    }

    @PostMapping("/transfer")
    public Map<String,Object> transfer(@RequestBody Map<String,Object> body) {
        int from = (int) body.get("fromAccount");
        int to   = (int) body.get("toAccount");
        double amt = ((Number) body.get("amount")).doubleValue();
        return respond(bank.transfer(from, to, amt));
    }

    @GetMapping("/balance/{no}")
    public Map<String,Object> balance(@PathVariable int no) {
        return respond(bank.checkBalance(no));
    }

    @DeleteMapping("/accounts/{no}")
    public Map<String,Object> deleteAccount(@PathVariable int no) {
        return respond(bank.deleteAccount(no));
    }

    @GetMapping("/accounts")
    public List<Account> allAccounts() { return bank.getAllAccounts(); }

    @GetMapping("/transactions")
    public List<Transaction> transactions() { return bank.getTransactions(); }

    @GetMapping("/stats")
    public Map<String,Object> stats() {
        return Map.of(
            "totalAccounts", bank.getAllAccounts().size(),
            "totalBalance",  bank.getTotalBalance(),
            "totalTransactions", bank.getTransactions().size()
        );
    }

    private Map<String,Object> respond(String result) {
        if (result.startsWith("ok:")) {
            return Map.of("success", true, "message", result.substring(3));
        }
        return Map.of("success", false, "message", result);
    }
}
