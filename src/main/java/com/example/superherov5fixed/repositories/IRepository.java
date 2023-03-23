package com.example.superherov5fixed.repositories;

import com.example.superherov5fixed.dto.SuperheroCityDTO;
import com.example.superherov5fixed.dto.SuperheroDTO;
import com.example.superherov5fixed.dto.SuperheroPowerCountDTO;
import com.example.superherov5fixed.dto.SuperheroDTO;
import com.example.superherov5fixed.dto.SuperheroPowerCountDTO;

import java.util.List;

public interface IRepository {

    SuperheroDTO searchForSuperhero(String superheroName);
    List<SuperheroPowerCountDTO> getSuperheroPowerCount();

    //SuperheroCityDTO getSuperheroCity(String city);
}

