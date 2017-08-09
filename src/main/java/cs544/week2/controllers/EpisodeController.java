package cs544.week2.controllers;

import cs544.week2.entities.Comment;
import cs544.week2.entities.Episode;
import cs544.week2.model.AddCastModel;
import cs544.week2.services.ArtistService;
import cs544.week2.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/episodes")
public class EpisodeController {
    @Autowired
    private EpisodeService episodeService;

    @Autowired
    private ArtistService artistService;


    @GetMapping("{id}")
    public String viewEpisode(@PathVariable("id") Long id, Model model) {
        Episode episode = episodeService.findById(id);

        model.addAttribute("episode", episode);
        model.addAttribute("artists", artistService.findArtists());
        model.addAttribute("cast", episodeService.findCastByEpisodeId(id));
        model.addAttribute("comments", episodeService.findCommentsByEpisodeId(id));

        return "episodes/view";
    }

    @PostMapping("{id}/addCast")
    public String addCast(@PathVariable Long id, AddCastModel addCastModel) {

        System.out.println("add >>>>>" + addCastModel);
        episodeService.addCast(id,addCastModel);
        return "redirect:/episodes/" + id;
    }

    @PostMapping("{id}/addComment")
    public String addComment(@PathVariable Long id, Comment comment) {

        System.out.println("add comment >>>>>" + comment);
        episodeService.addComment(id,comment);
        return "redirect:/episodes/" + id;
    }

    public String updateEpisode() {
        return "";
    }

    @RequestMapping("{serieId}/{id}/delete")
    public String removeEpisode(@PathVariable Long id,@PathVariable Long serieId) {

        episodeService.remove(id);
        return "redirect:/seasons/"+serieId;
    }

    public String rateEpisode() {
        return "";
    }


    @RequestMapping("{episodeId}/{id}/castDelete")
    public String removeCast(@PathVariable Long id,@PathVariable Long episodeId) {

        episodeService.removeCast(id);

        return "redirect:/episodes/"+episodeId;
    }

    @RequestMapping("{episodeId}/{id}/commentDelete")
    public String removeComment(@PathVariable Long id,@PathVariable Long episodeId) {

        episodeService.removeComment(id);

        return "redirect:/episodes/"+episodeId;
    }

    public String addComment() {
        return "";
    }

    public String addRating() {
        return "";
    }
}
