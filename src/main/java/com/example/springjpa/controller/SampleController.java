package com.example.springjpa.controller;

import com.example.springjpa.domain.TestDomain;
import com.example.springjpa.repository.TestDomainRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class SampleController {

    @Autowired
    TestDomainRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        log.info("hello world!");
        model.addAttribute("list", repository.findAll());
        return "index";
    }

    @PostMapping("/insert")
    public String insertTestDomain(TestDomain testDomain) {
        log.info("testDomain : {}", testDomain);
        repository.save(testDomain);
        return "redirect:/";
    }
}
