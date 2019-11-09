package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.repository.MealPlannerRepository;

@Controller
public class WebController {

	@Autowired
	MealPlannerRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllMeals(Model model) {
		model.addAttribute("mealPlanner", repo.findAll());
		return "results";
	}
}
