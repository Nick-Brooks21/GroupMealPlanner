package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="meal_list")
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String mealName;

	
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//This would allow a user to create a meal without ingredients.
	//Useful if the user wants to make a meal, but they're not sure what ingredients to use yet.
	public Meal(int id, String mealName) {
		super();
		this.id = id;
		this.mealName = mealName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	@Override
	public String toString() {
		return "Meal [id=" + id + ", mealName=" + mealName + "]";
	}

	
	
	
}
