# 🤖 FaizGPT

FaizGPT is a ChatGPT-inspired web application that allows users to ask questions, receive AI-style responses from a custom backend, and save new Question & Answer pairs for future use.

---

## 🚀 Features

* 💬 Ask questions and receive AI-style answers
* ⚡ Typing animation while the response is being generated
* 💾 Save new Question & Answer pairs to the backend
* 📜 Chat history panel
* ❓ Prompt to save unanswered questions
* 🌙 Modern dark-themed user interface

---

# 🛠 Tech Stack

## Frontend

* React 19
* HTML5
* CSS3 (Custom Dark Theme)
* Fetch API

## Backend

* Spring Boot
* Java
* REST APIs
* Maven

---

# 📂 Project Structure

```
FaizGPT/
│
├── faiz_gpt/                 # React Frontend
│   ├── public/
│   ├── src/
│   │   ├── App.js
│   │   ├── App.css
│   │   └── ...
│   ├── package.json
│   └── ...
│
├── backend/                  # Spring Boot Backend
│   ├── src/
│   ├── pom.xml
│   └── ...
│
└── README.md
```

---

# ⚙️ Installation

## 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/FaizGPT.git
cd FaizGPT
```

---

# ▶️ Running the Frontend

Navigate to the React application:

```bash
cd faiz_gpt
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm start
```

The frontend will be available at:

```
http://localhost:3000
```

---

# ▶️ Running the Backend

Navigate to the backend folder:

```bash
cd backend
```

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

The backend server will start at:

```
http://localhost:8085
```

---

# 📡 API Endpoints

## Get Answer

**GET**

```
/getAnswer/{question}
```

### Example

```
GET /getAnswer/What is Java?
```

---

## Save Question & Answer

**POST**

```
/save
```

### Request Body

```json
{
  "question": "What is Java?",
  "answer": "Java is a programming language."
}
```

---

# 📜 Available Scripts

## Frontend

| Command         | Description              |
| --------------- | ------------------------ |
| `npm install`   | Install dependencies     |
| `npm start`     | Start development server |
| `npm run build` | Create production build  |
| `npm test`      | Run test suite           |

## Backend

| Command               | Description                   |
| --------------------- | ----------------------------- |
| `mvn spring-boot:run` | Start Spring Boot application |
| `mvn clean install`   | Build the project             |


---

# 🔮 Future Improvements

* User authentication
* Multiple chat sessions
* Markdown support
* Code syntax highlighting
* Database integration
* AI model integration
* Responsive mobile design

---

# 👨‍💻 Author

**Faiz**

GitHub: https://github.com/<your-username>

---

# 📄 License

This project is licensed under the MIT License.

Feel free to use, modify, and contribute to this project.
