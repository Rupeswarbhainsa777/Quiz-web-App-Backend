package com.code.quiz_web_app.model;

import lombok.Data;

@Data
public class QuestionWrapper {



    private Integer id;
    private String category;
    private String questionTittle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(Integer id, String questionTittle, String option1, String option2, String option3, String option4) {
        this.id = id;

        this.questionTittle = questionTittle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
