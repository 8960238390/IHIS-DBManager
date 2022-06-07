package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.CitizenChildDetails;

public interface CitizenChildDetailsRepo extends JpaRepository<CitizenChildDetails, Serializable>{

}
