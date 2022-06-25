package com.work.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * 用户实体
 *
 * shiYang
 * 2022/6/25 20:11
 * VERSION:1.0.0
 */
@Data
@Document(indexName = "user")
public class User implements Serializable {

    @Id
    private String id;

    private String username;

    private String password;
}
