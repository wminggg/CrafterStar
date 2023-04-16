package com.crafterstar.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: WMING
 * @Description: 课程查询参数Dto
 */

@Data
@ToString
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}
