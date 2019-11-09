package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Ingredients;
import dmacc.beans.Meal;


@Repository
public interface MealPlannerRepository extends JpaRepository<Meal, Long>{

}
