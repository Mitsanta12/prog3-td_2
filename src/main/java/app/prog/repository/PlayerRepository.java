package app.prog.repository;

import app.prog.model.AuthorsEntity;
import app.prog.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String> {
    PlayerEntity findPlayerEntityByName(String name);
}
