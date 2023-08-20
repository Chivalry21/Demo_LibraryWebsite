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
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String cardNumber;
    private String dateStart;
}
