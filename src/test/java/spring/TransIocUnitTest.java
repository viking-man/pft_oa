package spring;

import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-19:29
 */
@Transactional(transactionManager = "transactionManager")
@Rollback(true)
public class TransIocUnitTest extends IocUnitTest {

}
