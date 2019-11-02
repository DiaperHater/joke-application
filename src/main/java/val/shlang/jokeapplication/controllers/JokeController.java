package val.shlang.jokeapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import val.shlang.jokeapplication.services.JokeService;

@Controller
public class JokeController {

    private JokeService service;

    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", service.getJoke());

        return "chuckNorris";
    }
}
