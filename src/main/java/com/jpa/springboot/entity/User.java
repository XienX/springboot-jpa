package com.jpa.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类（和数据包映射的类）
@Table(name = "tb1_user") //指定和哪个表对应，若省略默认表名为类名
public class User {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Integer id;

    @Column(name = "last_name", length = 50) //这是和数据表对应的一个列
    private String lastName;

    @Column //省略，默认列名就是属性名
    private String email;
}
