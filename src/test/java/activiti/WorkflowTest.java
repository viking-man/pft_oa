package activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/28-18:11
 */
public class WorkflowTest {

    @Resource
    private ProcessEngine processEngine;

    @Test
    public void testDeploy() throws Exception {
        RepositoryService repositoryService = processEngine.getRepositoryService();
        ProcessDefinition processDefinition = repositoryService.getProcessDefinition("myProcess_1:1:7504");
        System.out.println(processDefinition.getDiagramResourceName());
    }

    public static void main(String[] args) {
        // 1.创建Activiti配置对象的实例
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration();
        // 2.设置数据库连接信息

        // 设置数据库地址
        configuration
                .setJdbcUrl("jdbc:mysql://127.0.0.1:3306/pft_oa");
        // 数据库驱动
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        // 用户名
        configuration.setJdbcUsername("root");
        // 密码
        configuration.setJdbcPassword("pft");

        // 设置数据库建表策略
        /**
         * DB_SCHEMA_UPDATE_TRUE：如果不存在表就创建表，存在就直接使用
         * DB_SCHEMA_UPDATE_FALSE：如果不存在表就抛出异常
         * DB_SCHEMA_UPDATE_CREATE_DROP：每次都先删除表，再创建新的表
         */
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        // 3.使用配置对象创建流程引擎实例（检查数据库连接等环境信息是否正确）
        ProcessEngine processEngine = configuration.buildProcessEngine();

        RepositoryService service = processEngine.getRepositoryService();
        ProcessDefinition processDefinition = service.getProcessDefinition("myProcess_1:1:7504");
        System.out.println(processDefinition.getName());
    }
}
