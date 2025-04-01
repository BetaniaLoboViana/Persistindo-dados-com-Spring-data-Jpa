package dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.model.user;
import dio.repository.userrepository;

@Component
public class StartApp implements CommandLineRunner {
@Autowired
private userrepository repository;
@Override

public void run (String... args) throws Exception {

    user user = new user();
    user.setName("Peter Rhae");
    user.setUsername("Foyet");
    user.setPassword("omnivore418");

    repository.save(user);

    for(user u: repository.findAll()){

        System.out.println(u);
    } 

}
}
