package com.example.superherov5fixed.Service;

import com.example.superherov5fixed.dto.*;
import com.example.superherov5fixed.model.Superhero;
import com.example.superherov5fixed.repositories.SuperheroRepository_DB;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SuperheroService {

    private SuperheroRepository_DB superheroRepository_db;

    public SuperheroService(SuperheroRepository_DB superheroRepository_db) {
        this.superheroRepository_db = superheroRepository_db;
    }

    public List<Superhero> getSuperheroes() {
        return superheroRepository_db.getSuperheroes();
    }

    public SuperheroDTO searchForSuperhero(String superheroName) {
        return superheroRepository_db.searchForSuperhero(superheroName);
    }

    public List<SuperheroPowerCountDTO> getSuperheroPowerCount() {
        return superheroRepository_db.getSuperheroPowerCount();
    }

    public List<SuperheroNamePowerDTO> superheroNamePower() {
        return superheroRepository_db.getSuperheroNameAndPower();
    }

    public List<SuperheroCityDTO> getSuperheroCity(String cityName) {
        return superheroRepository_db.getSuperheroCity(cityName);
    }

    public List<String> getCities() {
        return superheroRepository_db.getCities();
    }

    public List<String> getPowers() {
        return superheroRepository_db.getPowers();
    }

    public void addSuperhero(SuperheroFormDTO superheroForm) {
        superheroRepository_db.addSuperHero(superheroForm);
    }

  /*  public Superhero createSuperhero(Superhero superhero) {
        return superheroRepository.createSuperhero(superhero);
    }

    public Superhero editSuperhero(Superhero superhero) {
        return superheroRepository.editSuperhero(superhero);
    }

    public Superhero deleteSuperhero(Superhero superhero) {
        return superheroRepository.deleteSuperhero(superhero);
    }*/

}
