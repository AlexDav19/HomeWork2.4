package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
