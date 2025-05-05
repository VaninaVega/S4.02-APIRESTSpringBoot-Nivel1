package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository repository;

    // CREATE
    public Fruit add(Fruit fruit) {
        return repository.save(fruit);
    }

    // READ ONE
    public Optional<Fruit> getOne(int id) {
        return repository.findById(id);
    }

    // READ ALL
    public List<Fruit> getAll() {
        return repository.findAll();
    }

    // UPDATE
    public Fruit update(Fruit fruit) {
        return repository.save(fruit);
    }

    // DELETE
    public void delete(int id) {
        repository.deleteById(id);
    }
}

