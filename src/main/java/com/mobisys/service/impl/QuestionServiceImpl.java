package com.mobisys.service.impl;

import com.mobisys.pojo.Question;
import com.mobisys.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zf
 * @date 2022/5/11 1:24 PM
 * @description:
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Override
    public List<Question> getTopQuestion(String appID, String userID, int days, String type, int top, String t1, String t2) {


        List<Question> questions = new ArrayList<>();
        Question question = new Question(1, "hello", 2);
        questions.add(question);

        return questions;
    }
}
