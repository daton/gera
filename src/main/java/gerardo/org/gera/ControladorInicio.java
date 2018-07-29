package gerardo.org.gera;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorInicio {
    @RequestMapping("/hola")
    public String metodo1(){
        float edad=30;
        int dias=365;
        float edadendias=edad*dias;
        return "La edad del gerardito en dias es eda es "+edadendias;
    }


}
