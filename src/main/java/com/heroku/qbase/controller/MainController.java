package com.heroku.qbase.controller;

import com.heroku.qbase.entity.Quiz;
import com.heroku.qbase.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/")
    String home() {
        return "Quiz database";
    }

    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable String id) {
        return quizService.findById(id);
    }

    @GetMapping("/random")
    public Quiz getRandomQuiz() {
        return quizService.getRandomQuiz();
    }

    @GetMapping("/randomWithAnswer")
    public Quiz getRandomQuizWithRightAnswer() {
        return quizService.getRandomQuizWithRightAnswer();
    }

}
