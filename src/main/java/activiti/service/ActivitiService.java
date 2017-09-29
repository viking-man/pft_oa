package activiti.service;

import activiti.entity.DeploymentEntity;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-14:10
 */
@Service
public class ActivitiService {

    private static ProcessEngine processEngine;

    @PostConstruct
    private ProcessEngine getProcessEngine() {
        if (processEngine == null) {
            ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
            return configuration.buildProcessEngine();
        } else {
            return processEngine;
        }
    }

    public List<DeploymentEntity> getDeplotments() {
        RepositoryService repositoryService = processEngine.getRepositoryService();
//        repositoryService.getDeploymentResourceNames()
        return null;
    }
}
