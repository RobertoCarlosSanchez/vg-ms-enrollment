package pe.edu.vallegrande.enrollment.presentation.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.enrollment.application.service.FamilyService;
import pe.edu.vallegrande.enrollment.domain.dto.FamilyResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;

    @GetMapping("/families")
    public Flux<FamilyResponse> getAll() {
        return familyService.getAll();
    }

    @GetMapping("/families/active")
    public Flux<FamilyResponse> getActive() {
        return familyService.getActive();
    }

    @GetMapping("/families/inactive")
    public Flux<FamilyResponse> getInactive() {
        return familyService.getInactive();
    }

    @GetMapping("/family/{id}")
    public Mono<FamilyResponse> getByStudentId(@PathVariable String id) {
        return familyService.getById(id);
    }

}
