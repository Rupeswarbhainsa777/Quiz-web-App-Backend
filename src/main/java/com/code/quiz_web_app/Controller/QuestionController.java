package com.code.quiz_web_app.Controller;

import com.code.quiz_web_app.Questions;
import com.code.quiz_web_app.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired
     QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Questions> getAll(){
        return questionService.getAllQuestion();
    }
}
