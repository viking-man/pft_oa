package test;

import oa.user.entity.UserTestEntity;
import oa.user.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.TransIocUnitTest;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-19:25
 */
public class MybatisTest extends TransIocUnitTest {

    @Resource
    private IUserService userService = null;


//    @Test
//    public void test1() {
//        UserTestEntity user = userService.(1);
//        System.out.println(user.getUserName());
//        logger.info("值：" + user.getUserName());
//    }
//
//    @Test
//    public void testInsert() {
//        UserTestEntity userTestEntity = new UserTestEntity();
//        userTestEntity.setAge(1);
//        userTestEntity.setPassword("test");
//        userTestEntity.setUserName("test");
//        userService.insert(userTestEntity);
//    }
}
