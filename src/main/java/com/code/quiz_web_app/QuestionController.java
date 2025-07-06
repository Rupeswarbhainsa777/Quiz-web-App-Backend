package com.code.quiz_web_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @GetMapping("allQuestions")
    public  String getAll(){
        return "Hii Rojalin   sdf  sdv";
    }
}
