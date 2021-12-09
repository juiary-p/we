package com.juhee.we.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConnectionTests {
    private Logger logger = LoggerFactory.getLogger(ConnectionTests.class);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void mapper_test(){
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            String sysdate = sqlSession.selectOne("test.selectTest");
            logger.info("*********** [sysdate] *********** : "+sysdate);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
