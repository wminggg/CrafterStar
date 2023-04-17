package com.CrafterStar.content.api;

import com.CrafterStar.base.model.PageParams;
import com.CrafterStar.base.model.PageResult;
import com.CrafterStar.model.dto.QueryCourseParamsDto;
import com.CrafterStar.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: WMING
 * @Description: 课程信息编辑接口
 */

@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {

    @ApiOperation("课程查询接口")
    @GetMapping ("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required=false) QueryCourseParamsDto queryCourseParamsDto){

        return null;
    }
}
