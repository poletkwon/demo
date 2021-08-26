package com.polestar.study.demo.controller.api;

import com.polestar.study.demo.model.Person;
import com.polestar.study.demo.model.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/apiController")
public class apiController {

    @Autowired
    private PersonService personService;

    @GetMapping("/test")
    public Person getTest(Model model) {

        Person person = new Person();

        person = personService.selectPerson();

        person.setName("나는태우다");
        person.setMessage("나는 권태우다 아하");
        person.setMessage("나는 권태우다아아아 하하하 3333");
        person.setMessage("여기는 @GetMapping /apiController/test 이다!!");

        ArrayList<String> list = new ArrayList<>();
        list.add("야호");
        list.add("22222222");
        list.add("33333333");
        list.add("44444444");
        list.add("55555555");
        list.add("66666666");


        model.addAttribute("person", person);
        model.addAttribute("list", list);


        return person;
    }

    @GetMapping("/getParameter")
    public Person getParameter(@RequestParam("id") String id, @RequestParam ("name") String name){



        System.out.println("id : " + id);
        System.out.println("name : " + name);

        Person person = new Person();

        person.setName(id);
        person.setMessage(name);

        person.setName("고양이다 고양이다!!");
        person.setMessage("야옹야옹이 아니라 냐옹냐옹이다.");



        return person;
    }
}
