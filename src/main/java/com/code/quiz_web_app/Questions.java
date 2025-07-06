package com.code.quiz_web_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String category;
    private String questionTittle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private  String rightAnswer;
    private String difficultylevel;


}
