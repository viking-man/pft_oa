package test;

import oa.employee.user.entity.UserEntity;
import oa.employee.user.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import spring.IocUnitTest;
import spring.TransIocUnitTest;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-19:25
 */
@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MybatisTest {

    private static Logger logger = Logger.getLogger(MybatisTest.class);

    @Resource
    private IUserService userService = null;

    @BeforeTransaction
    public void before() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService = (IUserService) ac.getBean("userService");
    }

    @Test
    public void test1() {
        UserEntity user = userService.fetchById(1);
        System.out.println(user.getUsername());
        logger.info("值：" + user.getUsername());
    }
}
