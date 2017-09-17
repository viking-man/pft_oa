package oa.user.department.controller;

import oa.user.department.dao.DepartmentDao;
import oa.user.department.entity.DepartmentEntity;
import oa.user.department.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-16:12
 */
@Controller
@RequestMapping("/oa/department/")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;


    @RequestMapping("query.do")
    public String query(Model model) {
        List<DepartmentEntity> departments = departmentService.queryAll();
        model.addAttribute("departments", departments);
        return "/oa/department/query";
    }
}
