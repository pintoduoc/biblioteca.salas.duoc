package biblioteca.salas.duoc.biblioteca_salas_duoc.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @NotNull
    @Id
    private int id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_estudiante_id")
    private Estudiante id_estudiante;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "codigo_sala_codigo")
    private Sala codigo_sala;
    @NotNull
    private Date fecha_solicitada;
    @NotNull
    private Date hora_reserva;
    private Date hora_cierre;
    @NotNull
    private int estado;
}
