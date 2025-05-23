# 🦷 Simple Mobile Dental Clinic Management System (SMDCMS)

Welcome to SMDCMS, a Java-based console application built to simulate the operations of a mobile dental clinic — modular, efficient, and crafted with educational clarity in mind.

## 🛠️ Project Overview
SMDCMS provides a dynamic menu-driven experience that lets users manage a dental clinic on the go. The system supports the creation and management of a Clinic object that includes:

-🧑‍⚕️ One or More Dentists
-🧑‍🔬 One or More Dental Assistants
-🧑‍🤝‍🧑 One or More Patients (with assignable charges)

All individuals — dentists, assistants, and patients — are registered using their first name, last name, and unique ID.
___
## 📦 Program Structure
### `Individual` Class
A foundational class representing a person in the system. It contains:
- `firstName` (String)
- `lastName` (String)
- `id` (String)

These attributes are private and uniquely define each individual: dentist, assistant, or patient.

### `Clinic` Class
This is the central manager of the system. It maintains:
- `clinicName` (String)
- `clinicCode` (String)
- `clinicTerm` (String)
- An **array of dentists**
- An **array of dental assistants**
- An **array of patients**

It provides the logic to manage clinic operations and interacts with `Individual` objects to store and manipulate data.

### `DentalClinicDriver` Class
This is the main class that runs the program. It:
- Creates and manages a `Clinic` object
- Handles user interaction through a `switch`-based menu system
- Executes user-selected actions like registering individuals, assigning charges, and displaying clinic records

The program terminates safely when the user enters **code `1010`**.
___
## 🛠️ Features

- Object-Oriented Design (Inheritance & Encapsulation)
- Menu-Driven Console Interface
- Dynamic Object Management
- Charge Assignment for Patients
- Simple Exit Condition
___
## 🚀 Why It Matters
This system demonstrates how object-oriented principles like inheritance and encapsulation can be applied to real-world-style problems. It’s a practical tool for learning Java and a strong foundation for more complex system designs.
