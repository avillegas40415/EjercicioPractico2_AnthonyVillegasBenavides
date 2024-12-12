package EjercicioPractico2_AnthonyVillegasBenavides.demo.service.impl;

import EjercicioPractico2_AnthonyVillegasBenavides.demo.dao.EventoDao;
import EjercicioPractico2_AnthonyVillegasBenavides.demo.domain.Evento;
import EjercicioPractico2_AnthonyVillegasBenavides.demo.service.EventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventoServiceImp implements EventoService {

    @Autowired
    private EventoDao eventoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Evento> getEvento(boolean activos) {
        var lista=eventoDao.findAll();
        //if (activos) {
        //   lista.removeIf((Evento e) -> !e.isActivo());
        //}
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Evento getEvento(Evento evento) {
        return eventoDao.findById(evento.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Evento evento) {
        eventoDao.save(evento);
    }

    @Override
    @Transactional
    public void delete(Evento evento) {
        eventoDao.delete(evento);
    }
}
