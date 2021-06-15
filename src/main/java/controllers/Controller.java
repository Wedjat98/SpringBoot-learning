package controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller+@ResponseBody
@RequestMapping("/hello")
public class Controller {
    @RequestMapping("/world")
    public String SayHi(){
        return "hello springboot";
    }
}
