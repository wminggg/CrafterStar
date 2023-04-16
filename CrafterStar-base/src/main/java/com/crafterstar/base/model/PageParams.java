package com.crafterstar.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: WMING
 * @Description: 分页查询、分页参数
 */

//'@Data'是 Lombok 提供的注解，它可以自动为类生成 getter/setter、equals、hashCode、toString 方法等常用方法。
//使用 @Data 注解可以减少手写这些方法的代码量，提高开发效率。
@Data
//'@ToString'是 Lombok 提供的另一个注解，它可以自动生成类的 toString 方法，用于打印对象时输出对象的各个字段值。
//使用 @ToString 注解可以使得打印对象时输出的信息更加详细、清晰。
@ToString
public class PageParams {
    //当前页码
    private Long pageNo = 1L;
    //每页显示记录数
    private Long pageSize = 30L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}