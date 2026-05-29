<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:f97316,100:fb923c&height=200&section=header&text=CS2102%20%E2%80%94%20OOP%20in%20Java&fontSize=42&fontColor=ffffff&fontAlignY=40&desc=Object-Oriented%20Programming%20%7C%20Practice%20Assessments%20%26%20Lab%20Activities&descAlignY=58&descColor=ffe4cc" />

</div>

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Course](https://img.shields.io/badge/Course-CS%202102-f97316?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-OOP-fb923c?style=for-the-badge)
![Type](https://img.shields.io/badge/Type-Coursework-yellow?style=for-the-badge)

</div>

---

## 👩‍💻 About This Repository

This repository contains my coursework for **CS 2102 — Object-Oriented Programming** using Java. It includes practice assessments and laboratory activities that progressively build OOP concepts from the ground up, including encapsulation, inheritance, polymorphism, and abstraction.

**Student:** Aleckxa Reign D. Bugtong
**Course:** CS 2102 — Object-Oriented Programming
**Language:** Java

---

## 📁 Repository Structure

```
CS2102-OOP-Java/
│
├── 📂 01 - Practice Assessments/
│   └── 📂 Practice Assessment 3/
│       ├── PartyCone.java         → Geometric shape calculations
│       └── Sequences.java         → Sequence and pattern generation
│
├── 📂 Practice Assessment 2/
│   └── Bugtong_AleckxaReign.pdf   → Written assessment submission
│
├── 📂 Practice Assessment 4/
│   ├── EdenAcademy.java           → Grade evaluation with rounding rules and reward system
│   └── LilycoveDepartmentStore.java → Store inventory/sales logic
│
├── 📂 Practice Assessment 5/
│   ├── 📂 EmployeeProgram/
│   │   ├── Employee.java          → Employee model with encapsulation
│   │   └── Main.java              → Driver class
│   └── 📂 PointProgram/
│       ├── Point.java             → 2D point model
│       └── Main.java              → Driver class
│
└── 📂 BugtongAleckxaReignCS2102_OOPactivities/
    └── 📂 Laboratory Activity 3 — November 12, 2025/
        └── 📂 Artists/
            ├── Artist.java        → Base class with shared properties
            ├── Dancer.java        → Subclass: Dancer
            ├── Painter.java       → Subclass: Painter
            ├── Singer.java        → Subclass: Singer
            ├── Writer.java        → Subclass: Writer
            └── ArtistDemo.java    → Demo/driver class
```

---

## 📚 Topics Covered

### 🔷 Encapsulation
Using private fields and public getters/setters to protect data integrity.

```java
// Employee.java
public class Employee {
    private int id;
    private String name;
    private String role;
    private int yearEmployed;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
```

### 🔷 Inheritance
Modeling "is-a" relationships to promote code reuse across related classes.

```java
// Artist.java → base class
// Singer.java, Painter.java, Dancer.java, Writer.java → subclasses
public class Singer extends Artist {
    // inherits name, age, specialty from Artist
    // adds Singer-specific behavior
}
```

### 🔷 Polymorphism
Overriding methods so the same call behaves differently depending on the object.

```java
artist.displayInfo();  // → calls the correct subclass version at runtime
```

### 🔷 Abstraction
Designing classes that expose only what's necessary, hiding internal complexity.

---

## 🗂️ Activity Highlights

### 🎨 Lab Activity 3 — Artists (OOP Hierarchy)
Models a hierarchy of artists using inheritance:
- `Artist` is the base class holding common properties (`name`, `age`, `specialty`)
- `Singer`, `Dancer`, `Painter`, and `Writer` extend `Artist` with their own behaviors
- `ArtistDemo` demonstrates polymorphic behavior across all subclasses

### 🏫 Practice Assessment 4 — Eden Academy
Grade evaluation system featuring:
- Custom rounding rules (grades ≥ 78 rounded up if within 3 of next multiple of 5)
- Pass/fail classification
- Reward system: **Stella Stars** for every 3 passing grades, **Tonitrus Bolts** for failures

### 👥 Practice Assessment 5 — Employee & Point Programs
- `Employee`: Demonstrates full encapsulation with getters/setters for `id`, `name`, `role`, and `yearEmployed`
- `Point`: Models a 2D coordinate with operations on the point

---

## 🚀 How to Run

### Prerequisites
- Java 17 or later → [Download here](https://www.java.com/download)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/aleckxareign/CS2102-OOP-Java.git
cd CS2102-OOP-Java
```

**2. Navigate to the activity folder**
```bash
cd "BugtongAleckxaReignCS2102_OOPactivities/Laboratory Activity 3 - 12-November-2025/Artists"
```

**3. Compile**
```bash
javac *.java
```

**4. Run**
```bash
java ArtistDemo
```

> Repeat steps 2–4 for any other activity folder.

---

## ⚙️ Tech Stack

| Tool | Purpose |
|------|---------|
| Java 17+ | Primary programming language |
| VS Code / IntelliJ | IDE |
| Git & GitHub | Version control |

---

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:f97316,100:fb923c&height=100&section=footer" />

<sub>📖 CS 2102 — Object-Oriented Programming Coursework · Aleckxa Reign D. Bugtong</sub>

</div>
