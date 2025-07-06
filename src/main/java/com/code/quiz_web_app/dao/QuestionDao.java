package com.code.quiz_web_app.dao;

import com.code.quiz_web_app.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Questions,Integer> {

}
