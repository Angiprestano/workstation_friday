package angiprestano.workstation_friday.Entities;

import angiprestano.workstation_friday.DAO.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Component
public class Runner  implements CommandLineRunner {
    @Autowired
    private  UsersService usersService;
    @Override
    public void run(String... args) throws Exception {

        Users users = new Users("Laura", "LauraPausini" , "laurapausini74@gmail.com");
        UsersService.saveUsers(users);
    }
}
