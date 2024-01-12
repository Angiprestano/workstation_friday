package angiprestano.workstation_friday.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class Postation {
    private long id;

    private String description;

    private Type type;

    private int maxOccupants;

    private Users users;

    private Edifice edifice;

    public Postation(String description, Type type, int maxOccupants, Users users, Edifice edifice) {
        this.description = description;
        this.type = type;
        this.maxOccupants = maxOccupants;
        this.users = users;
        this.edifice = edifice;
    }

    @Override
    public String toString() {
        return "\n Postation{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", maxOccupants=" + maxOccupants +
                ", users=" + users +
                ", edifice=" + edifice +
                '}';
    }
}
