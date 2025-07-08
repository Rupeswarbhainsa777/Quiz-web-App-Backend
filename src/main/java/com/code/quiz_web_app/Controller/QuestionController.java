package com.code.quiz_web_app.Controller;

import com.code.quiz_web_app.model.Question;
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
    public ResponseEntity<List<Question>> getAll(){
        return questionService.getAllQuestion();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>>  getQuestionsByCategory(@PathVariable String category){
        return  questionService.getQuestionByCategory(category);

    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question questions){
       return questionService.addQuestion(questions);
    }
}
