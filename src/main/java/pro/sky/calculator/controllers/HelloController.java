package pro.sky.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.services.HelloService;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping (path = "/calculator")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping
    public String main() {
        return helloService.main();
    }
}
