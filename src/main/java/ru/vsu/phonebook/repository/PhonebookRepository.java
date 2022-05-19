package ru.vsu.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.phonebook.entity.Abonent;

import java.util.List;

@Repository
public interface PhonebookRepository extends JpaRepository<Abonent, Long> {

    List<Abonent> findAllByName(String name);

}
