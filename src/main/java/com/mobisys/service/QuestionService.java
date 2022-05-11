package com.mobisys.service;

import com.mobisys.pojo.Question;

import java.util.List;

/**
 * @author zf
 * @date 2022/5/11 1:22 PM
 * @description:
 */


public interface QuestionService {

    List<Question> getTopQuestion(String appID, String userID, int days, String type, int top, String t1, String t2);
}
