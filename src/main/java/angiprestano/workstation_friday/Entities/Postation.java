package angiprestano.workstation_friday.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "postation")
@Getter
@Setter
@NoArgsConstructor
public class Postation {
    @Id
    @GeneratedValue
    private long id;

    private String description;
    @Enumerated(EnumType.STRING)

    private Type type;

    private int maxOccupants;

    private Users users;

    @OneToOne
    @JoinColumn(name = "id_edifice")
    private Edifice edifice;
    @OneToMany(mappedBy = "postation")
    private List<Prenotation> prenotations = new ArrayList<>();

    public Postation(String description, Type type, int maxOccupants, Users users, Edifice edifice) {
        this.description = description;
        this.type = type;
        this.maxOccupants = maxOccupants;
        this.users = users;
        this.edifice = edifice;
    }

    public Postation(String description, Type type, int maxOccupants, Users users, Edifice edifice, List<Prenotation> prenotations) {
        this.description = description;
        this.type = type;
        this.maxOccupants = maxOccupants;
        this.users = users;
        this.edifice = edifice;
        this.prenotations = prenotations;
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
