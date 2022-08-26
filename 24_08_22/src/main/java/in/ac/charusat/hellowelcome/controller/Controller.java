package in.ac.charusat.hellowelcome.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="https://app-dummy123.herokuapp.com")
public class Controller {

    @Autowired


    @GetMapping
    public String displayWelcomeMessage(){
        return "<h1> Welcome user </h1>";
    }
    @GetMapping("/hello")
    public String displayHelloMessage()
    {
        return "<h1> hello chintan </h1>";
    }

    @GetMapping("/Welcome")
    public String displayWMessage()
    {
        return "<h1> Welcome jd </h1>";
    }
}
