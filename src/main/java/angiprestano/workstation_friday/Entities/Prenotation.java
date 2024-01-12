package angiprestano.workstation_friday.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
@Entity
@Table(name = "prenotation")
@Getter
@Setter
@NoArgsConstructor

public class Prenotation {
    @Id
    @GeneratedValue
    private long id;

    private LocalDate hourofday;

    @ManyToOne
    @JoinColumn(name = "users")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "postation")
    private Postation postation;

    @Override
    public String toString() {
        return "Prenotation{" +
                "id=" + id +
                ", hourofday=" + hourofday +
                ", users=" + users +
                ", postation=" + postation +
                '}';
    }

    public Prenotation(LocalDate hourofday, Users users, Postation postation) {
        this.hourofday = hourofday;
        this.users = users;
        this.postation = postation;


    }
}
