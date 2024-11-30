package jsges.nails.domain;

import jakarta.persistence.*; //esto no se debe importar asi
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(columnDefinition = "TEXT")
        String razonSocial;

        //no tiene etiqueta
        int estado;

        @Column(columnDefinition = "TEXT")
        String letra;

        @Column(columnDefinition = "TEXT")
        String contacto;

        @Column(columnDefinition = "TEXT")
        String celular;

        @Column(columnDefinition = "TEXT")
        String mail;

        //no tiene etiqueta
        Date fechaInicio;
        
        //no tiene etiqueta
        Date fechaNacimiento;


}
