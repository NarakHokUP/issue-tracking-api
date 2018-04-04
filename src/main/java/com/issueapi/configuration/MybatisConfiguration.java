package com.issueapi.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.issueapi.repository")
public class MybatisConfiguration {

}
