package edu.wctc.controller;

import edu.wctc.hibernate.Entity.Race;
import edu.wctc.hibernate.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private RaceService raceService;

    @RequestMapping("/")
    public String showHomePage(Model theModel){
        List<Race> raceList = raceService.getRaces();

        theModel.addAttribute("races", raceList);

        return "index";
    }
}
