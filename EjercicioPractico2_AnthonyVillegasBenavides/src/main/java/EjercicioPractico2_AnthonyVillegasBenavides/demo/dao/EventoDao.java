package EjercicioPractico2_AnthonyVillegasBenavides.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import EjercicioPractico2_AnthonyVillegasBenavides.demo.domain.Evento;

public interface EventoDao extends JpaRepository <Evento,Long>{

}
