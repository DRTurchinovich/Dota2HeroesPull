package Dota2.Heroes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class ArtifactController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
