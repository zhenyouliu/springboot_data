package local;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class TestBean {
    @PostConstruct
    public void init(){
        System.out.println("TestBean创建完成");
    }

}
