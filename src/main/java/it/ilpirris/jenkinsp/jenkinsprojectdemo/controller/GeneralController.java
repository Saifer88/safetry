package it.ilpirris.jenkinsp.jenkinsprojectdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController
{

    
    @RequestMapping(value="/versione")
    public String getVersion()
    {
        return "version no+ asdasd asdasdasd byjenk";
    }
}