# 📘 CHANGELOG - Assignment 12: REST API for Library System

All notable changes to this project will be documented in this file.

## [v1.0.0] - 2025-05-02

### ✨ Added
- Created `BookService` and `UserService` in `/services` for business logic.
    - Enforced borrowing limit (max 5 books per user).
    - Validation for checked-out books.
- Built RESTful endpoints in `/api` package:
    - `GET /api/books` – Fetch all books.
    - `POST /api/books` – Create a new book.
    - `PUT /api/books/{id}` – Update an existing book.
    - `POST /api/books/{id}/checkout` – Check out a book.
- Integrated Swagger/OpenAPI for API documentation.
    - Accessible at `http://localhost:8080/swagger-ui.html`
    - Describes endpoints, request/response schemas, and error messages.

### 🧪 Tests
- Unit tests for `BookService` and `UserService`.
- Integration tests for API routes using `@SpringBootTest`.

### 🛠️ Fixes
- Resolved package visibility issues between `models`, `repositories`, and `services`.
- Configured Swagger to correctly scan controller endpoints.

## [v1.1.0] - _Planned_
- Add authentication and user login.
- Expand error handling and custom exceptions.
- Extend API to include return books and list user borrow history.
