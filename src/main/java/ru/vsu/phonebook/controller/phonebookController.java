package ru.vsu.phonebook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vsu.phonebook.entity.Abonent;
import ru.vsu.phonebook.setvice.PhonebookService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phonebook")
public class phonebookController {

    private final PhonebookService phonebookService;

    public phonebookController(PhonebookService phonebookService) {
        this.phonebookService = phonebookService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Abonent>> getByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(phonebookService.getByName(name));
    }


    @GetMapping
    public ResponseEntity<List<Abonent>> getAll() {
        return ResponseEntity.ok(phonebookService.getALL());
    }

    // TODO: 19.05.2022 write implement method getById

    @PostMapping
    public ResponseEntity<Abonent> create(@RequestBody Abonent abonent){
        return ResponseEntity.ok(phonebookService.create(abonent));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        phonebookService.delete(id);
    }
}
