package angiprestano.workstation_friday.Entities;

import angiprestano.workstation_friday.DAO.UsersService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor

public class Users {
    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String completedName;

    private String email;

    @OneToMany(mappedBy = "users")
    private List<Prenotation> prenotations = new ArrayList<>();

    public Users(String username, String completedName, String email) {
        this.username = username;
        this.completedName = completedName;
        this.email = email;
    }
}
