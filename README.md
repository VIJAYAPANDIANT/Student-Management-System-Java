# 🎓 Student Management System (Java)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Console](https://img.shields.io/badge/Console-Application-lightgrey?style=for-the-badge&logo=windowsterminal)

## 🚀 Overview

A robust, console-based **Student Management System** developed in **Java**. This application provides a streamlined way to manage student academic records through a complete **CRUD** (Create, Read, Update, Delete) lifecycle. 

Designed with **Object-Oriented Programming (OOP)** principles, it ensures efficient data handling using the Java Collections Framework, offering a user-friendly menu-driven interface for seamless interaction.

---

## ✨ Key Features

### 📝 Student Records Management
- **Add Students**: Quickly register new students with unique IDs, names, and marks.
- **View All Records**: Display a comprehensive list of all enrolled students in a structured format.
- **Update Details**: Modify existing student information (name and marks) based on their unique ID.
- **Delete Records**: Easily remove student entries from the system.

### 🛠️ Technical Capabilities
- **Menu-Driven Interface**: Intuitive console navigation with simple numeric inputs.
- **In-Memory Storage**: Fast and efficient data management using `ArrayList`.
- **Input Validation**: Basic user input handling via `Scanner`.

---

## 🛠️ Technical Stack

- **Language**: `Java (JDK 8+)`
- **Core Concepts**: `OOPs (Classes, Objects, Encapsulation)`
- **Data Structures**: `ArrayList (Collections Framework)`
- **Input Handling**: `java.util.Scanner`

---

## 📂 Project Structure

```bash
c:/CT SMS/
├── StudentManagement.java   # Main source code & Entry point
└── README.md                # Project documentation
```

### Class Responsibilities:
- **`Student`**: A data model representing individual student entities with attributes like `id`, `name`, and `marks`.
- **`StudentManagement`**: The core controller handling the menu loop and all CRUD business logic.

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.

### Installation & Execution
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/VIJAYAPANDIANT/Student-Management-System-java.git
   ```
2. **Navigate to the Directory**:
   ```bash
   cd Student-Management-System-java
   ```
3. **Compile the Program**:
   ```bash
   javac StudentManagement.java
   ```
4. **Run the Application**:
   ```bash
   java StudentManagement
   ```

---

## 📸 Sample Usage

```text
1.Add  2.View  3.Update  4.Delete  5.Exit
Choice: 1
ID: 101
Name: Arun
Marks: 85
Student Added Successfully

Choice: 2
101 Arun 85
```

---

## 🤝 Contributing

Contributions are welcome! If you have suggestions for improvements or new features:
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/NewFeature`)
3. Commit your Changes (`git commit -m 'Add NewFeature'`)
4. Push to the Branch (`git push origin feature/NewFeature`)
5. Open a Pull Request

---

## 👤 Author

**Vijayapandian T**

---

*Built with passion for Java programming and efficient data management.*