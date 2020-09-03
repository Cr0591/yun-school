package com.ljuuu.yun.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ljuuu.yun.**.mapper*")
public class MybatisConfig {
}
