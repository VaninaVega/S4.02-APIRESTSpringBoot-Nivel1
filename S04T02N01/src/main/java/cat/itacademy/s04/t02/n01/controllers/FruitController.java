package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.s04.t02.n01.services.FruitService;

import java.util.List;

@RestController
@RequestMapping("/fruits")  // plural, siguiendo buenas prácticas REST
public class FruitController {

    @Autowired
    private FruitService service;

    // CREATE
    @PostMapping
    public ResponseEntity<Fruit> create(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.add(fruit));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Fruit>> getAll() {
        return ResponseEntity.ok((List<Fruit>) service.getAll());
    }

    // READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getOne(@PathVariable int id) {
        return service.getOne(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Fruit> update(@PathVariable int id, @RequestBody Fruit fruit) {
        fruit.setId(id);
        return ResponseEntity.ok(service.update(fruit));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}

