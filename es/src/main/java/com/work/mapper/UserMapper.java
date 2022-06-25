package com.work.mapper;

import com.work.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户数据库层
 *
 * shiYang
 * 2022/6/25 20:11
 * VERSION:1.0.0
 */
@Repository
public interface UserMapper extends ElasticsearchRepository<User, String> {


}
