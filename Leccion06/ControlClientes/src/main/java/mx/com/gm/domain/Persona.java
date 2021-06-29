package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @NotEmpty
    ///quiere decir que esta cadena no puede estar vacia 
    private String nombre;

    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;

    private String telefono;
}
