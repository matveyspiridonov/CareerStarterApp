package example.project.rest;

import example.project.service.VacancyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/", produces = APPLICATION_JSON_VALUE)
@Slf4j
public class ApiController {
    private final VacancyService vacancyService;

    @GetMapping("all_vacancy")
    public String getVacancyById() {
        return vacancyService.getAll().toString();
    }
}
