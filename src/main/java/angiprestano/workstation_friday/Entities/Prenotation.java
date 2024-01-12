package angiprestano.workstation_friday.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

public class Prenotation {
    private long id;
    private LocalDate hourofday;
    private Users users;
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
