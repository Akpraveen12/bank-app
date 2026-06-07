<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ClearBank — Management System</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link href="https://fonts.googleapis.com/css2?family=DM+Sans:wght@300;400;500;600&family=DM+Serif+Display:ital@0;1&display=swap" rel="stylesheet">
<style>
:root {
  --navy: #0a1628;
  --navy-2: #112240;
  --navy-3: #1a3355;
  --gold: #c9a84c;
  --gold-light: #e8c97a;
  --gold-dim: rgba(201,168,76,0.15);
  --white: #f8f6f1;
  --white-dim: rgba(248,246,241,0.07);
  --white-dim2: rgba(248,246,241,0.13);
  --muted: rgba(248,246,241,0.45);
  --success: #2ecc8a;
  --success-dim: rgba(46,204,138,0.12);
  --danger: #e05c5c;
  --danger-dim: rgba(224,92,92,0.12);
  --info-dim: rgba(99,168,255,0.12);
  --radius: 10px;
  --radius-lg: 16px;
}
* { box-sizing: border-box; margin: 0; padding: 0; }
body { font-family: 'DM Sans', sans-serif; background: var(--navy); color: var(--white); min-height: 100vh; display: flex; }
.sidebar {
  width: 240px; min-height: 100vh;
  background: var(--navy-2);
  border-right: 1px solid var(--white-dim);
  display: flex; flex-direction: column;
  position: fixed; top: 0; left: 0; bottom: 0; z-index: 10;
}
.logo-wrap { padding: 2rem 1.5rem 1.5rem; border-bottom: 1px solid var(--white-dim); }
.logo { display: flex; align-items: center; gap: 12px; }
.logo-icon { width: 40px; height: 40px; background: linear-gradient(135deg, var(--gold), var(--gold-light)); border-radius: 10px; display: flex; align-items: center; justify-content: center; font-size: 18px; }
.logo-name { font-family: 'DM Serif Display', serif; font-size: 18px; color: var(--white); }
.logo-tag { font-size: 10px; color: var(--muted); letter-spacing: 0.08em; text-transform: uppercase; margin-top: 1px; }
.nav { padding: 1rem 0; flex: 1; overflow-y: auto; }
.nav-section { font-size: 10px; letter-spacing: 0.1em; text-transform: uppercase; color: var(--muted); padding: 1rem 1.5rem 0.4rem; }
.nav-item { display: flex; align-items: center; gap: 11px; padding: 10px 1.5rem; font-size: 13.5px; color: var(--muted); cursor: pointer; border-left: 2px solid transparent; transition: all 0.15s; user-select: none; }
.nav-item svg { width: 16px; height: 16px; flex-shrink: 0; opacity: 0.7; }
.nav-item:hover { color: var(--white); background: var(--white-dim); }
.nav-item.active { color: var(--gold); border-left-color: var(--gold); background: var(--gold-dim); font-weight: 500; }
.nav-item.active svg { opacity: 1; }
.sidebar-footer { padding: 1rem 1.5rem; border-top: 1px solid var(--white-dim); font-size: 11px; color: var(--muted); }
.main { margin-left: 240px; flex: 1; min-height: 100vh; display: flex; flex-direction: column; }
.topbar { padding: 1.25rem 2rem; border-bottom: 1px solid var(--white-dim); display: flex; align-items: center; justify-content: space-between; background: rgba(10,22,40,0.6); backdrop-filter: blur(12px); position: sticky; top: 0; z-index: 5; }
.page-title { font-size: 16px; font-weight: 500; }
.page-sub { font-size: 12px; color: var(--muted); margin-top: 2px; }
.topbar-pill { font-size: 11px; padding: 4px 12px; border-radius: 20px; background: var(--gold-dim); color: var(--gold); border: 1px solid rgba(201,168,76,0.25); font-weight: 500; }
.content { padding: 2rem; flex: 1; }
.panel { display: none; animation: fadein 0.2s ease; }
.panel.active { display: block; }
@keyframes fadein { from { opacity: 0; transform: translateY(6px); } to { opacity: 1; transform: none; } }
.stat-grid { display: grid; grid-template-columns: repeat(3, 1fr); gap: 16px; margin-bottom: 2rem; }
.stat-card { background: var(--navy-2); border: 1px solid var(--white-dim); border-radius: var(--radius-lg); padding: 1.25rem 1.5rem; position: relative; overflow: hidden; }
.stat-card::before { content: ''; position: absolute; top: 0; left: 0; right: 0; height: 2px; background: linear-gradient(90deg, var(--gold), transparent); }
.stat-label { font-size: 11px; text-transform: uppercase; letter-spacing: 0.08em; color: var(--muted); margin-bottom: 8px; }
.stat-value { font-family: 'DM Serif Display', serif; font-size: 28px; color: var(--white); }
.stat-sub { font-size: 11px; color: var(--muted); margin-top: 4px; }
.card { background: var(--navy-2); border: 1px solid var(--white-dim); border-radius: var(--radius-lg); padding: 1.5rem; margin-bottom: 1.25rem; }
.card-title { font-size: 12px; text-transform: uppercase; letter-spacing: 0.08em; color: var(--muted); margin-bottom: 1.25rem; padding-bottom: 0.75rem; border-bottom: 1px solid var(--white-dim); }
.form-row { margin-bottom: 1rem; }
.form-label { display: block; font-size: 12px; color: var(--muted); margin-bottom: 6px; }
.form-input { width: 100%; padding: 10px 14px; background: var(--navy); border: 1px solid var(--white-dim2); border-radius: var(--radius); color: var(--white); font-family: 'DM Sans', sans-serif; font-size: 14px; transition: border-color 0.15s; }
.form-input:focus { outline: none; border-color: var(--gold); }
.form-input::placeholder { color: rgba(248,246,241,0.2); }
.two-col { display: grid; grid-template-columns: 1fr 1fr; gap: 1rem; }
.btn { display: inline-flex; align-items: center; gap: 8px; padding: 10px 20px; border-radius: var(--radius); font-family: 'DM Sans', sans-serif; font-size: 13.5px; font-weight: 500; cursor: pointer; border: none; transition: all 0.15s; }
.btn-gold { background: linear-gradient(135deg, var(--gold), var(--gold-light)); color: var(--navy); }
.btn-gold:hover { opacity: 0.9; transform: translateY(-1px); }
.btn-success { background: var(--success-dim); color: var(--success); border: 1px solid rgba(46,204,138,0.25); }
.btn-success:hover { background: rgba(46,204,138,0.2); }
.btn-danger { background: var(--danger-dim); color: var(--danger); border: 1px solid rgba(224,92,92,0.25); }
.btn-danger:hover { background: rgba(224,92,92,0.2); }
.result { margin-top: 1rem; padding: 12px 16px; border-radius: var(--radius); font-size: 13px; display: none; }
.result.ok { background: var(--success-dim); color: var(--success); border: 1px solid rgba(46,204,138,0.25); display: block; }
.result.err { background: var(--danger-dim); color: var(--danger); border: 1px solid rgba(224,92,92,0.25); display: block; }
.acc-row { display: flex; align-items: center; justify-content: space-between; padding: 12px 0; border-bottom: 1px solid var(--white-dim); }
.acc-row:last-child { border-bottom: none; }
.acc-left { display: flex; align-items: center; gap: 12px; }
.acc-avatar { width: 38px; height: 38px; border-radius: 50%; background: var(--gold-dim); border: 1px solid rgba(201,168,76,0.3); display: flex; align-items: center; justify-content: center; font-size: 13px; font-weight: 600; color: var(--gold); }
.acc-name { font-size: 14px; font-weight: 500; }
.acc-no { font-size: 11px; color: var(--muted); margin-top: 1px; }
.acc-balance { font-family: 'DM Serif Display', serif; font-size: 16px; color: var(--gold); }
.tx-row { display: flex; align-items: center; gap: 14px; padding: 10px 0; border-bottom: 1px solid var(--white-dim); }
.tx-row:last-child { border-bottom: none; }
.tx-icon { width: 34px; height: 34px; border-radius: 50%; display: flex; align-items: center; justify-content: center; font-size: 15px; flex-shrink: 0; }
.tx-icon.deposit { background: var(--success-dim); color: var(--success); }
.tx-icon.withdraw { background: var(--danger-dim); color: var(--danger); }
.tx-icon.transfer { background: var(--info-dim); color: #63a8ff; }
.tx-icon.account { background: var(--gold-dim); color: var(--gold); }
.tx-desc { flex: 1; font-size: 13px; color: rgba(248,246,241,0.85); }
.tx-time { font-size: 11px; color: var(--muted); white-space: nowrap; }
.empty { text-align: center; padding: 2.5rem; color: var(--muted); font-size: 13px; }
@media (max-width: 768px) {
  .sidebar { transform: translateX(-100%); transition: transform 0.25s; }
  .sidebar.open { transform: translateX(0); }
  .main { margin-left: 0; }
  .stat-grid { grid-template-columns: 1fr 1fr; }
  .two-col { grid-template-columns: 1fr; }
  .content { padding: 1.25rem; }
}
</style>
</head>
<body>

<aside class="sidebar" id="sidebar">
  <div class="logo-wrap">
    <div class="logo">
      <div class="logo-icon">🏦</div>
      <div>
        <div class="logo-name">ClearBank</div>
        <div class="logo-tag">Management System</div>
      </div>
    </div>
  </div>
  <nav class="nav">
    <div class="nav-section">Overview</div>
    <div class="nav-item active" onclick="go('dashboard',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><rect x="3" y="3" width="7" height="7" rx="1"/><rect x="14" y="3" width="7" height="7" rx="1"/><rect x="3" y="14" width="7" height="7" rx="1"/><rect x="14" y="14" width="7" height="7" rx="1"/></svg>
      Dashboard
    </div>
    <div class="nav-section">Accounts</div>
    <div class="nav-item" onclick="go('create',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><circle cx="12" cy="8" r="4"/><path d="M20 21a8 8 0 1 0-16 0"/><line x1="12" y1="14" x2="12" y2="20"/><line x1="9" y1="17" x2="15" y2="17"/></svg>
      Create account
    </div>
    <div class="nav-item" onclick="go('accounts',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"/><circle cx="9" cy="7" r="4"/><path d="M23 21v-2a4 4 0 0 0-3-3.87"/><path d="M16 3.13a4 4 0 0 1 0 7.75"/></svg>
      All accounts
    </div>
    <div class="nav-item" onclick="go('delete',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><polyline points="3 6 5 6 21 6"/><path d="M19 6l-1 14H6L5 6"/><path d="M10 11v6"/><path d="M14 11v6"/><path d="M9 6V4h6v2"/></svg>
      Delete account
    </div>
    <div class="nav-section">Transactions</div>
    <div class="nav-item" onclick="go('deposit',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><line x1="12" y1="5" x2="12" y2="19"/><polyline points="19 12 12 19 5 12"/></svg>
      Deposit
    </div>
    <div class="nav-item" onclick="go('withdraw',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><line x1="12" y1="19" x2="12" y2="5"/><polyline points="5 12 12 5 19 12"/></svg>
      Withdraw
    </div>
    <div class="nav-item" onclick="go('transfer',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><polyline points="17 1 21 5 17 9"/><path d="M3 11V9a4 4 0 0 1 4-4h14"/><polyline points="7 23 3 19 7 15"/><path d="M21 13v2a4 4 0 0 1-4 4H3"/></svg>
      Transfer
    </div>
    <div class="nav-item" onclick="go('balance',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><rect x="2" y="5" width="20" height="14" rx="2"/><line x1="2" y1="10" x2="22" y2="10"/></svg>
      Check balance
    </div>
    <div class="nav-section">History</div>
    <div class="nav-item" onclick="go('history',this)">
      <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8"><circle cx="12" cy="12" r="9"/><polyline points="12 7 12 12 15 15"/></svg>
      Transactions
    </div>
  </nav>
  <div class="sidebar-footer">ClearBank v1.0 &nbsp;·&nbsp; Java + Spring Boot</div>
</aside>

<div class="main">
  <div class="topbar">
    <div>
      <div class="page-title" id="page-title">Dashboard</div>
      <div class="page-sub" id="page-sub">Overview of all accounts</div>
    </div>
    <div class="topbar-pill" id="acc-pill">0 accounts</div>
  </div>
  <div class="content">

    <!-- DASHBOARD -->
    <div class="panel active" id="panel-dashboard">
      <div class="stat-grid">
        <div class="stat-card">
          <div class="stat-label">Total accounts</div>
          <div class="stat-value" id="s-accounts">0</div>
          <div class="stat-sub">registered</div>
        </div>
        <div class="stat-card">
          <div class="stat-label">Total balance</div>
          <div class="stat-value" id="s-balance">₹0</div>
          <div class="stat-sub">across all accounts</div>
        </div>
        <div class="stat-card">
          <div class="stat-label">Transactions</div>
          <div class="stat-value" id="s-tx">0</div>
          <div class="stat-sub">recorded</div>
        </div>
      </div>
      <div class="card">
        <div class="card-title">Recent activity</div>
        <div id="dash-tx"><div class="empty">No transactions yet</div></div>
      </div>
    </div>

    <!-- CREATE -->
    <div class="panel" id="panel-create">
      <div class="card" style="max-width:480px">
        <div class="card-title">Open new account</div>
        <div class="form-row">
          <label class="form-label">Account number</label>
          <input class="form-input" type="number" id="c-no" placeholder="e.g. 1001">
        </div>
        <div class="form-row">
          <label class="form-label">Full name</label>
          <input class="form-input" type="text" id="c-name" placeholder="e.g. Ravi Kumar">
        </div>
        <button class="btn btn-gold" onclick="createAccount()">Create account →</button>
        <div class="result" id="c-res"></div>
      </div>
    </div>

    <!-- ALL ACCOUNTS -->
    <div class="panel" id="panel-accounts">
      <div class="card">
        <div class="card-title">All registered accounts</div>
        <div id="all-list"><div class="empty">No accounts found</div></div>
      </div>
    </div>

    <!-- DELETE -->
    <div class="panel" id="panel-delete">
      <div class="card" style="max-width:480px">
        <div class="card-title">Delete account</div>
        <div class="form-row">
          <label class="form-label">Account number</label>
          <input class="form-input" type="number" id="d-no" placeholder="Enter account number">
        </div>
        <button class="btn btn-danger" onclick="deleteAccount()">Delete account</button>
        <div class="result" id="d-res"></div>
      </div>
    </div>

    <!-- DEPOSIT -->
    <div class="panel" id="panel-deposit">
      <div class="card" style="max-width:480px">
        <div class="card-title">Deposit funds</div>
        <div class="form-row">
          <label class="form-label">Account number</label>
          <input class="form-input" type="number" id="dep-no" placeholder="Enter account number">
        </div>
        <div class="form-row">
          <label class="form-label">Amount (₹)</label>
          <input class="form-input" type="number" id="dep-amt" placeholder="e.g. 5000">
        </div>
        <button class="btn btn-success" onclick="deposit()">Deposit ↓</button>
        <div class="result" id="dep-res"></div>
      </div>
    </div>

    <!-- WITHDRAW -->
    <div class="panel" id="panel-withdraw">
      <div class="card" style="max-width:480px">
        <div class="card-title">Withdraw funds</div>
        <div class="form-row">
          <label class="form-label">Account number</label>
          <input class="form-input" type="number" id="w-no" placeholder="Enter account number">
        </div>
        <div class="form-row">
          <label class="form-label">Amount (₹)</label>
          <input class="form-input" type="number" id="w-amt" placeholder="e.g. 2000">
        </div>
        <button class="btn btn-danger" onclick="withdraw()">Withdraw ↑</button>
        <div class="result" id="w-res"></div>
      </div>
    </div>

    <!-- TRANSFER -->
    <div class="panel" id="panel-transfer">
      <div class="card" style="max-width:520px">
        <div class="card-title">Transfer money</div>
        <div class="two-col">
          <div class="form-row">
            <label class="form-label">From account</label>
            <input class="form-input" type="number" id="tf-from" placeholder="Sender">
          </div>
          <div class="form-row">
            <label class="form-label">To account</label>
            <input class="form-input" type="number" id="tf-to" placeholder="Receiver">
          </div>
        </div>
        <div class="form-row">
          <label class="form-label">Amount (₹)</label>
          <input class="form-input" type="number" id="tf-amt" placeholder="e.g. 1000">
        </div>
        <button class="btn btn-gold" onclick="transfer()">Transfer →</button>
        <div class="result" id="tf-res"></div>
      </div>
    </div>

    <!-- BALANCE -->
    <div class="panel" id="panel-balance">
      <div class="card" style="max-width:480px">
        <div class="card-title">Check balance</div>
        <div class="form-row">
          <label class="form-label">Account number</label>
          <input class="form-input" type="number" id="b-no" placeholder="Enter account number">
        </div>
        <button class="btn btn-gold" onclick="checkBalance()">Check balance</button>
        <div class="result" id="b-res"></div>
      </div>
    </div>

    <!-- HISTORY -->
    <div class="panel" id="panel-history">
      <div class="card">
        <div class="card-title">Full transaction history</div>
        <div id="tx-list"><div class="empty">No transactions yet</div></div>
      </div>
    </div>

  </div>
</div>

<script>
const API = 'https://bank-app-production-741d.up.railway.app';

async function apicall(method, path, body) {
  const opts = { method, headers: {'Content-Type':'application/json'} };
  if (body) opts.body = JSON.stringify(body);
  const r = await fetch(API + '/api' + path, opts);
  return r.json();
}

let accounts = [];
let transactions = [];

const pages = {
  dashboard: ['Dashboard','Overview of all accounts'],
  create:    ['Create account','Open a new bank account'],
  accounts:  ['All accounts','Browse all registered accounts'],
  delete:    ['Delete account','Remove an account permanently'],
  deposit:   ['Deposit','Add funds to an account'],
  withdraw:  ['Withdraw','Withdraw funds from an account'],
  transfer:  ['Transfer','Move money between accounts'],
  balance:   ['Check balance','View current account balance'],
  history:   ['Transactions','Complete transaction history'],
};

function go(tab, el) {
  document.querySelectorAll('.nav-item').forEach(n => n.classList.remove('active'));
  if (el) el.classList.add('active');
  document.querySelectorAll('.panel').forEach(p => p.classList.remove('active'));
  document.getElementById('panel-' + tab).classList.add('active');
  const [t, s] = pages[tab];
  document.getElementById('page-title').textContent = t;
  document.getElementById('page-sub').textContent = s;
  document.getElementById('sidebar').classList.remove('open');
  if (tab === 'dashboard') renderDashboard();
  if (tab === 'accounts')  renderAllAccounts();
  if (tab === 'history')   renderHistory();
}

function find(no) { return accounts.find(a => a.no === no) || null; }

function now() {
  return new Date().toLocaleString('en-IN', { day:'2-digit', month:'short', year:'numeric', hour:'2-digit', minute:'2-digit' });
}

function log(type, desc) {
  transactions.unshift({ type, desc, time: now() });
  updatePill();
}

function updatePill() {
  document.getElementById('acc-pill').textContent = accounts.length + ' account' + (accounts.length !== 1 ? 's' : '');
}

function res(id, msg, ok) {
  const el = document.getElementById(id);
  el.textContent = msg;
  el.className = 'result ' + (ok ? 'ok' : 'err');
}

function initials(name) {
  return name.trim().split(' ').map(w => w[0]).slice(0,2).join('').toUpperCase();
}

function fmt(n) {
  return '₹' + Number(n).toLocaleString('en-IN', { minimumFractionDigits: 2, maximumFractionDigits: 2 });
}

function txIcon(type) {
  if (type === 'deposit')  return '↓';
  if (type === 'withdraw') return '↑';
  if (type === 'transfer') return '⇄';
  return '●';
}

// ── FEATURES — call Railway backend ──

async function createAccount() {
  const no = parseInt(document.getElementById('c-no').value);
  const name = document.getElementById('c-name').value.trim();
  try {
    const r = await apicall('POST', '/accounts', {accountNumber: no, name});
    res('c-res', r.message, r.success);
    if (r.success) { document.getElementById('c-no').value=''; document.getElementById('c-name').value=''; loadDashboard(); }
  } catch(e) { res('c-res', 'Could not connect to backend.', false); }
}

async function deposit() {
  const no = parseInt(document.getElementById('dep-no').value);
  const amt = parseFloat(document.getElementById('dep-amt').value);
  try {
    const r = await apicall('POST', '/deposit', {accountNumber: no, amount: amt});
    res('dep-res', r.message, r.success);
    if (r.success) loadDashboard();
  } catch(e) { res('dep-res', 'Could not connect to backend.', false); }
}

async function withdraw() {
  const no = parseInt(document.getElementById('w-no').value);
  const amt = parseFloat(document.getElementById('w-amt').value);
  try {
    const r = await apicall('POST', '/withdraw', {accountNumber: no, amount: amt});
    res('w-res', r.message, r.success);
    if (r.success) loadDashboard();
  } catch(e) { res('w-res', 'Could not connect to backend.', false); }
}

async function transfer() {
  const from = parseInt(document.getElementById('tf-from').value);
  const to = parseInt(document.getElementById('tf-to').value);
  const amt = parseFloat(document.getElementById('tf-amt').value);
  try {
    const r = await apicall('POST', '/transfer', {fromAccount: from, toAccount: to, amount: amt});
    res('tf-res', r.message, r.success);
    if (r.success) loadDashboard();
  } catch(e) { res('tf-res', 'Could not connect to backend.', false); }
}

async function checkBalance() {
  const no = parseInt(document.getElementById('b-no').value);
  try {
    const r = await apicall('GET', '/balance/' + no);
    res('b-res', r.message, r.success);
  } catch(e) { res('b-res', 'Could not connect to backend.', false); }
}

async function deleteAccount() {
  const no = parseInt(document.getElementById('d-no').value);
  try {
    const r = await apicall('DELETE', '/accounts/' + no);
    res('d-res', r.message, r.success);
    if (r.success) loadDashboard();
  } catch(e) { res('d-res', 'Could not connect to backend.', false); }
}

// ── RENDER FUNCTIONS ──

async function loadDashboard() {
  try {
    const stats = await apicall('GET', '/stats');
    document.getElementById('s-accounts').textContent = stats.totalAccounts;
    document.getElementById('s-balance').textContent = fmt(stats.totalBalance);
    document.getElementById('s-tx').textContent = stats.totalTransactions;
    document.getElementById('acc-pill').textContent = stats.totalAccounts + ' account' + (stats.totalAccounts !== 1 ? 's' : '');
    const txs = await apicall('GET', '/transactions');
    const el = document.getElementById('dash-tx');
    el.innerHTML = txs.length ? txs.slice(0,6).map(txRow).join('') : '<div class="empty">No transactions yet</div>';
  } catch(e) {}
}

async function renderAllAccounts() {
  try {
    const accs = await apicall('GET', '/accounts');
    const el = document.getElementById('all-list');
    el.innerHTML = accs.length ? accs.map(a => `
      <div class="acc-row">
        <div class="acc-left">
          <div class="acc-avatar">${initials(a.name)}</div>
          <div>
            <div class="acc-name">${a.name}</div>
            <div class="acc-no">Account #${a.accountNumber}</div>
          </div>
        </div>
        <div class="acc-balance">${fmt(a.balance)}</div>
      </div>`).join('') : '<div class="empty">No accounts found</div>';
  } catch(e) {}
}

async function renderHistory() {
  try {
    const txs = await apicall('GET', '/transactions');
    const el = document.getElementById('tx-list');
    el.innerHTML = txs.length ? txs.map(txRow).join('') : '<div class="empty">No transactions yet</div>';
  } catch(e) {}
}

function txRow(tx) {
  return `<div class="tx-row">
    <div class="tx-icon ${tx.type || 'account'}">${txIcon(tx.type)}</div>
    <div class="tx-desc">${tx.description || tx.desc}</div>
    <div class="tx-time">${tx.timestamp || tx.time}</div>
  </div>`;
}

loadDashboard();
</script>
</body>
</html>
