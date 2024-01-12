package angiprestano.workstation_friday.Entities;


import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Edifice {
    @Getter
    private long id;

    private String name;

    private String address;

    private String city;

    private Postation postation;

    public Edifice(long id, String name, String address, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Edifice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postation=" + postation +
                '}';
    }
}
