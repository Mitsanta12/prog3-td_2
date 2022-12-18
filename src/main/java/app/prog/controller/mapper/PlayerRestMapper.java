package app.prog.controller.mapper;

import app.prog.controller.response.*;

import app.prog.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId_player())
                .name(domain.getName())
                .build();
    }

    public PlayerEntity toDomain(CreatePlayerResponse rest) {
        return PlayerEntity.builder()
                .name(rest.getName())
                .build();
    }

    public PlayerEntity toDomain(UpdatePlayerResponse rest) {
        return PlayerEntity.builder()
                .id_player(rest.getId())
                .name(rest.getName())
                .build();
    }
}
