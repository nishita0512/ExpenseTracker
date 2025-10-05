
# Expense Tracker API

A backend REST API built with Spring Boot to manage and analyze personal expenses.

This API supports CRUD operations, categories, summary reports, and basic validations. Data is persisted using the H2 in-memory database by default, which makes setup quick and easy.

---

## ✨ Features

- Add, view, update, and delete expenses.
- Basic validation and clear error handling.
- Predefined categories (e.g., Food, Travel, Bills).
- Summary reports to analyze spending:
  - Total amount spent.
  - Group expenses by category.
  - Group expenses by month.
- Filter expenses by date or category.

---

## Endpoints

| Method | Endpoint                             | Description                                            |
| :----- | :----------------------------------- | :----------------------------------------------------- |
| `POST` | `/api/expenses`                      | Add a new expense.                                     |
| `GET`  | `/api/expenses`                      | Retrieve all expenses.                                 |
| `GET`  | `/api/expenses/{id}`                 | Retrieve a single expense by its ID.                   |
| `GET`  | `/api/expenses/month/{month}`        | Retrieve expenses for a specific month (e.g., 2025-10). |
| `PUT`  | `/api/expenses/{id}`                 | Update an existing expense by its ID.                  |
| `DELETE`| `/api/expenses/{id}`                 | Delete an expense by its ID.                           |
| `GET`  | `/api/expenses/summary`              | Get summary reports with optional filters.             |

---

## 🚀 How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/nishita0512/ExpenseTracker.git
    ```

2.  **Open the project in IntelliJ:**

3.  **Open the ExpenseTrackerApplication (path: expenseTracker/src/main/java/com/example/expenseTracker/)**

4. **Click the green run button:**
   <img width="851" height="240" alt="image" src="https://github.com/user-attachments/assets/265a46c7-38a2-4af3-875d-a44b65595683" />


5. **Access the API:**
    Test endpoints using a tool like Postman or with `curl`.
    ```bash
    curl -X GET http://localhost:8080/api/expenses
    ```

---

## 🛠️ Design Overview

The backend is designed to manage user expenses efficiently and consistently.

### Expense Entity
Represents a single expense record with the following fields:
-   `id` (Long): A unique identifier for the expense.
-   `amount` (Double): The monetary value of the expense.
-   `date` (String): The date of the expense in `YYYY-MM-DD` format.
-   `category` (String): The category of the expense (e.g., `FOOD`, `TRAVEL`).
-   `note` (String): An optional note or description.

### Validation Rules
-   **Amount**: Must be a numeric value greater than 0.
-   **Date**: Must follow the `YYYY-MM-DD` format.
-   **Category**: Must be one of the predefined values in `ExpenseCategoryEnum`. An invalid category will trigger a validation error.

### ErrorResponse
A standard structure for returning validation or runtime errors.
-   `status`: The HTTP status code.
-   `message`: A clear description of the error.
-   `timestamp`: The time when the error occurred.

---

## 📸 Sample Requests & Responses

1.  **Add Expense**
    <img width="1144" height="315" alt="image" src="https://github.com/user-attachments/assets/0937940b-8292-4f85-947b-7c5038496c0d" />

2.  **Get All Expenses**
    <img width="1145" height="434" alt="image" src="https://github.com/user-attachments/assets/3c135042-7d79-47b7-97ab-cff3671dfce2" />

3.  **Get Expenses by Month**
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/7d96b6fb-78d8-435e-b325-afe7b92d1e62" />

4.  **Update Expense**  
    *Before Update:*
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/4c13da41-5f86-49e2-b117-8feafad7812c" />

    *Update Response:*
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/94bc4285-a716-4391-baf3-da758fd856a0" />

    *After Update:*
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/2871a43b-5b85-43a5-998b-14dc75a47b9d" />

6.  **Summary Report**
    <img width="1145" height="417" alt="image" src="https://github.com/user-attachments/assets/73665de0-2c49-49a4-aac5-3ce7ad0006b2" />

7.  **Validation Error**
    <img width="1145" height="324" alt="image" src="https://github.com/user-attachments/assets/d7e94976-8b14-44e8-a977-9d2ad4fdd614" />
