# Hospital Management System

## Overview

The Hospital Management System is a Java-based application designed to streamline hospital operations. It leverages various design patterns to ensure efficient management of patient records, hospital components, doctor assignments, and request handling. The system is built to provide a centralized, consistent, and secure approach to managing hospital data.

## Design Patterns

### Singleton Design Pattern for Patient Records
- Ensures a single instance of the patient records database.
- Maintains a centralized source of information for each patient.
- Avoids redundancy and inconsistencies in patient data by providing a single point of access.

### Proxy Design Pattern for Hospital Management
- Creates a surrogate or placeholder for the real hospital management system.
- Controls access to the actual hospital management system, ensuring only authorized entities interact with it.
- Implements lazy loading, loading hospital management components only when needed, improving efficiency.

### Visitor Design Pattern for Doctor Assignment
- Assigns doctors to patients dynamically based on criteria such as symptoms or medical history.
- Allows defining new operations (visitors) without changing the patient classes.

### Chain of Responsibility Design Pattern for Request Handling
- Handles patient requests through a chain of handler objects.
- Requests are passed through different departments or levels of authority until reaching the appropriate handler.
- Example: An admin checks the department, then forwards the request to the floor, and finally to the room level.

### Composite Design Pattern for Hospital Components
- Manages the hospital structure, treating floors, departments, and rooms as components.
- Simplifies client code interaction by treating individual rooms, floors, and departments uniformly.
- Allows composing larger structures, such as a floor containing multiple rooms.

## System Functionality

### Data Management
- Utilizes a database class for efficient storage and retrieval of hospital-related data.

### Department and Floor Management
- Manages different hospital departments and floors for effective organization.

### Doctor and Patient Management
- Manages information related to doctors and patients within the hospital.

### Handler Functionality
- Provides a handler class for managing requests or interactions within the system.

### Appointment and Record Management
- Manages patient appointments and records for efficient healthcare services.

### Proxy Functionality
- Utilizes proxy classes for additional security or enhanced functionalities.

## Database Information

- The database file contains credentials and information necessary for accessing and managing the hospital data.

## Getting Started

**Clone the Repository or download the zip, and run the code. Refer database file for credentials and other info required.**
