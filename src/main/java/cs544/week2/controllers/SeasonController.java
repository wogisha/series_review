package cs544.week2.controllers;

import cs544.week2.entities.Episode;
import cs544.week2.entities.Season;
import cs544.week2.entities.enums.Genre;
import cs544.week2.services.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seasons")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @GetMapping("{id}")
    public String viewSeason(@PathVariable Long id, Model model) {
        Season season = seasonService.getSeasonInformation(id);

        model.addAttribute("season", season);


        return "seasons/view";
    }

    @GetMapping("{id}/addEpisode")
    public String addEpisode(@PathVariable Long id,Model model) {



        return "seasons/addEpisode";
    }

    @PostMapping("{id}/addEpisode")
    public String saveEpisode(@PathVariable Long id, Episode episode) {

        System.out.println(">>>>>>"+episode);

        seasonService.addEpisode(id,episode);

        return "redirect:/seasons/"+id;
    }

    public String updateSeason() {
        return "";
    }

    @RequestMapping("{serieId}/{id}/delete")
    public String removeSeason(@PathVariable Long id,@PathVariable Long serieId) {

        seasonService.remove(id);
        return "redirect:/series/"+serieId;
    }

    public String rateSeason() {
        return "";
    }

    public String updatePoster() {
        return "";
    }
}
