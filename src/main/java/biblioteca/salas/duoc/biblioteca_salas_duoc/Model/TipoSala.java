package biblioteca.salas.duoc.biblioteca_salas_duoc.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TipoSala {
    @NotNull
    @Id
    private int id_tipo;
    @NotNull
    private String nombre;
}
