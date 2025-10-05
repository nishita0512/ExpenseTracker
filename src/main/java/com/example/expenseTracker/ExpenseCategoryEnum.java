package com.example.expenseTracker;

public enum ExpenseCategoryEnum {
    FOOD, TRAVEL, BILLS;
    public String getCategory(){
        return this.toString();
    }
}
