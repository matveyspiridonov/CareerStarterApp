package example.project.repository;

import example.project.model.VacancyById;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyByIdRepository extends JpaRepository<VacancyById, Long> {
}
