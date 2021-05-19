package io.siva.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class EntityCalc {

    @Id
    @GeneratedValue
    private long sno;
    private String emp;
    private double salary;
    private double net_sal;

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNet_sal() {
        return net_sal;
    }

    public void setNet_sal(double net_sal) {
        this.net_sal = net_sal;
    }
    public EntityCalc() {
    }

    public EntityCalc(String emp,double salary,double net_sal) {
        this.emp = emp;
        this.salary = salary;
        this.net_sal=net_sal;


    }

    public EntityCalc(String emp,double salary) {
        this.emp = emp;
        this.salary = salary;

    }
}
