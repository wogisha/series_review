package cs544.week2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wogisha on 08/08/2017.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String defaultPage(){
        return "redirect:/series";
    }

    @RequestMapping("*")
    public String notFoundPage(){
        return "not_found";
    }
}
