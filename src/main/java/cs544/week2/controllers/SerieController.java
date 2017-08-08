package cs544.week2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SerieController {
	
	@RequestMapping("/series")
	public String getSeries() {
		return "series/list";
	}

	public String addSerie() {
		return "";
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
