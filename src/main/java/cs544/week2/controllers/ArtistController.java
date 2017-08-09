package cs544.week2.controllers;

import cs544.week2.entities.Artist;
import cs544.week2.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping("")
    public String getArtists(Model model) {
        model.addAttribute("artists", artistService.findArtists());
        return "artists/list";
    }

    @GetMapping("/addArtist")
    public String addArtist() {
        return "artists/addArtist";
    }

    @PostMapping("/addArtist")
    public String saveArtist(Artist artist) {

        artistService.add(artist);
        return "redirect:/artists";
    }

    public String updateArtist() {

        return "";
    }

    public String removeArtist() {
        return "";
    }

    public String updatePicture() {
        return "";
    }
}
