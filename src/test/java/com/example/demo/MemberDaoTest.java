package com.example.demo;

import com.example.demo.dao.MemberMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MemberDaoTest {
    @Autowired
    private MemberMapper memberDao;
}
