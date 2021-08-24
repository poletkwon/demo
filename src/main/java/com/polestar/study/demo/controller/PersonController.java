package com.polestar.study.demo.controller;

import com.polestar.study.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/polestar")
public class PersonController {

    @GetMapping
    public String getName(Model model){

        Person person = new Person();

        person.setName("나는태우다");
        person.setMessage("나는 권태우다 아하");
        person.setMessage("나는 권태우다아아아 하하하");

        ArrayList<String> list = new ArrayList<>();
        list.add("야호");
        list.add("22222222");
        list.add("33333333");
        list.add("44444444");
        list.add("55555555");
        list.add("66666666");


        model.addAttribute("person", person);
        model.addAttribute("list", list);



        return "index_v2";
     }
}
