package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.PlanCategoryMaster;

public interface PlanCategoryMasterRepo extends JpaRepository<PlanCategoryMaster, Serializable> {
	
	@Query("SELECT categoryName FROM PlanCategoryMaster")
	public String[] findCategoryName();
}
