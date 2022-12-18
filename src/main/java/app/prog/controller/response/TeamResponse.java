package app.prog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id;
    private String name;
    private String particularity;
    private boolean hasParticularity;
}
