package app.prog.service;


import app.prog.model.PlayerEntity;
import app.prog.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayer() {
        return repository.findAll();
    }

    public List<PlayerEntity> createPlayer(List<PlayerEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<PlayerEntity> updatePlayer(List<PlayerEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    //TODO-3: should I  use Integer here or int ? Why ?
    public PlayerEntity deletePlayer(int id) {
        Optional<PlayerEntity> optional = repository.findById(String.valueOf(id));
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new RuntimeException("PlayerEntity" + id + " not found");
        }
    }
}
