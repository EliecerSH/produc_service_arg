package com.arg.crud.repository;
import com.arg.crud.model.Stack_prod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StackRepository extends JpaRepository<Stack_prod, Integer>{
}
