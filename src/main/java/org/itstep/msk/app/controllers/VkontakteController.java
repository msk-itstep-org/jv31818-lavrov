package org.itstep.msk.app.controllers;

import org.itstep.msk.app.services.EventManagerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Controller
@RequestMapping("v1/users")
public class VkontakteController {
    private String code;

    @Autowired
    private EventManagerApi eventManagerService;

    @GetMapping(value = "/signin")
    @SuppressWarnings("PMD.SystemPrintln")
    public String vkLogin() throws IOException, InterruptedException, ExecutionException {
        eventManagerService.createUser();

        return "index";
    }

    // todo
    @GetMapping(value = "/oauthcode")
    public String callbackPage(@RequestParam String code){
        this.code = code;
        System.out.println("the code from vk is : " + code);
        return "callback";
    }

    @GetMapping(value = "/")
    public ModelAndView mainPage(){
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}