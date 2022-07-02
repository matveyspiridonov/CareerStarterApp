package example.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(schema = "main", name = "companies")
public class CompanyById {
    @Id
    private Long id;

    private String companyName;

    @OneToMany(mappedBy = "companyById")
    private List<VacancyById> vacancies;
}
