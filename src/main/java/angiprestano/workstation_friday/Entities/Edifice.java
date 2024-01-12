package angiprestano.workstation_friday.Entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Edifice {
    private long id;
    private String name;
    private String address;
    private String city;
}
