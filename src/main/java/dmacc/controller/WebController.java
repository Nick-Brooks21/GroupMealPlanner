package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Meal;
import dmacc.repository.MealPlannerRepository;

@Controller
public class WebController {

	@Autowired
	MealPlannerRepository repo;
	
	@GetMapping("/viewAllMeals")
	public String viewAllMeals(Model model) {
		model.addAttribute("mealPlanner", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputMeal")
	public String addNewMeal(Model model) {
	    Meal m = new Meal();
	    model.addAttribute("newMeal", m);
	    return "inputMeal";
	}
	
	@PostMapping("/inputMeal")
	public String addNewMeal(@ModelAttribute Meal m, Model model) {
		repo.save(m);
		model.addAttribute("newMeal", repo.findAll());
		return "results";
	}
}
