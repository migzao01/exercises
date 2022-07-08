package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.ConnectionManager;
import org.academiadecodigo.bootcamp.utils.Security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class JdbcUserService implements UserService {

    private Connection dbConnection;
    private ConnectionManager connectionManager;

    public JdbcUserService(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
        this.dbConnection = connectionManager.getConnection();
    }

    private void checkConnection() throws SQLException {

        if (dbConnection == null || dbConnection.isClosed()) {
            dbConnection = connectionManager.getConnection();
        }

        if (dbConnection == null) {
            throw new IllegalStateException("Error connecting to the database");
        }

    }


    /**
     * Authenticates the user using the given username and password
     *
     * @param username the user name
     * @param password the user password
     * @return true if authenticated
     */
    @Override
    public boolean authenticate(String username, String password) {

        boolean result = false;

        try {

            checkConnection();

            // create a query
            String query = "SELECT * FROM user WHERE username=? AND password=?";

            // create a new statement
            PreparedStatement statement = dbConnection.prepareStatement(query);

            statement.setString(1, username);
            statement.setString(2, Security.getHash(password));

            // execute the query
            ResultSet resultSet = statement.executeQuery();

            // if the user exists
            if (resultSet.next()) {
                result = true;
            }

            if (statement != null) {
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }

        return result;
    }

    /**
     * Adds a new user
     *
     * @param user the new user to add
     */
    @Override
    public void add(User user) {

        try {

            checkConnection();

            if (findByName(user.getUsername()) != null) {
                return;
            }

            // create a query
            String query = "INSERT INTO user(username, password, email, firstname, lastname, phone) VALUES (?,?,?,?,?,?)";

            // create a new statement
            PreparedStatement statement = dbConnection.prepareStatement(query);

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getFirstName());
            statement.setString(5, user.getLastName());
            statement.setString(6, user.getPhone());

            // execute the query
            statement.executeUpdate();


            if (statement != null) {
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }

    }

    /**
     * Finds a user by name
     *
     * @param username the user name used to lookup a user
     * @return a new User if found, null otherwise
     */
    @Override
    public User findByName(String username) {

        User user = null;

        try {

            checkConnection();

            // create a query
            String query = "SELECT * FROM user WHERE username=?";

            // create a new statement
            PreparedStatement statement = dbConnection.prepareStatement(query);

            statement.setString(1, username);

            // execute the query
            ResultSet resultSet = statement.executeQuery();

            // user exists
            if (resultSet.next()) {

                String usernameValue = resultSet.getString("username");
                String passwordValue = resultSet.getString("password");
                String emailValue = resultSet.getString("email");
                String firstNameValue = resultSet.getString("firstname");
                String lastNameValue = resultSet.getString("lastname");
                String phoneValue = resultSet.getString("phone");

                user = new User(usernameValue, emailValue, passwordValue, firstNameValue, lastNameValue, phoneValue);
            }

            if (statement != null) {
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }

        return user;
    }


    /**
     * Finds all users
     *
     * @return list of users if found, null otherwise
     */
    @Override
    public List<User> findAll() {

        List<User> users = new LinkedList<>();

        try {

            checkConnection();

            // create a query
            String query = "SELECT * FROM user";

            // create a new statement
            PreparedStatement statement = dbConnection.prepareStatement(query);

            // execute the query
            ResultSet resultSet = statement.executeQuery();

            // user exists
            while (resultSet.next()) {

                String usernameValue = resultSet.getString("username");
                String passwordValue = resultSet.getString("password");
                String emailValue = resultSet.getString("email");
                String firstNameValue = resultSet.getString("firstname");
                String lastNameValue = resultSet.getString("lastname");
                String phoneValue = resultSet.getString("phone");

                users.add(new User(usernameValue, emailValue, passwordValue, firstNameValue, lastNameValue, phoneValue));
            }

            if (statement != null) {
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }

        return users;
    }


    /**
     * Count the number of existing users
     *
     * @return the number of users
     */
    @Override
    public int count() {

        int result = 0;

        try {

            checkConnection();

            // create a query
            String query = "SELECT COUNT(*) FROM user";

            // create a new statement
            PreparedStatement statement = dbConnection.prepareStatement(query);

            // execute the query
            ResultSet resultSet = statement.executeQuery();

            // get the results
            if (resultSet.next()) {
                result = resultSet.getInt(1);
            }

            if (statement != null) {
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }

        return result;

    }
}
