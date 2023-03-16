package me.hulk.microserveis.usuaris.service;

import me.hulk.microserveis.usuaris.domain.Usuari;
import me.hulk.microserveis.usuaris.repo.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public List<Usuari> findAll() {
        return userRespository.findAll();
    }

}
