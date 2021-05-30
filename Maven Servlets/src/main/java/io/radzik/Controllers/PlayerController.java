package io.radzik.Controllers;

import io.radzik.Model.Player;
import io.radzik.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "/playerdb", method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "/playerdb", method = RequestMethod.POST)
    public String showPlayer(@RequestParam String name, ModelMap model){
        Player player = playerService.getPlayerByName(name);
        model.put("name", name);
        model.put("country", player.getNationality());
        model.put("dob", player.getBirthDate());
        model.put("titles", player.getTitles());
        return "info";
    }

}
