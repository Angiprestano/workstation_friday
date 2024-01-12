package angiprestano.workstation_friday.DAO;

import angiprestano.workstation_friday.Entities.Prenotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotationDAO extends JpaRepository <Prenotation, Long> {
}
