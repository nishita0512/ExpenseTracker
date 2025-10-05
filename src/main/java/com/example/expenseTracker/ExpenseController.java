package com.example.expenseTracker;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense){
        return expenseService.saveExpense(expense);
    }

    @PutMapping
    public Expense updateExpense(@RequestBody Expense expense){
        return expenseService.saveExpense(expense);
    }

    @GetMapping
    public Iterable<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{expenseId}")
    public Expense getExpenseById(@PathVariable Long expenseId){
        return expenseService.getExpenseById(expenseId);
    }

    @DeleteMapping("/{expenseId}")
    public void deleteUser(@PathVariable Long expenseId){
        expenseService.deleteExpenseById(expenseId);
    }

    @GetMapping("/category")
    public Iterable<Expense> getAllFoodExpenses(@RequestParam ExpenseCategoryEnum category){
        return expenseService.getAllExpensesByCategory(category);
    }

    @GetMapping("/month")
    public Iterable<Expense> getAllFoodExpenses(@RequestParam Integer month){
        return expenseService.getAllExpensesByMonth(month);
    }

    @GetMapping("/summary")
    public List<CategoryAmount> getSummary(){
        return expenseService.getSummary();
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorResponse handleException(HttpMessageNotReadableException httpMessageNotReadableException) {
        return new ErrorResponse(HttpStatus.BAD_REQUEST, httpMessageNotReadableException.getMessage());
    }
}
