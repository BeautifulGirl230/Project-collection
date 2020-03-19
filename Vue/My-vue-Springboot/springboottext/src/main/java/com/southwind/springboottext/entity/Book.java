package com.southwind.springboottext.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    //使Book通过类名绑定数据库
@Data   //自动生成各种各样的get方法
//创建一个实体类
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //设置自动获取id
    private Integer id;
    private String name;
    private String author;
}
