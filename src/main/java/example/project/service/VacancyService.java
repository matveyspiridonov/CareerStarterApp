package example.project.service;

import example.project.converter.VacancyConverter;
import example.project.dto.VacancyByIdDto;
import example.project.repository.VacancyByIdRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import example.project.model.VacancyById;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(isolation = Isolation.READ_COMMITTED)
@Slf4j
public class VacancyService {
    private final VacancyByIdRepository vacancyByIdRepository;
    private final VacancyConverter vacancyConverter;

    public List<VacancyByIdDto> getAll() {
        List<VacancyById> vacancies = vacancyByIdRepository.findAll();
        return vacancies.stream()
                .map(vacancyConverter::vacancyByIdFromEntityToDto)
                .collect(Collectors.toList());
    }
}
