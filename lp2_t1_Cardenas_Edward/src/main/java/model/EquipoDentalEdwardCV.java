package model;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "tbl_equipo_dental")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EquipoDentalEdwardCV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    @EqualsAndHashCode.Include
    private int nroEquipo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "fecha_adquisicion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdquisicion;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dentista")
    private DentistaEdwardCV dentista;
}