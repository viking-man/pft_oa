package activiti.controller;

import activiti.entity.LeaveEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import param.ApiResponseBody;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-11:37
 */
@RestController
@RequestMapping("/activiti")
public class ActivitiController {

    @RequestMapping("/getDeployments.do")
    @ResponseBody
    public ApiResponseBody getDeployments() {
        return null;
    }

    @RequestMapping("/leave.do")
    @ResponseBody
    public ApiResponseBody leave(LeaveEntity leave) {
        return null;
    }
}
