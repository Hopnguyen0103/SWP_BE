package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Feedback {
    private int feedbackId;
    private Product product;
    private User  user;
    private String content;
    private Date date;
}
