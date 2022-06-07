package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.CitizenIncomeDetails;

public interface CitizenIncomeDetailsRepo extends JpaRepository<CitizenIncomeDetails, Serializable>{

}
