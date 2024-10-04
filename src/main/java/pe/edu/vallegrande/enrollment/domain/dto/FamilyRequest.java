package pe.edu.vallegrande.enrollment.domain.dto;

import lombok.*;
import pe.edu.vallegrande.enrollment.infrastructure.util.Attorney;
import pe.edu.vallegrande.enrollment.infrastructure.util.Student;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamilyRequest {

    private Set<Student> students;
    private Attorney mother;
    private Attorney father;

}
