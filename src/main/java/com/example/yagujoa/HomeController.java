package com.example.yagujoa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping ("/yagu")
public class HomeController {
    private final HomeService homeService;

    @GetMapping("/home")
    public String home (Model model) {
        List<Home> homeList = this.homeService.getList();
        return "yagu_home";
    }

    @GetMapping("/community")
    public String community() {

        return "yagu_community";
    }

    @PostMapping("/community")
    public String community2() {

        return "redirect:/yagu/community";
    }
}
