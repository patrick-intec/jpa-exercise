package be.infernalwhale.dao;

import be.infernalwhale.model.Account;

import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private EntityManagerFactory emf;

    public AccountDaoImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void save(Account account) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); 
    }

    @Override
    public Account findById(Long id) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!");
    }

    @Override
    public Account findByEmail(String email) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!");
    }
    
    @Override
    public Account findByCreationDateAfter(LocalDate date) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!");
    }

    @Override
    public List<Account> findAll() {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!");
    }

    @Override
    public void update(Account account) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!");
    }

    @Override
    public void remove(Account account) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("I don't wanna work without implementation!");
    }
}

