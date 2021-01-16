package com.heroku.qbase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "subject")
    private String subject;
    @Column(name = "sub_subject")
    private String subSubject;
    @Column(name = "topic")
    private String topic;
    @Column(name = "original_question_number")
    private Integer originalQuestionNumber;
    @Column(name = "question")
    private String question;
    @Column(name = "answer_1")
    private String answer1;
    @Column(name = "answer_2")
    private String answer2;
    @Column(name = "answer_3")
    private String answer3;
    @Column(name = "answer_4")
    private String answer4;
    @Column(name = "answer_5")
    private String answer5;
    @Column(name = "right_answer")
    private Integer rightAnswer;
    @Column(name = "one_answer")
    private Boolean oneAnswer;
    @Column(name = "description", length = 1024)
    private String description;
    @Column(name = "link_1", length = 1024)
    private String link1;
    @Column(name = "link_2", length = 1024)
    private String link2;
    @Column(name = "link_source", length = 1024)
    private String linkSource;

}
