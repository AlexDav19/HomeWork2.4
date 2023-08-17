package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String main(){
        return "<a href=\"http://localhost:8080/calculator\"> Калькулятор </a>";
    }

}
