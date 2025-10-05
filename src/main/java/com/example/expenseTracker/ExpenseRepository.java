package com.example.expenseTracker;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    public Iterable<Expense> getAllExpensesByCategory(ExpenseCategoryEnum categoryEnum);

    @Query("SELECT e from Expense e WHERE MONTH(e.date)=:month")
    public Iterable<Expense> getAllExpensesByMonth(@Param("month") Integer month);

    //food: Rs. 100
    //travel: Rs. 1000
    //bills: Rs. 2000
    @Query("SELECT new com.example.expenseTracker.CategoryAmount(e.category, SUM(e.amount)) from Expense e GROUP BY e.category")
    public List<CategoryAmount> getSummary();

}
