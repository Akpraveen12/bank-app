# ClearBank — Management System

A full-stack banking management app built with **Java Spring Boot** (backend) and a professional **HTML/CSS/JS** frontend.

---

## Project Structure

```
bank-app/
├── src/main/java/com/bank/
│   ├── BankApplication.java        ← Spring Boot entry point
│   ├── model/
│   │   ├── Account.java
│   │   └── Transaction.java
│   ├── service/
│   │   └── BankService.java        ← All business logic
│   └── controller/
│       └── BankController.java     ← REST API endpoints
├── src/main/resources/
│   ├── static/index.html           ← Frontend web page
│   └── application.properties
├── pom.xml
└── railway.toml                    ← Railway deployment config
```

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/accounts` | Create account |
| GET | `/api/accounts` | Get all accounts |
| DELETE | `/api/accounts/{no}` | Delete account |
| POST | `/api/deposit` | Deposit money |
| POST | `/api/withdraw` | Withdraw money |
| POST | `/api/transfer` | Transfer between accounts |
| GET | `/api/balance/{no}` | Check balance |
| GET | `/api/transactions` | Transaction history |
| GET | `/api/stats` | Dashboard stats |

---

## Run Locally

**Requirements:** Java 17+, Maven

```bash
cd bank-app
mvn spring-boot:run
```

Then open: http://localhost:8080

---

## Deploy to Railway (Free)

1. **Push to GitHub**
   ```bash
   git init
   git add .
   git commit -m "Initial commit"
   git remote add origin https://github.com/YOUR_USERNAME/bank-app.git
   git push -u origin main
   ```

2. **Deploy on Railway**
   - Go to https://railway.app and sign up (free)
   - Click **New Project → Deploy from GitHub**
   - Select your repository
   - Railway auto-detects the Java project and deploys it
   - Click **Generate Domain** to get your public URL

3. **Done!** Your app is live at `https://your-app.railway.app`

---

## Tech Stack

- **Backend:** Java 17, Spring Boot 3.2
- **Frontend:** HTML5, CSS3, Vanilla JS
- **Deployment:** Railway
