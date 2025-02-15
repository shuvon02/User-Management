User Management Project - Overview
This is a Spring Boot CRUD application for managing users with a web-based interface. It includes functionalities for listing users, adding new users, updating user details, and deleting users.
________________________________________
Tech Stack:
•	Spring Boot (for backend development)
•	MySQL (for database management)
•	JPA & Hibernate (for ORM and database interactions)
•	Thymeleaf (for frontend template rendering)
•	Bootstrap (for UI styling)
________________________________________
Project Structure:
1.	Backend Components:
o	User.java → Entity class representing a User.
o	UserRepository.java → JPA repository for database operations.
o	UserService.java → Handles business logic.
o	UserController.java → Exposes REST endpoints.
o	UserNotFoundException.java → Custom exception handling.
2.	Frontend Components (Thymeleaf Templates):
o	index.html → Home page.
o	users.html → Displays the list of users.
o	user_form.html → Form for adding/editing a user.
3.	Configuration Files:
o	application.properties → Configures database connection and app settings.
4.	Testing:
o	UserRepositoryTests.java → JUnit tests for repository layer.
________________________________________
Functionality:
•	View all users.
•	Add new users.
•	Update existing users.
•	Delete users.
•	Exception handling for missing users.

How to use:

1. Prerequisites
Before running the project, ensure you have the following installed on your system:
•	Java Development Kit (JDK) 17+ (OpenJDK or Oracle JDK)
•	IntelliJ IDEA Ultimate (or any Spring Boot-compatible IDE)
•	MySQL Community Server (for database management)
•	Maven (for dependency management)
________________________________________
2. Setup & Installation
1.	Clone or Download the Project
o	Extract the ZIP file or clone the repository if it's available on GitHub.
o	Open the project in IntelliJ IDEA or another IDE.
2.	Configure Database
o	Open src/main/resources/application.properties and update the MySQL database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
o	Ensure MySQL is running and create a database named user_management.
3.	Build and Run the Application
o	Open a terminal in the project directory and run:
mvn clean install
mvn spring-boot:run
o	Or, run the UserManagementApplication.java file from your IDE.


