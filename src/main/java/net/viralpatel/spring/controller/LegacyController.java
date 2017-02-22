package net.viralpatel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sajit.kunnumkal on 2/21/2017.
 */
@Controller
public class LegacyController {

    @RequestMapping(name = "/welcome",method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
}
