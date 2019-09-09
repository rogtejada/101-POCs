package com.rogtejada.poc.app.dao;

import com.rogtejada.poc.app.entity.Client;
import com.rogtejada.poc.app.exception.DbException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class ClientDao {

    protected EntityManager entityManager;

    public ClientDao() {
        this.entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("clientTest").createEntityManager();
    }

    public List<Client> findAll() {
        return entityManager.createQuery("FROM " +
                Client.class.getName()).getResultList();
    }

    public void saveClient(Client client) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(client);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            throw new DbException("Could not Save Client");
        }
    }

    public void deleteClientById(int id) {
        try {
            entityManager.getTransaction().begin();
            Client client = entityManager.find(Client.class, id);
            entityManager.remove(client);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            throw new DbException("Could not delete this client");
        }
    }
}
