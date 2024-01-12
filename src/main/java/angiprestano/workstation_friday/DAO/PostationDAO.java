package angiprestano.workstation_friday.DAO;

import angiprestano.workstation_friday.Entities.Postation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostationDAO extends JpaRepository<Postation, Long> {
}
