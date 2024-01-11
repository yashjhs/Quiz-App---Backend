package com.springboot.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.quizapp.dao.QuestionDao;
import com.springboot.quizapp.model.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDao questionDao;
	
	@Override
	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	@Override
	public List<Question> getQuestionByCategory(String category) {
		return questionDao.findByCategory(category);
	}

	@Override
	public String addQuestion(Question question) {
		questionDao.save(question);
		return "success";
	}

	@Override
	public void deleteQuestionById(Integer id) {
		questionDao.deleteById(id);
	}

	

}
