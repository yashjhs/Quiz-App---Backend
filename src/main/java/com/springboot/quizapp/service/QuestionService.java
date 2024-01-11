package com.springboot.quizapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.quizapp.model.Question;

@Service
public interface QuestionService {

	List<Question> getAllQuestions();

	List<Question> getQuestionByCategory(String category);

	String addQuestion(Question question);

	void deleteQuestionById(Integer id);

	


}
