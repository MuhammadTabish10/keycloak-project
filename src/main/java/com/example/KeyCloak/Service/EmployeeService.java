package com.example.KeyCloak.Service;

import com.example.KeyCloak.model.Employee;
import com.example.KeyCloak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

//    @PostConstruct
//    public void initializeEmployeeTable(){
//        employeeRepository.saveAll(
//                Stream.of(
//                        new Employee(1L,"Asim",90000.00),
//                        new Employee(2L,"Basim",100000.00),
//                        new Employee(3L,"Haniya",70000.00)
//                ).collect(Collectors.toList()));
//    }

    public Employee getEmployeeById(Long id){
        return employeeRepository
                .findById(id)
                .orElse(null);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository
                .findAll();
    }
}
