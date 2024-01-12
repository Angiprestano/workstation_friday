package angiprestano.workstation_friday.Entities;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;

public class Postation {
    private long id;
    private String description;
    private Type type;
    private int maxOccupants;
    private Edifice edifice;
    private int day;
    private Users users;
}
