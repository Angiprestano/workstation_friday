package angiprestano.workstation_friday.DAO;

import angiprestano.workstation_friday.Entities.Edifice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificeDAO extends JpaRepository<Edifice, Long> {
}
