package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /// para que spring pueda reconocer nuestra clase , lo que va a administrar spring
@Slf4j /// para el manejo del login 

public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        log.info("Ejecutando el controlador");
        log.debug("MAS DETAALLE DEL CONTROLADOR");
        return "Hola Mundo con Spring  ";
    }
}
