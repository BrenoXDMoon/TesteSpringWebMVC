package com.spring.web.resource;

import java.util.Optional;

import com.spring.web.model.Jedi;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;

    @GetMapping("api/jedi")
    public List<Jedi> getAllJedi() {

        return repository.findAll();
    }

    @GetMapping("api/jedi/{id}")
    public Jedi getJedi(@PathVariable("id") Long id) {

        Optional<Jedi> jedi = repository.findById(id);

        if (jedi.isPresent()) {
            return jedi.get();
        } else {
            throw new JediNotFoundException();
        }
    }

}