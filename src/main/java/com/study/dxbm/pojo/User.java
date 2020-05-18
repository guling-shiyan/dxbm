package com.study.dxbm.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

/**
 * @Author 古陵逝烟
 * @Date 2020/5/15 16:55
 * @Description
 * @Version V1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Min(5)
    private String name;
    @Min(5)
    private String aget;
    @JSONField(format = "yyyy年MM月dd日")
    private Date birthDay;
    private List<String> qqList;
}
