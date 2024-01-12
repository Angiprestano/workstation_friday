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

    public Edifice(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Edifice(String name, String address, String city, Postation postation) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postation = postation;
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
