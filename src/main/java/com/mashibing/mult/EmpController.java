package com.mashibing.mult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {

    @GetMapping("/selectEmp")
    @DataSource(value = DataSourceType.LOCAL)
    public String selectEmp(){
        return "ok";
    }

}