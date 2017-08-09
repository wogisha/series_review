package cs544.week2.controllers;

import cs544.week2.entities.Season;
import cs544.week2.entities.Serie;
import cs544.week2.entities.enums.Genre;
import cs544.week2.model.SerieSummary;
import cs544.week2.services.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/series")
public class SerieController {
	@Autowired
	private SeriesService seriesService;



	@GetMapping("")
	public String getSeries(Model model,@RequestParam(value = "q",required = false) String q) {

        List<SerieSummary> serieSummaries = seriesService.findSeriesSummarys(q);

        model.addAttribute("series", serieSummaries);

	    return "series/list";
	}

	@GetMapping("{id}")
	public String viewSerie(@PathVariable Long id, Model model){
	    System.out.println("id "+id);
	    SerieSummary serieSummary = seriesService.findSerieSummary(id);

	    model.addAttribute("serieSummary",serieSummary);

        return "series/view";
    }

    @GetMapping("{id}/addSeason")
    public String addSeason(@PathVariable Long id,Model model){
        System.out.println("id "+id);

        return "series/addSeason";
    }

    @PostMapping("{id}/addSeason")
    public String saveSeason(@PathVariable Long id,Season season){

        seriesService.addSeason(id, season);

        System.out.println("id "+id +" season:" + season);


        return "redirect:/series/"+ id;
    }

	@GetMapping("add")
	public String addSerie(Model model) {

        model.addAttribute("genres", Genre.values());
        return "series/add";
	}

	@PostMapping("add")
	public String saveSerie(Serie serie) {
        seriesService.add(serie);
        return "redirect:/series";
	}

	public String updateSeries() {
		return "";
	}

	public String removeSeries() {
		return "";
	}

	public String rateSeries() {
		return "";
	}

	public String searchForSeries() {
		return "";
	}

	public String updatePost() {
		return "";
	}
}
