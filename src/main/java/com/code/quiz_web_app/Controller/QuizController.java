package com.code.quiz_web_app.Controller;

import com.code.quiz_web_app.Service.QuizService;
import com.code.quiz_web_app.model.Question;
import com.code.quiz_web_app.model.QuestionWrapper;

import com.code.quiz_web_app.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

     @Autowired
     QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(
            @RequestParam String category,
            @RequestParam int numQ,
            @RequestParam String title
    ){
        return  quizService.createQuiz(category,numQ,title);

    }
    @GetMapping("get/{id}")
    public  ResponseEntity<List<QuestionWrapper>> getQuestions(@PathVariable Integer id){
        return  quizService.getQuizQuestions(id);


    }

    @PostMapping("submit/{id}")
     public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id,responses);
    }








}
