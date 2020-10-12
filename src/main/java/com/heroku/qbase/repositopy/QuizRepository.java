package com.heroku.qbase.repositopy;

import com.heroku.qbase.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    @Query(value = "" +
            "SELECT * " +
            "FROM quiz " +
            "WHERE right_answer > 0 " +
            "ORDER BY random() " +
            "LIMIT 1;", nativeQuery = true)
    Quiz findRandomQuizWithRightAnswer();

}
