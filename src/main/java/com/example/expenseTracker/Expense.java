package com.example.expenseTracker;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
@Getter
@Setter
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    private Long amount;

    private Date date;

    private String note;

    @Enumerated(EnumType.STRING)
    private ExpenseCategoryEnum category;

}
