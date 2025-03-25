package org.example.employeecruddemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.employeecruddemo.entity.Employee;
import org.example.employeecruddemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping("/")
    public String index(){
        return "redirect:/employees";
    }
    @GetMapping("/employees")
    public String listAllEmployees(Model model){
        model.addAttribute("employees",employeeService.findAll());
        return "employees";
    }
    //first face --> 1. form object 2. form view
    @GetMapping("/create-employee")
    public String employeeForm(Model model){
        model.addAttribute("employee",new Employee());
        return "employeeForm";
    }
    //second face - validation, convertion, save
    @PostMapping("/save-employee")
    public String saveEmployee(Employee employee, BindingResult result){
        if(result.hasErrors()){
            return "employeeForm";
        }
        employeeService.save(employee);
        return "redirect:/employees";
    }
}
