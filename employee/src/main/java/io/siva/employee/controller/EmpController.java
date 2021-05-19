package io.siva.employee.controller;



import io.siva.employee.entity.EntityCalc;
import io.siva.employee.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping
public class EmpController {

    @Autowired
    EmpRepo empRepo;

    @ResponseBody
    @RequestMapping("/calc")
    public int Calc(EntityCalc entityCalc) {
        double net_sal=0;
        if (entityCalc.getSalary() >= 250000) {
            net_sal = entityCalc.getSalary()-(entityCalc.getSalary() * 20 / 100);

        }
        else if (entityCalc.getSalary() >= 600000)
        {
            net_sal= entityCalc.getSalary()-(entityCalc.getSalary() * 30 / 100);


        }
        EntityCalc calc =new EntityCalc(entityCalc.getEmp(),entityCalc.getSalary(),net_sal);
        empRepo.save(calc);


        return (int) net_sal;

//        @RequestParam double salary,@RequestParam String emp

    }
    @RequestMapping("/home")
    public String home()
    {

        return "index";
    }
}
