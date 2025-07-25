package com.code.quiz_web_app.dao;

import com.code.quiz_web_app.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
 List<Question> findByCategory(String category);

 @Query(value = "SELECT * FROM question q where q.category=:category ORDER BY RANDOM() LIMIT : numQ",nativeQuery = true)
 List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
