package com.example.BookstoreAPI.model;

import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Double price;
    private String isbn;
    private LocalDate publishedDate;

}
