package org.yjq.aigou.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yjq.aigou.AjaxResult;
import org.yjq.aigou.domain.Employee;

@RestController
public class LoginController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功");
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名和密码错误");
    }
}
