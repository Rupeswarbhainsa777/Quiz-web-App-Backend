package com.code.quiz_web_app.Service;

import com.code.quiz_web_app.Questions;
import com.code.quiz_web_app.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Questions> getAllQuestion() {
       return questionDao.findAll();


    }
}
