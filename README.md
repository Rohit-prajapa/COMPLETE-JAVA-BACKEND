# CourseApp - Spring Boot Course Management

A ready-to-run Spring Boot CRUD application using Java 17, Spring MVC, Thymeleaf, Spring Data JPA and an embedded H2 database.

## Requirements
- JDK 17 or newer
- Maven 3.6+ (or import the project into IntelliJ IDEA / Eclipse / Spring Tool Suite)

## Run in IntelliJ IDEA
1. Extract `CourseApp.zip`.
2. Open IntelliJ IDEA and choose **Open**.
3. Select the extracted `CourseApp` folder (the folder containing `pom.xml`).
4. Trust the project and allow Maven to download dependencies.
5. Set Project SDK to Java 17 or newer.
6. Run `CourseappApplication.java`.

## Run in Eclipse / Spring Tool Suite
1. Extract the ZIP.
2. Choose **File -> Import -> Maven -> Existing Maven Projects**.
3. Select the extracted `CourseApp` folder.
4. Finish and wait for Maven dependencies to download.
5. Right-click the project -> **Run As -> Spring Boot App** (or run `CourseappApplication` as Java Application).

## Run from terminal
Open a terminal in the folder containing `pom.xml` and run:

```bash
mvn spring-boot:run
```

Or build and run:

```bash
mvn clean package
java -jar target/courseapp-0.0.1-SNAPSHOT.jar
```

## Open the application
- Course application: http://localhost:8080
- H2 database console: http://localhost:8080/h2-console

H2 console JDBC settings:
- JDBC URL: `jdbc:h2:file:./data/courseappdb`
- User Name: `sa`
- Password: leave blank

## Features
- List all courses
- Add a course
- Edit a course
- Delete a course
- Server-side form validation
- Persistent local H2 database

## Project structure

```text
CourseApp/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/com/telusko/courseapp/
        │   ├── CourseappApplication.java
        │   ├── controller/CourseController.java
        │   ├── model/Course.java
        │   ├── repository/CourseRepository.java
        │   └── service/CourseService.java
        └── resources/
            ├── application.properties
            ├── static/css/style.css
            └── templates/
                ├── courseform.html
                └── courselist.html
```

## Notes
- This project uses H2, so PostgreSQL or MySQL installation is not required.
- The H2 database is stored in the local `data/` folder.
- Do not deploy the H2 console publicly. It is intended only for local development.
