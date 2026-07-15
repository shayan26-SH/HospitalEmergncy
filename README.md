# Hospital Emergency Response System



## Overview



The Hospital Emergency Response System is a Java application designed to simulate how a hospital handles different emergency situations. The purpose of this project is to demonstrate the implementation of multiple object-oriented design patterns while keeping the system organized, maintainable, and easy to extend.



The system allows hospital staff to respond to different emergency situations by creating the appropriate medical team, preparing the treatment room, transporting the patient using different transportation methods, notifying the emergency staff, and admitting the patient into the hospital.



Rather than having one large class responsible for every operation, the system is divided into smaller components that each have a single responsibility. These components communicate through design patterns to reduce coupling and improve flexibility.



---



# Project Objectives



The objectives of this project are:



- Demonstrate the use of Creational, Structural, and Behavioral Design Patterns.

- Practice object-oriented programming concepts.

- Apply abstraction and encapsulation.

- Separate responsibilities between different classes.

- Simulate a realistic hospital emergency workflow.

- Make the system easy to maintain and extend.



---



# Emergency Types



The system supports multiple emergency categories.



- Minor Emergency

- Critical Emergency

- Infectious Emergency



Each emergency type creates a different medical response team.



---



# Design Patterns Used



## 1. Abstract Factory Pattern (Creational)



The Abstract Factory pattern is responsible for creating an entire emergency response team.



Instead of manually creating doctors, nurses, and treatment rooms inside the program, the factory creates all related objects together.



Factories included:



- MinorEmergencyFactory

- CriticalEmergencyFactory

- InfectiousEmergencyFactory



Each factory creates:



- Doctor

- Nurse

- TreatmentRoom



Example:



```java

EmergencyTeamFactory factory = new CriticalEmergencyFactory();



Doctor doctor = factory.createDoctor(...);

Nurse nurse = factory.createNurse(...);

TreatmentRoom room = factory.createTreatmentRoom(...);

```



Advantages:



- Hides object creation.

- Creates matching objects.

- Easy to add new emergency types.

- Reduces duplicated code.



---



## 2. Facade Pattern (Structural)



The Facade pattern simplifies the emergency response process.



Instead of interacting with several subsystem classes individually, the client communicates with one class:



```

EmergencyResponseFacade

```



The facade coordinates the following subsystems:



- PatientRegistrationSystem

- RoomPreparationSystem

- MedicalEquipmentSystem

- NotificationSystem



The facade performs the complete emergency workflow.



Advantages:



- Simplifies the client code.

- Hides subsystem complexity.

- Centralizes the emergency process.

- Easier maintenance.



---



## 3. Strategy Pattern (Behavioral)



Patients may require different transportation methods depending on their medical condition.



The transportation algorithm is selected at runtime.



Strategies include:



- WalkingTransportStrategy

- WheelchairTransportStrategy

- StretcherTransportStrategy

- IsolationTransportStrategy



Advantages:



- Eliminates long if-else statements.

- Allows transportation methods to be changed easily.

- Easy to add new transportation methods.

- Promotes the Open/Closed Principle.



---



# Project Structure



```

src

└── hospital

    ├── Patient.java

    ├── EmergencyCase.java

    │

    ├── Creational

    │   ├── Doctor.java

    │   ├── Nurse.java

    │   ├── TreatmentRoom.java

    │   ├── EmergencyTeamFactory.java

    │   ├── MinorEmergencyFactory.java

    │   ├── CriticalEmergencyFactory.java

    │   └── InfectiousEmergencyFactory.java

    │

    ├── Structural

    │   ├── EmergencyResponseFacade.java

    │   ├── PatientRegistrationSystem.java

    │   ├── RoomPreparationSystem.java

    │   ├── MedicalEquipmentSystem.java

    │   └── NotificationSystem.java

    │

    └── Behavioral

        ├── TransportStrategy.java

        ├── WalkingTransportStrategy.java

        ├── WheelchairTransportStrategy.java

        ├── StretcherTransportStrategy.java

        └── IsolationTransportStrategy.java

```



---



# Main Classes



## Patient



Stores patient information including:



- Patient ID

- Patient Name

- Severity Level

- Infectious Status

- Registration Status

- Admission Status



Responsibilities:



- Store patient information.

- Maintain registration status.

- Maintain admission status.



---



## EmergencyCase



Represents an emergency event.



Stores:



- Case ID

- Patient

- Emergency Type

- Room Availability



Responsibilities:



- Connect patient information with the emergency.

- Store emergency details.



---



## Doctor



Represents a doctor responsible for treating patients.



Stores:



- Name

- Email

- Specialization



Responsibilities:



- Treat the patient.



---



## Nurse



Represents the assisting nurse.



Stores:



- Name

- Email

- Role



Responsibilities:



- Assist the doctor.



---



## TreatmentRoom



Represents the hospital treatment room.



Stores:



- Room Type

- Availability



Responsibilities:



- Prepare the room.

- Track availability.



---



# Emergency Workflow



The complete emergency process is:



1. Create patient.

2. Create emergency case.

3. Select factory.

4. Factory creates doctor.

5. Factory creates nurse.

6. Factory creates treatment room.

7. Register patient.

8. Prepare treatment room.

9. Prepare medical equipment.

10. Transport patient.

11. Notify hospital staff.

12. Doctor treats patient.

13. Nurse assists doctor.

14. Admit patient.



---



# Transportation Rules



Walking



- Used for low severity patients.



Wheelchair



- Used for medium severity patients.



Stretcher



- Used for critical patients.



Isolation



- Used for infectious patients.



---



# Benefits of the System



The project demonstrates:



- Object-oriented programming

- Encapsulation

- Abstraction

- Polymorphism

- Composition

- Interfaces

- Design Patterns



The design also makes it easy to introduce new emergency types, new transportation methods, or additional hospital services without modifying the existing code.



---



# Future Improvements



Possible future enhancements include:



- Hospital database integration.

- Graphical User Interface (GUI).

- Appointment scheduling.

- Multiple hospital branches.

- Patient medical history.

- Billing system.

- Pharmacy module.

- Ambulance dispatch.

- Online patient registration.

- Real-time emergency monitoring.

- Doctor scheduling.

- Medical inventory management.

- Emergency room capacity tracking.

- Hospital statistics dashboard.

- Patient insurance verification.

- Logging system.

- Authentication system.

- Electronic medical records.

- Multiple treatment room categories.

- Priority queue for emergency patients.



---



# Technologies Used



- Java

- Object-Oriented Programming

- Abstract Factory Pattern

- Facade Pattern

- Strategy Pattern



---



# Learning Outcomes



This project demonstrates how multiple design patterns can work together within one application.



The Abstract Factory pattern creates complete emergency teams.



The Facade pattern simplifies the interaction between several hospital subsystems.



The Strategy pattern allows transportation methods to change dynamically depending on patient conditions.



Together, these patterns improve code organization, flexibility, maintainability, and readability while following object-oriented software design principles.



---



# Conclusion



The Hospital Emergency Response System provides a simplified simulation of how hospitals manage emergency situations. Although the application is relatively small, it demonstrates how multiple design patterns can cooperate to solve real-world software engineering problems.



By separating object creation, system coordination, and transportation behavior into different design patterns, the project becomes modular, reusable, and easier to maintain. This design also allows future developers to extend the system with additional emergency types, transportation strategies, or hospital services without significantly modifying the existing implementation.
