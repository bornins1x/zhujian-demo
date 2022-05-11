package com.mobisys.controller;

import com.mobisys.commons.BaseRespBean;
import com.mobisys.commons.RespBeanFactory;
import com.mobisys.commons.RespStateCode;
import com.mobisys.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zf
 * @date 2022/5/11 1:18 PM
 * @description:
 */

@RestController
public class questionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/api/v1/stats/question")
    public BaseRespBean getTopQuestion(@RequestHeader(value = "X-AppID", required = true) String AppID,
                                       @RequestHeader(value = "X-UserID", required = true) String UserID,
                                       @RequestParam(value = "days", required = false) int days,
                                       @RequestParam(value = "type", required = true) String type,
                                       @RequestParam(value = "top", required = true) int top,
                                       @RequestParam(value = "t1", required = true) String t1,
                                       @RequestParam(value = "t2",required = true) String t2){

        // 判断 UserID 是否有效
        if (!UserID.equals("123")) {
            return RespBeanFactory.error(
                    RespStateCode.UNAUTHORIZED_ERROR.getCode(), RespStateCode.UNAUTHORIZED_ERROR.getMsg()
            );
        }


        return RespBeanFactory.succeed(
                questionService.getTopQuestion(AppID, UserID, days, type, top, t1, t2)
        );
    }

}
