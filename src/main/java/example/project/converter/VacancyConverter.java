package example.project.converter;

import example.project.dto.VacancyByIdDto;
import example.project.model.VacancyById;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VacancyConverter {

    @Mapping(source = "entity.companyById.companyName", target = "companyName")
    @Mapping(source = "entity.title", target = "title")
    VacancyByIdDto vacancyByIdFromEntityToDto(VacancyById entity);
}
