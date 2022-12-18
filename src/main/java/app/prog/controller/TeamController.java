package app.prog.controller;


import app.prog.controller.mapper.TeamRestMapper;
import app.prog.controller.response.*;
import app.prog.model.TeamEntity;
import app.prog.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeam() {
        return service.getteam().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/teams")
    public List<TeamResponse> createTeam(@RequestBody List<CreateTeamResponse> toCreate) {
        List<TeamEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createTeam(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/teams")
    public List<TeamResponse> updateTeams(@RequestBody List<UpdateTeamResponse> toUpdate) {
        List<TeamEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateTeam(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/teams/{teamId}")
    public TeamResponse deleteAuthor(@PathVariable Integer teamId) {
        return mapper.toRest(service.deleteTeam(teamId));
    }
}
