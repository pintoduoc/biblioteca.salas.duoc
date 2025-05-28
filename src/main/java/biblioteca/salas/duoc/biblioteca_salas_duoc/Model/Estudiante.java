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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    @NotNull
    @Id
    private int id;
    @NotNull
    private String run;
    @NotNull
    private String nombres;
    private String correo;
    @NotNull
    private char jornada;
    private int telefono;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "codigo_carrera_codigo")
    private Carrera codigo_carrera;
}
