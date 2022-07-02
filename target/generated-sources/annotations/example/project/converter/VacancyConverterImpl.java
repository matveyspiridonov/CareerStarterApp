package example.project.converter;

import example.project.Enum.VacancyRank;
import example.project.dto.VacancyByIdDto;
import example.project.model.CompanyById;
import example.project.model.VacancyById;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-28T19:18:35+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 15.0.2 (AdoptOpenJDK)"
)
@Component
public class VacancyConverterImpl implements VacancyConverter {

    @Override
    public VacancyByIdDto vacancyByIdFromEntityToDto(VacancyById entity) {
        if ( entity == null ) {
            return null;
        }

        VacancyByIdDto vacancyByIdDto = new VacancyByIdDto();

        vacancyByIdDto.setCompanyName( entityCompanyByIdCompanyName( entity ) );
        vacancyByIdDto.setTitle( entity.getTitle() );
        vacancyByIdDto.setDescription( entity.getDescription() );
        vacancyByIdDto.setRequiredSkills( entity.getRequiredSkills() );
        if ( entity.getVacancyRank() != null ) {
            vacancyByIdDto.setVacancyRank( Enum.valueOf( VacancyRank.class, entity.getVacancyRank() ) );
        }
        vacancyByIdDto.setSalary( entity.getSalary() );
        vacancyByIdDto.setCurrency( entity.getCurrency() );

        return vacancyByIdDto;
    }

    private String entityCompanyByIdCompanyName(VacancyById vacancyById) {
        if ( vacancyById == null ) {
            return null;
        }
        CompanyById companyById = vacancyById.getCompanyById();
        if ( companyById == null ) {
            return null;
        }
        String companyName = companyById.getCompanyName();
        if ( companyName == null ) {
            return null;
        }
        return companyName;
    }
}
