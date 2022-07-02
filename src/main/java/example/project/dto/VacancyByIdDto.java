package example.project.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import example.project.Enum.VacancyRank;

@Data
@Accessors(chain = true)
public class VacancyByIdDto {
    private String companyName;
    private String title;
    private String description;
    private String requiredSkills;
    private VacancyRank vacancyRank;
    private Long salary;
    private String currency;
}
