package com.example.demo_schoolwebsite.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Checkout {
    @Id
    @ManyToOne
    private Book book;
    private boolean returned;
    private String dueDate;



}
