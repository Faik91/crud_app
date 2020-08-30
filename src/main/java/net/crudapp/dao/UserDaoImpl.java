package net.crudapp.dao;

import net.crudapp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        return this.entityManager.createQuery("from User").getResultList();
    }

    @Override
    public void addUser(User user) {
        this.entityManager.persist(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = (User) this.entityManager.find(User.class, id);
        this.entityManager.remove(user);
    }

    @Override
    public void editUser(User user) {
        this.entityManager.merge(user);
    }

    @Override
    public User getUserById(int id) {
        return (User) this.entityManager.find(User.class, id);

    }
}
