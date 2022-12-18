package app.prog.repository;

import app.prog.model.AuthorsEntity;
import app.prog.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, String> {
    TeamEntity findTeamEntityByName(String name);
}
