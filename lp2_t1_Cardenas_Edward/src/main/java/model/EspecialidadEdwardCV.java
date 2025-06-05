package model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "tbl_especialidad")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EspecialidadEdwardCV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    @EqualsAndHashCode.Include
    private int idEspecialidad;

    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }
}