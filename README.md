# Object-Oriented Programming Exercise

## Exercise Objective
Design and implement a simple system to demonstrate key object-oriented programming concepts such as interface, package/namespace, public, protected, private, method overloading, method overriding, dynamic binding, abstract classes, and UML class diagrams.

## Scenario
You are required to create a simple simulation of a university management system. The system should manage different types of people associated with the university, such as students and professors, and their respective behaviors.

## Instructions

1. **Define an Abstract Class `Person`:**
   - Attributes:
     - `name` (String, private)
     - `age` (int, private)
     - `address` (String, protected)
   - Methods:
     - `getName()`: returns the name of the person
     - `getAge()`: returns the age of the person
     - `getAddress()`: returns the address of the person
     - Abstract Method `getRole()`: returns a String describing the role of the person

2. **Define Subclasses of `Person`:**
   - `Student`:
     - Additional Attribute: `studentId` (String, private)
     - Override `getRole()`: Returns "Student"
     - Additional Method: `study()`: returns a String describing the study activity
   - `Professor`:
     - Additional Attribute: `department` (String, private)
     - Override `getRole()`: Returns "Professor"
     - Additional Method: `teach()`: returns a String describing the teaching activity

3. **Define an Interface `Course`:**
   - Methods:
     - `getCourseName()`: returns the name of the course
     - `getCourseCode()`: returns the course code
     - `addParticipant(Person person)`: adds a person to the course
     - `getParticipants()`: returns a list of participants in the course

4. **Define Implementations of the `Course` Interface:**
   - `UndergraduateCourse`:
     - Attributes: `courseName` (String, private), `courseCode` (String, private)
     - Implement Methods:
       - `getCourseName()`: returns the name of the course
       - `getCourseCode()`: returns the course code
       - `addParticipant(Person person)`: adds a person to the course
       - `getParticipants()`: returns the list of participants in the course
   - `GraduateCourse`:
     - Additional Attribute: `researchFocus` (String, private)
     - Override Methods:
       - `getCourseName()`: returns the name of the course
       - `getCourseCode()`: returns the course code
       - `addParticipant(Person person)`: adds a person to the course
       - `getParticipants()`: returns the list of participants in the course

5. **Define the Main Class `University`:**
   - Methods:
     - `main(String[] args)`: Create instances of students, professors, and courses, and demonstrate the process of adding participants to courses, displaying the participants and their roles. Use lists to manage the participants and display them.

## UML Class Diagram

Refer to the [PlantUML diagram](../images/oop-version4.png).

## Submission
1. Upload your code to a public repository on GitHub.
2. Ensure your code is well-documented with comments explaining key parts.
3. Create a test case in the `main` method of the `University` class to demonstrate the functionality.
4. Submit the GitHub repository link.

---

This exercise is designed to evaluate your understanding and implementation of object-oriented programming concepts. Good luck!
