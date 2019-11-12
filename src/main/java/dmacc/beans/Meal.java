package dmacc.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="meal_list")
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="meal_ID")
	private int id;
	@Column(name="name_of_meal")
	private String mealName;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private List<User> user;

	
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Meal(int id, String mealName, List<User> user) {
		super();
		this.id = id;
		this.mealName = mealName;
		this.user = user;
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
		return "Meal [id=" + id + ", mealName=" + mealName + ", user=" + user + "]";
	}	
	
}
