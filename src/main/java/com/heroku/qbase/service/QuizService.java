package com.heroku.qbase.service;

import com.heroku.qbase.entity.Quiz;
import com.heroku.qbase.repositopy.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz findById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz findById(String id) {
        return findById(Long.parseLong(id));
    }

    public Quiz getRandomQuizWithRightAnswer() {
        return quizRepository.findRandomQuizWithRightAnswer();
    }

    public Quiz getRandomQuiz() {
        return quizRepository.findRandomQuiz();
    }

}
