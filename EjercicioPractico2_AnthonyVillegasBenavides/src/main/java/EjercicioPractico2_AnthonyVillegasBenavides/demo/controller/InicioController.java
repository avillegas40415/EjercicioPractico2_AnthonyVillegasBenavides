package EjercicioPractico2_AnthonyVillegasBenavides.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import EjercicioPractico2_AnthonyVillegasBenavides.demo.service.EventoService;
import EjercicioPractico2_AnthonyVillegasBenavides.demo.domain.Evento;

@Controller
public class InicioController {

    @Autowired
    private EventoService eventoService;
    
    @GetMapping("/index")
    public String index(Model model) {
        List<Evento> evento = eventoService.getEvento(true); // Obtener las membresías
        model.addAttribute("evento", evento); // Agregarlas al modelo
        return "index"; // Retorna el nombre de la vista (index.html)
    }
    
}
