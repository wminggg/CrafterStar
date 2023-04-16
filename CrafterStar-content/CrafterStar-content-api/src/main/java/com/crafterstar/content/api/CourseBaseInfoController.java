package com.crafterstar.content.api;

import com.crafterstar.base.model.PageParams;
import com.crafterstar.base.model.PageResult;
import com.crafterstar.model.dto.QueryCourseParamsDto;
import com.crafterstar.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WMING
 * @Description: 课程信息编辑接口
 */

@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false )  QueryCourseParamsDto queryCourseParamsDto) {
        return null;
    }
}