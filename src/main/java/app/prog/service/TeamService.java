package app.prog.service;

import app.prog.model.AuthorsEntity;
import app.prog.model.TeamEntity;
import app.prog.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamEntity> getteam() {
        return repository.findAll();
    }

    public List<TeamEntity> createTeam(List<TeamEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeam(List<TeamEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public TeamEntity getByName(String name){
        return repository.findTeamEntityByName(name);
    }
    public TeamEntity deleteTeam(int id) {

        Optional<TeamEntity> optional = repository.findById(String.valueOf(id));
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {

            throw new RuntimeException("TeamEntity." + id + " not found");
        }
    }
}
