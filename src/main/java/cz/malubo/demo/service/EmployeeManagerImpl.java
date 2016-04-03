package cz.malubo.demo.service;

import cz.malubo.demo.dto.EmployeeDTO;
import cz.malubo.demo.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager
{
    @Autowired
    private EmployeeDAO dao;

    public EmployeeDTO createNewEmployee()
    {
        return dao.createNewEmployee();
    }
}
