package com.cys.day09;

import java.util.ArrayList;
import java.util.Collections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 第二题: 有如下员工信息： 姓名：张三，工资：3000 姓名：李四，工资：3500 姓名：王五，工资：4000 姓名：赵六，工资：4500 姓名：田七，工资：5000
 * 先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作： 1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五” 2、判断是否有姓名为“赵六”的员工，如果有，将其删除
 * 3、给姓名为“田七”的员工，涨500工资
 */
public class Test2 {
  public static void main(String[] args) {
    Employee employee = new Employee("张三", 3000);
    Employee employee1 = new Employee("李四", 3500);
    Employee employee2 = new Employee("王五", 4000);
    Employee employee3 = new Employee("赵六", 4500);
    Employee employee4 = new Employee("田七", 5000);
    ArrayList<Employee> employees = new ArrayList<>();
    Collections.addAll(employees, employee, employee1, employee2, employee3, employee4);
    for (int i = 0; i < employees.size(); i++) {
      if (employees.get(i).getName().contains("王五")) {
        employees.get(i).setName("王小五");
      }
      if (employees.get(i).getName().contains("赵六")) {
        employees.remove(i);
        i--;
      }
      if (employees.get(i).getName().contains("田七")) {
        employees.get(i).setSalary(employees.get(i).getSalary() + 500);
      }
    }
    System.out.println(employees);
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
  private String name;
  private int salary;
}
