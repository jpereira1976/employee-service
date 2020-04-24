package uy.edu.um.employeeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/")
    public List<Employee> employees() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        List<Employee> employees = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test2020", "root", "geocom")) {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee");
            while (rs.next())
                employees.add(new Employee(rs.getString("ssn"),
                        rs.getString("name") ,
                        rs.getInt("age")));

        }
        return employees;
    }
}
