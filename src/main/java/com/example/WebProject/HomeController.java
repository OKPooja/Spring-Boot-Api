package com.example.WebProject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody (Agar upar RestController nahi add kiya toh ye annotation add karna padega
    //So it expects that we will return a page like html page, etc but we are just building backend here
    //so we will have to tell ki okay we are just sending data isliye ye 2 annotations(RestController and ResponseBody)
    public String greet() {
        return "Welcome to the Home Page";
    }
}
