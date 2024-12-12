package EjercicioPractico2_AnthonyVillegasBenavides.demo.service;

import EjercicioPractico2_AnthonyVillegasBenavides.demo.domain.Evento;
import java.util.List;

public interface EventoService {

    //Se obtiene un listado de Membresias en un List
    public List<Evento> getEvento(boolean activos);
    
    // Se obtiene un Membresia, a partir del id de un categoria
    public Evento getEvento(Evento evento);
    
    // Se inserta una nueva Membresia si el id de la Membresia esta vacío
    // Se actualiza una Membresia si el id de la Membresia NO esta vacío
    public void save(Evento evento);
    
    // Se elimina la Membresia que tiene el id pasado por parámetro
    public void delete(Evento evento);
    
}
