package com.mycompany;

import com.mycompany.user.User;
import com.mycompany.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired private UserRepository repo;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setEmail("meem@gmail.com");
        user.setPassword("19049");
        user.setFirstName("Mostofa");
        user.setLastName("Meem");

        User savedUser = repo.save(user);

        Assertions.assertNotNull(savedUser);
        //Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertTrue(savedUser.getId() > 0);
    }

    @Test
    public void testListAll(){
        Iterable<User> users = repo.findAll();
        Assertions.assertTrue(users.iterator().hasNext());

        for(User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void testUpdate(){
        Integer userId = 1;
        Optional<User> optionalUser = repo.findById(userId);
        User user = optionalUser.get();
        user.setPassword("CE190047");
        repo.save(user);
        User updatedUser = repo.findById(userId).get();

        Assertions.assertEquals("CE190047", updatedUser.getPassword());
    }

    @Test
    public void testget(){
        Integer userId = 2;
        Optional<User> optionalUser = repo.findById(userId);

        Assertions.assertTrue(optionalUser.isPresent());
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete(){
        Integer userId = 3;
        repo.deleteById(userId);

        Optional<User> optionalUser = repo.findById(userId);
        Assertions.assertFalse(optionalUser.isPresent());
    }

}
