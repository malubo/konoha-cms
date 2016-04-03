package cz.malubo.demo.controller;

import cz.malubo.demo.dto.EmployeeDTO;
import cz.malubo.demo.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("employeeController")
public class EmployeeController
{
    @Autowired
    private EmployeeManager manager;

    public EmployeeDTO createNewEmployee()
    {
        return manager.createNewEmployee();
    }
}