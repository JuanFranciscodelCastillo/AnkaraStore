package co.edu.unbosque.backAnkaraStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.backAnkaraStore.model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, Long>{

}
