package ru.vsu.phonebook.setvice;

import org.springframework.stereotype.Service;
import ru.vsu.phonebook.entity.Abonent;
import ru.vsu.phonebook.repository.PhonebookRepository;

import java.util.List;

@Service
public class PhonebookService {

    private final PhonebookRepository phonebookRepository;

    public PhonebookService(PhonebookRepository phonebookRepository) {
        this.phonebookRepository = phonebookRepository;
    }

    public List<Abonent> getByName(String name) {
        return phonebookRepository.findAllByName(name);
    }

    public List<Abonent> getALL() {
        return phonebookRepository.findAll();
    }

    public Abonent create(Abonent abonent) {
        return phonebookRepository.save(abonent);
    }

    public void delete(Long id) {
        phonebookRepository.deleteById(id);
    }
}
