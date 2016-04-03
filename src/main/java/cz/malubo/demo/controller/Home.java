package cz.malubo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @Autowired
    private ApplicationContext appContext;

    @RequestMapping("/")
    public String index(Model model) {
        EmployeeController controller = (EmployeeController) this.appContext.getBean("employeeController");
        model.addAttribute("employee", controller.createNewEmployee().toString());
        return "index";
    }
}
