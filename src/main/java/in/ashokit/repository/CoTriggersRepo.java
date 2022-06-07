package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.CoTriggers;

public interface CoTriggersRepo extends JpaRepository<CoTriggers, Serializable> {

}
