# Messaging Backend

This project is a reactive messaging backend built with Spring Boot, utilizing WebFlux and MongoDB. It provides a RESTful API for handling instant messaging functionalities.

## Project Structure

- **src/main/java/com/example/messaging**: Contains the main application code.
  - **MessagingApplication.java**: Entry point of the Spring Boot application.
  - **controller**: Contains REST controllers for handling message-related requests.
    - **MessageController.java**: Manages CRUD operations for messages.
  - **model**: Defines the data model.
    - **Message.java**: Represents the message document in MongoDB.
  - **repository**: Contains the data access layer.
    - **MessageRepository.java**: Interface for reactive CRUD operations on messages.
  - **service**: Contains business logic.
    - **MessageService.java**: Interacts with the repository for message operations.

- **src/main/resources**: Contains application configuration and static resources.
  - **application.properties**: Configuration for MongoDB and other application settings.
  - **static**: Directory for serving static resources (HTML, CSS, JS).

- **src/test/java/com/example/messaging**: Contains test cases for the application.
  - **MessagingApplicationTests.java**: Tests for verifying application context and components.

- **build.gradle**: Gradle build configuration file specifying dependencies and build settings.

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd messaging-backend
   ```

2. **Build the project**:
   ```
   ./gradlew build
   ```

3. **Run the application**:
   ```
   ./gradlew bootRun
   ```

4. **Access the API**: The application will be running on `http://localhost:8080`.

## Dependencies

- Spring Boot Starter WebFlux
- Spring Data MongoDB
- Lombok
- Swagger
- Spring Boot Starter Test

## Usage

The API provides endpoints for creating, retrieving, updating, and deleting messages. Refer to the Swagger documentation for detailed API specifications once the application is running.

## License

This project is licensed under the MIT License.