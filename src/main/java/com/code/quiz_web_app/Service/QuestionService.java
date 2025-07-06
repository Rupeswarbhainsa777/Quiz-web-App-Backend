package com.code.quiz_web_app.Service;

import com.code.quiz_web_app.Questions;
import com.code.quiz_web_app.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Questions>> getAllQuestion() {
       try {
           return  new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
       }
       catch (Exception e){
           e.printStackTrace();
       }
        return new  ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);


    }

    public ResponseEntity<List<Questions>> getQuestionByCategory(String category) {
      try {
          return  new ResponseEntity<>( questionDao.findByCategory(category),HttpStatus.OK);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
        return  new ResponseEntity<>( new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }


    public ResponseEntity<String> addQuestion(Questions questions) {

        questionDao.save(questions);
        return new  ResponseEntity<>("success",HttpStatus.OK);
    }
}
