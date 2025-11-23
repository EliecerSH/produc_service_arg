package com.arg.crud.repository;
import com.arg.crud.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categorias, Integer>{
}
