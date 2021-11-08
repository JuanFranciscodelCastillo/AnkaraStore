package co.edu.unbosque.backAnkaraStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.backAnkaraStore.model.Productos;

public interface ProductosDAO extends JpaRepository<Productos, Long>{

}