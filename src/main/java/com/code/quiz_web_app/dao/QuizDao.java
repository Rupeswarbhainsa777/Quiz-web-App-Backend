package com.code.quiz_web_app.dao;

import com.code.quiz_web_app.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
