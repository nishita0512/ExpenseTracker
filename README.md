
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

3.  **Open the ExpenseTrackerApplication (path: expenseTracker/src/main/java/com/example/expenseTracker/) :**

4. **Click the green run button**

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
    <img width="1144" height="315" alt="image" src="https://github.com/user-attachments/assets/ea8d20d1-042a-4362-ad29-5d702f735ccf" />


2.  **Get All Expenses**
    <img width="1145" height="434" alt="image" src="https://github.com/user-attachments/assets/49755e34-aef5-487d-b175-c3ef19fa5793" />


3.  **Get Expenses by Month**
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/1fb52812-0a05-4c29-86af-816748869183" />


4.  **Update Expense**  
    *Before Update:*
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/1d85cf8e-2df5-4146-a548-8f7e6eb8d03a" />

    *Update Response:*
    <img width="1145" height="290" alt="image" src="https://github.com/user-attachments/assets/5c44690e-b8ab-4fbd-809b-eabb4bd9738d" />


    *After Update:*
    <img width="1145" height="262" alt="image" src="https://github.com/user-attachments/assets/1acc39fd-3cd4-464d-b9f3-761f80e6b391" />


6.  **Summary Report**
    <img width="1145" height="417" alt="image" src="https://github.com/user-attachments/assets/d3593916-c6a7-466f-9fc0-afcb14ab06e9" />


7.  **Validation Error**
    <img width="1145" height="324" alt="image" src="https://github.com/user-attachments/assets/b1101a66-d483-4bf0-be21-36d63e2e88d5" />
