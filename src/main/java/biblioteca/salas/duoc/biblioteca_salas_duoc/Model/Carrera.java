package biblioteca.salas.duoc.biblioteca_salas_duoc.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {
    @NotNull
    @Id
    private int codigo;
    private String nombre;
}
