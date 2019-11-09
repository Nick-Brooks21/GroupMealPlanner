package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredients {

	private String name;
	private int calories;
	private double cost;
	
	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingredients(String name, int calories, double cost) {
		super();
		this.name = name;
		this.calories = calories;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Ingredients [name=" + name + ", calories=" + calories + ", cost=" + cost + "]";
	}
	
	
	
}
