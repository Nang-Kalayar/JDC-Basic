package org.example.employeecruddemo.service;

import lombok.RequiredArgsConstructor;
import org.example.employeecruddemo.dao.EmployeeDao;
import org.example.employeecruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public void save(Employee employee) {
        employeeDao.save(employee);
    }
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
    public Employee findById(int id) {
        return employeeDao.findById(id).orElse(null);
    }
    public void deleteById(int id) {
        if(employeeDao.existsById(id)){
            employeeDao.deleteById(id);
        }
        else {
            throw new RuntimeException("Employee not found");
        }

    }
}
