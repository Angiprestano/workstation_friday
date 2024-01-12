package angiprestano.workstation_friday.DAO;

import angiprestano.workstation_friday.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO extends JpaRepository<Users, Long> {

}
