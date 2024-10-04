package pe.edu.vallegrande.enrollment.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import pe.edu.vallegrande.enrollment.infrastructure.util.Attorney;
import pe.edu.vallegrande.enrollment.infrastructure.util.Student;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamilyResponse {

    private String id;
    private Set<Student> students;
    private Attorney mother;
    private Attorney father;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime creationDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime writeDate;

}
