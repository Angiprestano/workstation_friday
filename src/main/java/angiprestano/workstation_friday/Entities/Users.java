package angiprestano.workstation_friday.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class Users {
    private long id;

    private String username;

    private String completedName;

    private String email;
    private List<Prenotation> prenotations = new ArrayList<>();

}
