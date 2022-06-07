package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.GraduationYears;

public interface GraduationYearsRepo extends JpaRepository<GraduationYears, Serializable> {

}
