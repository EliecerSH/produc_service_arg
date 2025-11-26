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

        return repo.findById(id)
                .map(prodExistente -> {

                    prodExistente.setNombre(producto.getNombre());
                    prodExistente.setPrecio(producto.getPrecio());
                    prodExistente.setStock(producto.getStock());
                    prodExistente.setId_categoria(producto.getId_categoria());
                    prodExistente.setId_descuento(producto.getId_descuento());
                    prodExistente.setId_tack_prod(producto.getId_tack_prod());
                    prodExistente.setId_descripcion(producto.getId_descripcion());

                    return repo.save(prodExistente);
                })
                .orElseThrow(() ->
                        new RuntimeException("El producto con ID " + id + " no existe"));
    }

    //buscar por id
    @GetMapping("{id}")
    public Producto findById(@PathVariable int id) {

        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("El producto con el ID: "+ id +" no existe"));
    }

    //eliminar por is
    @DeleteMapping({"{id}"})
    public void deleteById(@PathVariable int id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("El producto con el ID: " + id + " no existe");
        }
        repo.deleteById(id);
    }

    //-------------------------------------metodos de descripcion------------------------------------------------


    @GetMapping({"/descripciones"})
    public List<Descripcion> findAllByOrderByNombreAsc() {return desRepo.findAll();}

    @PostMapping("/descriciones")
    public Descripcion save(@RequestBody Descripcion descripcion) {
        return desRepo.save(descripcion);
    }

    @GetMapping("/descriciones/{id}")
    public Descripcion findByIdDescricion(@PathVariable int id) {
        return desRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("La descipcion con el ID: "+ id +" no existe"));
    }

    @DeleteMapping("/descriciones/{id}")
    public void deleteByIdDescricion(@PathVariable int id) {
        if (!desRepo.existsById(id)) {
            throw new RuntimeException("El descripcion con el ID: " + id + " no existe");
        }
        desRepo.deleteById(id);
    }

    @PutMapping({"/descriciones/{id}"})
    public Descripcion updateDescricion(@RequestBody Descripcion descripcion, @PathVariable int id) {
        return desRepo.save(descripcion);
    }

    //----------------------------------------------metodo de categoria-------------------------------------------------



    @GetMapping({"/categoria"})
    public List<Categorias>finAllByOrderByNombreAsc(){return cRepo.findAll();}

    @GetMapping({"/categoria/{id}"})
    public Categorias finById(@PathVariable int id){
        return cRepo.findById(id).
                orElseThrow(() -> new RuntimeException("La categoria con el ID: "+ id +" no existe"));
    }

    @PostMapping("/categoria")
    public Categorias save(@RequestBody Categorias categorias) {
        return cRepo.save(categorias);
    }

    @DeleteMapping({"/categoria/{id}"})
    public void deleteByIdCategoria(@PathVariable int id) {
        if (!cRepo.existsById(id)) {
            throw new RuntimeException("La categoria con el ID: " + id + " no existe");
        }
        cRepo.deleteById(id);
    }

    @PutMapping("/categoria/{id}")
    public Categorias update(@RequestBody Categorias categorias, @PathVariable int id) {
        return cRepo.save(categorias);
    }

    //-------------------------------------------metodos de descuento---------------------------------------------------


    @GetMapping({"/descuento"})
    public List<Descuento> findAllByOrderByNombreAscDesc(){return dRepo.findAll();}

    @GetMapping({"/descuento/{id}"})
    public Descuento finByIdDescuento(@PathVariable int id){
        return dRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("El descuento con el ID: "+ id +" no existe"));
    }

    @PostMapping({"/descuento"})
    public Descuento save(@RequestBody Descuento descuento) {
        return dRepo.save(descuento);
    }

    @DeleteMapping({"/descuento/{id}"})
    public void deleteByIdDescuento(@PathVariable int id) {
        if (!dRepo.existsById(id)) {
            throw new RuntimeException("El descuento con el ID: " + id + " no existe");
        }
        dRepo.deleteById(id);
    }

    @PutMapping({"/descuento/{id}"})
    public Descuento update(@RequestBody Descuento descuento, @PathVariable int id) {
        return dRepo.save(descuento);
    }

    //-----------------------------------------metodos de estadistica de armas-----------------------------------------

    @GetMapping({"/stack"})
    public List<Stack_prod> findAllByOrderByNombreAscStack(){return sRepo.findAll();}

    @GetMapping({"/stack/{id}"})
    public Stack_prod finByIdStack(@PathVariable int id){
        return sRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Las estadisticas con el ID: "+ id +" no existe"));
    }

    @PostMapping({"/stack"})
    public Stack_prod save(@RequestBody Stack_prod stack) {
        return sRepo.save(stack);
    }

    @DeleteMapping({"/stack/{id}"})
    public void deleteByIdStack(@PathVariable int id) {
        if (!sRepo.existsById(id)) {
            throw new RuntimeException("Las estadisticas con el ID: " + id + " no existe");
        }
        sRepo.deleteById(id);
    }

    @PutMapping({"/stack/{id}"})
    public Stack_prod update(@RequestBody Stack_prod stack, @PathVariable int id) {
        return sRepo.save(stack);
    }

}
