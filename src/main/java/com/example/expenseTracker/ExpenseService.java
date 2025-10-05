package com.example.expenseTracker;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public Iterable<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long expenseId){
        return expenseRepository.findById(expenseId).orElse(null);
    }

    public void deleteExpenseById(Long expenseId){
        expenseRepository.deleteById(expenseId);
    }

    public Iterable<Expense> getAllExpensesByCategory(ExpenseCategoryEnum categoryEnum){
        return expenseRepository.getAllExpensesByCategory(categoryEnum);
    }

    public Iterable<Expense> getAllExpensesByMonth(Integer month){
        return expenseRepository.getAllExpensesByMonth(month);
    }

    public List<CategoryAmount> getSummary(){
        return expenseRepository.getSummary();
    }
}
