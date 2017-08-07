package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by dengry on 2016/12/1.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
