# 🦷 Simple Mobile Dental Clinic Management System (SMDCMS)

Welcome to SMDCMS, a Java-based console application built to simulate the operations of a mobile dental clinic — modular, efficient, and crafted with educational clarity in mind.

🛠️ Project Overview
SMDCMS provides a dynamic menu-driven experience that lets users manage a dental clinic on the go. The system supports the creation and management of a Clinic object that includes:

🧑‍⚕️ One or More Dentists
🧑‍🔬 One or More Dental Assistants
🧑‍🤝‍🧑 One or More Patients (with assignable charges)

All individuals — dentists, assistants, and patients — are registered using their first name, last name, and unique ID.
___
📦 Program Structure
Individual Class
A base class with private attributes firstName, lastName, and id. It's the blueprint for every person involved in the clinic.
Clinic Class
The core manager class containing private attributes like clinicName, clinicCode, clinicTerm, an array of dentists, an array of assistants, and an array of patients. This class handles the logic behind registration, data manipulation, and record-keeping.
DentalClinicDriver Class
The main interface that drives the application. It uses a switch-based menu system to execute user-selected actions such as:
Adding or viewing dentists, assistants, or patients
Assigning charges to patients
Displaying current clinic data
🛑 The program continues running until the user enters exit code 1010.
___
🚀 Why It Matters
This system demonstrates how object-oriented principles like inheritance and encapsulation can be applied to real-world-style problems. It’s a practical tool for learning Java and a strong foundation for more complex system designs.
