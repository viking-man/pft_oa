package oa.department.controller;

import oa.department.entity.DepartmentEntity;
import oa.department.service.DepartmentService;
import oa.department.service.DepartmentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-16:12
 */
@Controller
@RequestMapping("/oa/department")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;


    @RequestMapping("/query.do")
    public String query(Model model) {
        List<DepartmentEntity> departments = departmentService.queryAll();
        model.addAttribute("departments", departments);
        return "/oa/department/query";
    }
}
