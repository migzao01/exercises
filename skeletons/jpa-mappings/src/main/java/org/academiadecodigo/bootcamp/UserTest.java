package org.academiadecodigo.bootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserTest {

    private EntityManagerFactory emf;

    public UserTest() {
        emf = Persistence.createEntityManagerFactory("batata");
    }

    public static void main(String[] args) {

        UserTest test = new UserTest();

        User user = new User();
        user.setName("Lourenço");
        user.setEmail("lou@ren.com");
        user.setSurname("Marques");

        test.save(user);
        test.getUser(1);

    }

    private User getUser(Integer id) {

        EntityManager em = emf.createEntityManager();

        try {
            return em.find(User.class, id);

        } finally {
            if(em != null) {
                em.close();
            }
        }
    }

    private void save(User user) {

    }
}
