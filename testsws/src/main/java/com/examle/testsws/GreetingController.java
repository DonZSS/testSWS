package com.examle.testsws;

import com.examle.testsws.domain.User;
import com.examle.testsws.repos.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private UserRepos userRepos;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<User> users = userRepos.findAll();
        model.put("users", users);
        return "main";
    }

    @PostMapping
    public String adduser(@RequestParam(required = false) String email, @RequestParam(required = false) String surname, @RequestParam(required = false) String name,
                          @RequestParam(required = false) String patronymic, @RequestParam(required = false) String telephone, Map<String, Object> model) {
        User user = new User(email, surname, name, patronymic, telephone);
        userRepos.save(user);
        Iterable<User> users = userRepos.findAll();
        model.put("users", users);
        return "main";
    }

}
