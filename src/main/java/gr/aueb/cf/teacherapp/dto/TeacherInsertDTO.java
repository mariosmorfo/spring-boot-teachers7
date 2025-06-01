package gr.aueb.cf.teacherapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {

    @NotNull(message = "Το όνομα δεν μπορεί να είναι NULL")
    @Size(min = 2, message = "Το όνομα πρέπει να περιέχει 2 χαρακτήρες")
    private String firstname;

    @NotNull(message = "Το επώνυμο δεν μπορεί να είναι NULL")
    @Size(min = 2, message = "Το επώνυμο πρέπει να περιέχει 2 χαρακτήρες")
    private String lastname;

    @Pattern(regexp = "\\d{9,}", message = "Το ΑΦΜ δεν μπορεί να είναι μικρότερο από 9 ψηφία")
    private String vat;

    @NotNull(message = "Η περιοχή δεν μπορεί να είναι NULL")
    private Long regionId;
}
