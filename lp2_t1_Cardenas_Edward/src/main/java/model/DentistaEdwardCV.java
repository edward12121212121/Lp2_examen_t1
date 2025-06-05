package model;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DentistaEdwardCV {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    @EqualsAndHashCode.Include
    private int idDentista;

    @Column(name = "cop", nullable = false, length = 6)
    private String cop;

    @Column(name = "nombre_completo", nullable = false, length = 50)
    private String nombreCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicioContrato;

    @Column(name = "turno", nullable = false, length = 1)
    private String turno;

    @Column(name = "correo", nullable = false, length = 50, unique = true)
    private String correo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad", nullable = false)
    private EspecialidadEdwardCV especialidad;
}
