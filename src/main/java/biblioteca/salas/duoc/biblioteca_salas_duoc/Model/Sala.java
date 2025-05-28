package biblioteca.salas.duoc.biblioteca_salas_duoc.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sala {
    @NotNull
    @Id
    private int codigo;
    @NotNull
    private String nombre;
    private int capacidad;
    @NotNull
    private int id_instituto;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_tipo_id_tipo")
    private TipoSala id_tipo;
}
