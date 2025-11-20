# Spring Boot Books Manager

A comprehensive web application for managing books and categories, built with Spring Boot 3.5.8 and featuring a modern
UI with Thymeleaf templates.

## Features

- Create, Read, Update, and Delete (CRUD) operations for Books
- Create, Read, Update, and Delete (CRUD) operations for Categories
- Many-to-many relationship between Books and Categories
- Database migration management with Flyway
- Responsive web interface with Bootstrap
- Pre-loaded sample data (Harry Potter series, Clean Code, The Martian, etc.)

## Technologies Used

- **Java**: 21
- **Spring Boot**: 3.5.8
- **Spring Data JPA**: For database operations
- **Hibernate**: 6.6.36 (ORM framework)
- **Thymeleaf**: Server-side template engine
- **MySQL**: 8.0+ (Database)
- **Flyway**: Database migration tool
- **Maven**: Build automation
- **Lombok**: Reduce boilerplate code
- **Bootstrap**: Frontend styling

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 21 or higher
- MySQL 8.0 or higher
- Maven 3.6+ (or use the included Maven wrapper `./mvnw`)

## Database Setup

1. Ensure MySQL is running on your system
2. The application will automatically create the `books` database if it doesn't exist
3. Default database credentials (can be modified in `application.properties`):
    - **Username**: `root`
    - **Password**: `root`
    - **URL**: `jdbc:mysql://localhost:3306/books`

### Database Schema

The application uses Flyway to manage database migrations. The schema includes:

**Tables:**

- `books`: Stores book information (id, title, author, year, description)
- `categories`: Stores category information (id, name)
- `book_category`: Junction table for many-to-many relationship

**Sample Categories:**

- Fantasy
- Science Fiction
- Drama
- Coming of Age
- Computer Science

**Sample Books:**

- Harry Potter series (7 books)
- The Martian by Andy Weir
- Jurassic Park by Michael Crichton
- Clean Code by Robert C. Martin
- Clean Architecture by Robert C. Martin

## Installation & Running

### 1. Clone the repository

```bash
git clone <repository-url>
cd spring-boot-books-manager
```

### 2. Configure the database (Optional)

If you need to change the database credentials, edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/books?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
```

### 3. Build the project

```bash
./mvnw clean package
```

### 4. Run the application

```bash
./mvnw spring-boot:run
```

Or run the JAR file directly:

```bash
java -jar target/spring-boot-books-manager-0.0.1-SNAPSHOT.jar
```

### 5. Access the application

Open your browser and navigate to: `http://localhost:8080`

## Application Endpoints

### Books Management

- `GET /` or `GET /books` - View all books
- `GET /book/show/{id}` - View a single book
- `GET /book/create` - Display form to create a new book
- `POST /book` - Save a new book
- `GET /book/{id}` - Display form to edit a book
- `POST /book/{id}` - Update an existing book
- `GET /book/delete/{id}` - Delete a book

### Categories Management

- `GET /categories` - View all categories
- `GET /category/create` - Display form to create a new category
- `POST /category` - Save a new category
- `GET /category/{id}` - Display form to edit a category
- `POST /category/{id}` - Update an existing category
- `GET /category/delete/{id}` - Delete a category
- `GET /category/books/{id}` - View all books in a category

## Project Structure

```
spring-boot-books-manager/
├── src/
│   ├── main/
│   │   ├── java/com/hendisantika/
│   │   │   ├── controller/         # REST Controllers
│   │   │   │   ├── BookController.java
│   │   │   │   └── CategoryController.java
│   │   │   ├── model/              # Entity classes
│   │   │   │   ├── Book.java
│   │   │   │   └── Category.java
│   │   │   ├── repository/         # JPA Repositories
│   │   │   │   ├── BookRepository.java
│   │   │   │   └── CategoryRepository.java
│   │   │   ├── service/            # Business logic
│   │   │   │   ├── BookService.java
│   │   │   │   └── CategoryService.java
│   │   │   └── SpringBootBooksManagerApplication.java
│   │   └── resources/
│   │       ├── db/migration/       # Flyway migration scripts
│   │       ├── static/             # CSS, JS, images
│   │       ├── templates/          # Thymeleaf templates
│   │       └── application.properties
│   └── test/                       # Test files
├── pom.xml
└── README.md
```

## Configuration

### Application Properties

Key configurations in `src/main/resources/application.properties`:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/books?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.generate-ddl=false
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.open-in-view=false
```

## Development

### Using Spring Boot DevTools

The application includes Spring Boot DevTools for automatic application restart during development. Simply make changes
to your code and the application will automatically restart.

### Running Tests

```bash
./mvnw test
```

## Troubleshooting

### Common Issues

1. **MySQL Connection Error**
    - Ensure MySQL is running
    - Check the credentials in `application.properties`
    - Verify the database URL is correct

2. **Port 8080 already in use**
    - Change the port in `application.properties`: `server.port=8081`
    - Or kill the process using port 8080

3. **Flyway Migration Errors**
    - Check the migration scripts in `src/main/resources/db/migration/`
    - Ensure the database is accessible
    - You may need to drop and recreate the database if migrations fail

## Version History

### Current Version: 0.0.1-SNAPSHOT

**Recent Updates:**

- Upgraded to Spring Boot 3.5.8
- Updated to Jakarta EE namespaces (from javax.* to jakarta.*)
- Added Flyway MySQL dependency
- Fixed Hibernate 6 compatibility issues
- Updated Lombok annotations for better constructor handling

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## Author

- **Hendi Santika**
- Email: hendisantika@gmail.com
- Telegram: @hendisantika34

## License

This project is open source and available under the [MIT License](LICENSE).
