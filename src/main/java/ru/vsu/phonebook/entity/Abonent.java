package ru.vsu.phonebook.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "abonents_db")
public class Abonent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    public Abonent() {
    }

    public Abonent(String surname, String name, String number) {
        this.surname = surname;
        this.name = name;
        this.number = number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return Objects.equals(id, abonent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
