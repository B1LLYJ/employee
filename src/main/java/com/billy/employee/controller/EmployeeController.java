package com.billy.employee.controller;

import com.billy.employee.POJO.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */

@RestController
@RequestMapping("/spring-rest")
public class EmployeeController {

    private Employee employee;
}
