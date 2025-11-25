package com.arg.crud.controller;
import java.util.List;

import com.arg.crud.model.*;
import com.arg.crud.repository.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/producto")
@CrossOrigin("*")//permite llamdas desde el froned
public class ProductoController {

    private PersonaRepository repo;
    private DescripcionRepository desRepo;
    private CategoriaRepository cRepo;
    private DescuentoRepository dRepo;
    private StackRepository sRepo;

    public ProductoController(PersonaRepository repo,  DescripcionRepository desRepo,  CategoriaRepository cRepo,  DescuentoRepository dRepo,  StackRepository sRepo) {
        this.repo = repo;
        this.desRepo = desRepo;
        this.cRepo = cRepo;
        this.dRepo = dRepo;
        this.sRepo = sRepo;
    }

    //listar
    @GetMapping
    public List<Producto> findAll() {
        return repo.findAll();
    }

    //Guardar
    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return repo.save(producto);
    }

    //modificar
    @PutMapping("{id}")
    public Producto update(@PathVariable int id, @RequestBody Producto producto) {
        return repo.findById(id).orElse(producto);
    }


    //buscar por id
    @GetMapping("{id}")
    public Producto findById(@PathVariable int id) {
        return repo.findById(id).get();
    }

    //eliminar por is
    @DeleteMapping({"{id}"})
    public void deleteById(@PathVariable int id) {
        repo.deleteById(id);
    }

    //----------------------------------------metodos de descripcion------------------------------------------------


    @GetMapping({"/descriciones"})
    public List<Descripcion> findAllByOrderByNombreAsc() {return desRepo.findAll();}

    @PostMapping("/descriciones")
    public Descripcion save(@RequestBody Descripcion descripcion) {
        return desRepo.save(descripcion);
    }

    @GetMapping("/descriciones/{id}")
    public Descripcion findByIdDescricion(@PathVariable int id) {return desRepo.findById(id).get();}

    @DeleteMapping("/descriciones/{id}")
    public void deleteByIdDescricion(@PathVariable int id) {desRepo.deleteById(id);}

    @PutMapping({"/descriciones/{id}"})
    public Descripcion updateDescricion(@RequestBody Descripcion descripcion, @PathVariable int id) {
        return desRepo.save(descripcion);
    }

    //----------------------------------------------metodo de categoria-------------------------------------------------



    @GetMapping({"/categoria"})
    public List<Categorias>finAllByOrderByNombreAsc(){return cRepo.findAll();}

    @GetMapping({"/categoria/{id}"})
    public Categorias finById(@PathVariable int id){return cRepo.findById(id).get();}

    @PostMapping("/categoria")
    public Categorias save(@RequestBody Categorias categorias) {
        return cRepo.save(categorias);
    }

    @DeleteMapping({"/categoria/{id}"})
    public void deleteByIdCategoria(@PathVariable int id) {cRepo.deleteById(id);}

    @PutMapping("/categoria/{id}")
    public Categorias update(@RequestBody Categorias categorias, @PathVariable int id) {
        return cRepo.save(categorias);
    }

    //-------------------------------------------metodos de descuento---------------------------------------------------


    @GetMapping({"/descuento"})
    public List<Descuento> findAllByOrderByNombreAscDesc(){return dRepo.findAll();}

    @GetMapping({"/descuento/{id}"})
    public Descuento finByIdDescuento(@PathVariable int id){return dRepo.findById(id).get();}

    @PostMapping({"/descuento"})
    public Descuento save(@RequestBody Descuento descuento) {
        return dRepo.save(descuento);
    }

    @DeleteMapping({"/descuento/{id}"})
    public void deleteByIdDescuento(@PathVariable int id) {dRepo.deleteById(id);}

    @PutMapping({"/descuento/{id}"})
    public Descuento update(@RequestBody Descuento descuento, @PathVariable int id) {
        return dRepo.save(descuento);
    }

    //-----------------------------------------metodos de estadistica de armas-----------------------------------------

    @GetMapping({"/stack"})
    public List<Stack_prod> findAllByOrderByNombreAscStack(){return sRepo.findAll();}

    @GetMapping({"/stack/{id}"})
    public Stack_prod finByIdStack(@PathVariable int id){return sRepo.findById(id).get();}

    @PostMapping({"/stack"})
    public Stack_prod save(@RequestBody Stack_prod stack) {
        return sRepo.save(stack);
    }

    @DeleteMapping({"/stack/{id}"})
    public void deleteByIdStack(@PathVariable int id) {sRepo.deleteById(id);}

    @PutMapping({"/stack/{id}"})
    public Stack_prod update(@RequestBody Stack_prod stack, @PathVariable int id) {
        return sRepo.save(stack);
    }

}
