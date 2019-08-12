package com.rogtejada.poc.app.dao;


import com.rogtejada.poc.app.db.Postgres;
import com.rogtejada.poc.app.entity.Client;
import com.rogtejada.poc.app.exception.DbException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    public List<Client> findAll() {
        try (
                PreparedStatement statement = Postgres.getConnection().prepareStatement("SELECT * FROM client");
                ResultSet resultSet = statement.executeQuery();
        ) {
            List<Client> clientList = new ArrayList<>();
            while (resultSet.next()) {
                Client client = instantiateClient(resultSet);
                clientList.add(client);
            }
            return clientList;
        } catch (SQLException e) {
            return new ArrayList<Client>();
        }
    }

    public void saveClient(Client client) {
        try (
                PreparedStatement statement = Postgres.getConnection().prepareStatement("INSERT INTO client (name,last_name,cpf) VALUES (?, ?, ?)");
        ) {

            statement.setString(1, client.getName());
            statement.setString(2, client.getLastName());
            statement.setString(3, client.getCpf());
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new DbException("Could not insert this client");
        }
    }

    public void deleteClientById(int id) {
        try (
                PreparedStatement statement = Postgres.getConnection().prepareStatement("DELETE FROM client WHERE id=?");
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException("Could not delete contact with this ID");
        }
    }

    private Client instantiateClient(ResultSet resultSet) throws SQLException {
        Client client = new Client();
        client.setId(resultSet.getInt("id"));
        client.setName(resultSet.getString("name"));
        client.setLastName(resultSet.getString("last_name"));
        client.setCpf(resultSet.getString("cpf"));
        return client;
    }
}
