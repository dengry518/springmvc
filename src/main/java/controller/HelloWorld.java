package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by dengry on 2016/12/1.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRest(@PathVariable("id") int id) {
        System.out.println(id);
        return "hello";
    }
}
