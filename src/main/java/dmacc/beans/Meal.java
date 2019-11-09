package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mealName;
	@Autowired
	private Ingredients ingredients;
	
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Meal(long id, String mealName, Ingredients ingredients) {
		super();
		this.id = id;
		this.mealName = mealName;
		this.ingredients = ingredients;
	}
	
	//This would allow a user to create a meal without ingredients.
	//Useful if the user wants to make a meal, but they're not sure what ingredients to use yet.
	public Meal(long id, String mealName) {
		super();
		this.id = id;
		this.mealName = mealName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public Ingredients getIngredients() {
		return ingredients;
	}
	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Meal [id=" + id + ", mealName=" + mealName + ", ingredients=" + ingredients + "]";
	}
	
	
	
}
