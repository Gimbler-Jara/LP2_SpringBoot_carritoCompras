package pe.com.cibertec.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.entity.ProductoEntity;
import pe.com.cibertec.repository.ProductoRepository;
import pe.com.cibertec.service.ProductoService;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService{
	
	 private final ProductoRepository productoRepository;

	
	@Override
	public List<ProductoEntity> buscarTodosProductos() {
		return productoRepository.findAll();
	}

	@Override
	public ProductoEntity buscarProductoPorId(Integer id) {
		return productoRepository.findById(id).get();
	}

}
