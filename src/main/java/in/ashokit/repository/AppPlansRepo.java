package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.AppPlans;

public interface AppPlansRepo extends JpaRepository<AppPlans, Serializable> {

	@Query("SELECT activeSw FROM AppPlans WHERE planId=:id")
	public String findActiveStatusById(Integer id);
}
