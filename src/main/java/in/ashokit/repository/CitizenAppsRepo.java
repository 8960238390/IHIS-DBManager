package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.CitizenApps;

public interface CitizenAppsRepo extends JpaRepository<CitizenApps, Serializable> {

}
