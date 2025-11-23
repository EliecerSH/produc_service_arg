package com.arg.crud.repository;
import com.arg.crud.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Producto, Integer> {
}
