package com.code.quiz_web_app.Controller;

import com.code.quiz_web_app.Questions;
import com.code.quiz_web_app.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired
     QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAll(){
        return questionService.getAllQuestion();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>>  getQuestionsByCategory(@PathVariable String category){
        return  questionService.getQuestionByCategory(category);

    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Questions questions){
       return questionService.addQuestion(questions);
    }
}
