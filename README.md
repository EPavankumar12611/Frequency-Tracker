# 🔢 Frequency Counter (Java - HashMap)

## 📌 Overview

This project is a simple Java program that counts the frequency of characters in a given string using a **HashMap**.

It demonstrates core **Data Structures and Algorithms (DSA)** concepts such as:

* Hashing
* Key-Value mapping
* Efficient counting (O(n) time complexity)

---

## 🚀 Features

* Takes input from the user
* Counts frequency of each character
* Displays results in a clear format
* Uses efficient HashMap operations

---

## 🛠️ Technologies Used

* Java
* HashMap (Java Collections Framework)

---

## 📂 Project Structure

```
Main.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

```
javac Main.java
```

2. Run the program:

```
java Main
```

---

## 💡 Example

### Input:

```
banana
```

### Output:

```
b = 1
a = 3
n = 2
```

---

## 🧠 Key Concept

The program uses:

```
map.put(ch, map.getOrDefault(ch, 0) + 1);
```

This ensures:

* If character exists → increment count
* If not → initialize with 1

---

## ⚡ Time Complexity

* **O(n)** → where n is length of string

---

## 📈 Future Improvements

* Ignore spaces and special characters
* Case-insensitive counting
* Sort output by frequency
* Extend to integer arrays

---

## 🙌 Author

E Pavan Kumar

---
