package com.blogapp.blogapp.entities;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(

        name="posts",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}


)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="description", nullable = false)
    private String description;


    @Column(name="content", nullable = false)
    private String content; // 255 characters

}