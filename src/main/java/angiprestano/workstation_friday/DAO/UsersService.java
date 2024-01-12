package angiprestano.workstation_friday.DAO;

import angiprestano.workstation_friday.Entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private static UsersDAO usersDAO;
    public static void saveUsers(Users users) {
        usersDAO.save(users);
        System.out.println("Element saved successfully");
    }
}
