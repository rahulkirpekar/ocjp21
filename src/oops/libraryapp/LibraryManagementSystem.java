package oops.libraryapp;

public class LibraryManagementSystem {

}
/*
Here’s another practical example of **Class**, **Object**, **Encapsulation**, and **Inheritance** in a **Library Management System**.

---

### Full Example: Library Management System

```java
// Parent class: Person
class Person {
    private String name;
    private int age;
    private String contactNumber;

    // Constructor
    public Person(String name, int age, String contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Display common details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
    }
}

// Child class: Member
class Member extends Person {
    private int memberId;
    private int borrowedBooks;
    private int borrowingLimit;

    // Constructor
    public Member(String name, int age, String contactNumber, int memberId, int borrowingLimit) {
        super(name, age, contactNumber);
        this.memberId = memberId;
        this.borrowedBooks = 0; // Default borrowed books
        this.borrowingLimit = borrowingLimit;
    }

    // Encapsulation: Getters and Setters
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook() {
        if (borrowedBooks < borrowingLimit) {
            borrowedBooks++;
            System.out.println("Book borrowed successfully. Total borrowed books: " + borrowedBooks);
        } else {
            System.out.println("Borrowing limit reached. Cannot borrow more books.");
        }
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.println("Book returned successfully. Total borrowed books: " + borrowedBooks);
        } else {
            System.out.println("No books to return.");
        }
    }

    // Display member-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Member ID: " + memberId);
        System.out.println("Borrowed Books: " + borrowedBooks);
        System.out.println("Borrowing Limit: " + borrowingLimit);
    }
}

// Child class: Librarian
class Librarian extends Person {
    private String employeeId;
    private double salary;

    // Constructor
    public Librarian(String name, int age, String contactNumber, String employeeId, double salary) {
        super(name, age, contactNumber);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Encapsulation: Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display librarian-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create Member object
        Member member1 = new Member("Alice Johnson", 22, "9876543210", 101, 5);

        // Manage Member
        System.out.println("Member Details:");
        member1.displayDetails();
        member1.borrowBook();
        member1.borrowBook();
        member1.returnBook();

        System.out.println("\n----------------------------\n");

        // Create Librarian object
        Librarian librarian1 = new Librarian("John Smith", 35, "1234567890", "L001", 45000.00);

        // Manage Librarian
        System.out.println("Librarian Details:");
        librarian1.displayDetails();
    }
}
```

---

### **Explanation**
1. **Class and Object**:
   - `Person` is the parent class.
   - `Member` and `Librarian` are child classes that inherit common attributes and methods.
   - Objects like `member1` and `librarian1` represent real-world entities.

2. **Encapsulation**:
   - Private fields ensure data protection.
   - Getters and setters provide controlled access.

3. **Inheritance**:
   - `Member` and `Librarian` reuse the attributes and methods of `Person`.

4. **Polymorphism**:
   - `displayDetails()` is overridden to provide specific details for `Member` and `Librarian`.

5. **Real-world Functionality**:
   - `borrowBook()` and `returnBook()` manage a member's book transactions.
   - `salary` and `employeeId` encapsulate librarian-specific details.

---

### **Sample Output**

```
Member Details:
Name: Alice Johnson
Age: 22
Contact Number: 9876543210
Member ID: 101
Borrowed Books: 0
Borrowing Limit: 5
Book borrowed successfully. Total borrowed books: 1
Book borrowed successfully. Total borrowed books: 2
Book returned successfully. Total borrowed books: 1

----------------------------

Librarian Details:
Name: John Smith
Age: 35
Contact Number: 1234567890
Employee ID: L001
Salary: $45000.0
```

This example demonstrates a practical **Library Management System** using classes, objects, encapsulation, and inheritance.

*/