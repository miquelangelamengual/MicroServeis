package me.hulk.microserveis.usuaris.repo;

import me.hulk.microserveis.usuaris.domain.Usuari;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<Usuari, Long> {
}
