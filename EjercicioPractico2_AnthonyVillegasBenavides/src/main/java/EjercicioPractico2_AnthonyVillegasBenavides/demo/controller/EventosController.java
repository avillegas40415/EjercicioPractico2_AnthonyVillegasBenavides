package EjercicioPractico2_AnthonyVillegasBenavides.demo.controller;

import EjercicioPractico2_AnthonyVillegasBenavides.demo.domain.Evento;
import EjercicioPractico2_AnthonyVillegasBenavides.demo.service.EventoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/admeventos")
public class EventosController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var evento = eventoService.getEvento(false);
        model.addAttribute("evento", evento);
        model.addAttribute("totalEventos", evento.size());
        return "/admeventos/listado"; //Cambiado para hacer pruebas
    }
    
}
