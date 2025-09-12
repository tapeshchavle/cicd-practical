package demo_project.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot 🚀 ";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name){
        return "Welcome Back .... "+name;
    }
    @GetMapping("/date")
    public Date todayDate(){
        return new Date();
    }
}
