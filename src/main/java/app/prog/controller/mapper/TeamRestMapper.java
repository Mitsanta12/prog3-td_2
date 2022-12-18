package app.prog.controller.mapper;

import app.prog.controller.response.*;
import app.prog.model.AuthorsEntity;
import app.prog.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .particularity(domain.getParticularity())
                .hasParticularity(domain.hasParticularity())
                .build();
    }

    public TeamEntity toDomain(CreateTeamResponse rest) {
        return TeamEntity.builder()
                .name(rest.getName())
                .particularity(rest.getParticularity())
                .build();
    }

    public TeamEntity toDomain(UpdateTeamResponse rest) {
        return TeamEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .particularity(rest.getParticularity())
                .build();
    }
}
