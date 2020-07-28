package cn.kk.controller;

import cn.kk.domain.User;
import cn.kk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String userList(User user, Model model){
        List<User> users = userService.getUserList(user);
        model.addAttribute("users",users );
        model.addAttribute("tom","kk");
        System.out.println("hello list users 用户");
        return "index";
    }

    @RequestMapping("/add")
    public String addUser(User user){

        userService.saveUser(user);
        return "redirect:list";
    }
}
