package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.cibertec.model.entity.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

}
