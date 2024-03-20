package com.anuj.SpringBootDataJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    private Integer bookId;

    private String bookName;

    private Double bookPrice;
}

/*
* if your Class name and Table are Diff then @Table(name="Name of Table") is mandatory
* otherwise no need to use this table.
* @Id-> it is used to declare primary key
* */
