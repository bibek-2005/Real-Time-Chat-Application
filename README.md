# 💬 Real-Time Chat Application

A real-time chat application built using **Spring Boot WebSockets**, **STOMP**, **SockJS**, and **Bootstrap**.
This project demonstrates live message broadcasting between multiple users connected to the server.

---

## 🚀 Features

* 🔴 Real-time messaging using WebSockets
* 👥 Multiple users can chat simultaneously
* ⚡ Instant message broadcast without page refresh
* 🧩 STOMP protocol for structured messaging
* 🌐 SockJS fallback for browser compatibility
* 🎨 Responsive UI with Bootstrap

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring WebSocket
* STOMP Messaging

### Frontend

* HTML
* JavaScript
* Bootstrap
* SockJS
* STOMP.js

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java/com/chat/app
 │   │   ├── config/WebSocketConfig.java
 │   │   ├── controller/ChatController.java
 │   │   └── model/ChatMessage.java
 │   └── resources/templates
 │       └── chat.html
```

---

## ⚙️ How It Works

1. Client connects to WebSocket endpoint `/chat` using SockJS.
2. Messages are sent to `/app/sendMessage`.
3. Spring controller processes the message.
4. Message is broadcast to `/topic/messages`.
5. All connected clients receive and display the message instantly.

---

## ▶️ Running the Application

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 2️⃣ Run the Spring Boot app

```bash
mvn spring-boot:run
```

### 3️⃣ Open in browser

```
http://localhost:8080/chat
```

---

## 🧪 Example Message Flow

```
User A → sends message → Server → broadcast → User A & User B receive
```

---

## 📸 Screenshot

<img width="1920" height="1080" alt="Screenshot 2026-02-28 175513" src="https://github.com/user-attachments/assets/7b277d0a-28ae-48f1-94bb-6777e5b28cc1" />


---

## 🧠 What I Learned

* WebSocket communication in Spring Boot
* STOMP messaging protocol
* Real-time UI updates with JavaScript
* Debugging WebSocket handshake and JSON mapping issues
* Importance of DTO design (primitive vs wrapper types)

---

## 🔮 Future Improvements

* ✅ Add timestamps
* ✅ User join/leave notifications
* ⏳ Save chat history to database
* ⏳ Authentication & user profiles
* ⏳ Multiple chat rooms


## 👤 Author

**Your Name**
GitHub: https://github.com/bibek-2005

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
