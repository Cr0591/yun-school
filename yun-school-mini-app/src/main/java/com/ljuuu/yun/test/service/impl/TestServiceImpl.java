package com.ljuuu.yun.test.service.impl;

import com.ljuuu.yun.test.Test;
import com.ljuuu.yun.test.mapper.TestMapper;
import com.ljuuu.yun.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> quertAll() {
        return testMapper.queryAll();
    }
}
