package com.springboot.quizapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.springboot.quizapp.model.QuestionWrapper;
import com.springboot.quizapp.model.Response;

@Service
public interface QuizService {

	ResponseEntity<String> createQuiz(String category, int noOfQuestions, String title);

	ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id);

	ResponseEntity<Integer> calculateresult(Integer id, List<Response> responses);

}
