package com.mobisys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zf
 * @date 2022/5/11 1:30 PM
 * @description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    public int q;   // 问题总数
    public String question;     // 问题
    public int rank;       // 总数排名
}
