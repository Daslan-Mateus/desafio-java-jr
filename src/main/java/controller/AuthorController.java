package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    @GetMapping("/author")
    public String getName() {
        return "Daslan";
    }
}
