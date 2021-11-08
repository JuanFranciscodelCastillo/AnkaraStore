package co.edu.unbosque.backAnkaraStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.backAnkaraStore.model.Ventas;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import co.edu.unbosque.backAnkaraStore.model.Consecutivo;

public interface VentasDAO extends JpaRepository<Ventas, Long>{
	
	@Query("Select new co.edu.unbosque.backAnkaraStore.model.Consecutivo(ifnull(max(v.codigo_venta),0)+1) from Ventas v")
	Optional<Consecutivo> obtenerConsecutivo();

}
