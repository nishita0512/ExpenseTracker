package com.example.expenseTracker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class CategoryAmount{
    private ExpenseCategoryEnum category;
    private Long totalAmount;
}

