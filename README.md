# Election Voting System

This is a Spring Boot mini-project that demonstrates an election voting system built using Spring 3.0.0, Hibernate, and JPA. The application allows users to create elections, add election choices, register users, cast votes, and retrieve election results.

## Project Structure

The project is organized as follows:

- **Entities:**
  - `Election`: Represents an election with a unique name.
  - `ElectionChoice`: Represents an election choice (candidate) associated with a specific election.
  - `User`: Represents a voter with a unique name.
  - `Vote`: Represents a vote cast by a user for a specific election choice in an election.

- **Relationships:**
  - `ElectionChoice` - `Election`: Many-to-One relationship.
  - `Vote` - `User`: One-to-One relationship.
  - `Vote` - `Election`: Many-to-One relationship.
  - `Vote` - `ElectionChoice`: Many-to-One relationship.

## Technologies Used

- Spring Boot 3.0.0
- Spring Data JPA
- Hibernate
- MySQL
- RESTful Web Services

## Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL

### Setup Instructions

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/election-voting-system.git
    cd election-voting-system
    ```

2. Update the `application.yml` with your database configurations:

    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/election_db
        username: your-username
        password: your-password
      jpa:
        hibernate:
          ddl-auto: update
        show-sql: true
    ```

3. Build and run the application:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### API Endpoints

#### 1. Election Endpoints

- **GET `/get/elections`**  
  Retrieves the list of all elections.

- **POST `/add/election`**  
  Creates a new election.  
  **Request Body:** `Election` object.

#### 2. ElectionChoice Endpoints

- **POST `/add/electionChoice`**  
  Adds a new election choice (candidate) for a specific election.  
  **Request Body:** `ElectionChoice` object.

- **GET `/get/electionChoices`**  
  Fetches the list of all election choices.

- **POST `/count/election/choices`**  
  Retrieves the list of all choices for a given election.  
  **Request Body:** `Election` object.

#### 3. User Endpoints

- **POST `/add/user`**  
  Creates a new user (voter).  
  **Request Body:** `User` object.

- **GET `/get/users`**  
  Fetches the list of all users.

#### 4. Vote Endpoints

- **GET `/get/votes`**  
  Fetches the list of all votes.

- **POST `/add/vote`**  
  Registers a new vote.  
  **Request Body:** `Vote` object.

- **GET `/count/votes`**  
  Fetches the total count of votes.

- **POST `/count/election/votes`**  
  Returns the count of total votes by election.  
  **Request Body:** `Election` object.

#### 5. Results Endpoints

- **POST `/winner/election`**  
  Retrieves the election choice (candidate) for a specific election as the winner.  
  **Request Body:** `Election` object.

### Running Tests

Use Postman or any other API testing tool to test the endpoints and validate that the application is correctly saving and retrieving data from the database.

