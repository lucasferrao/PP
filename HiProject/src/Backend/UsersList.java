package Backend;

import Exceptions.UserDoesntExistException;
import Exceptions.UserNullException;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a list of users.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class UsersList implements Serializable {
    private Map<String, User> users;

    /**
     * UsersList's default constructor.
     */
    public UsersList(){
        this.users = new HashMap<String, User>();
    }

    /**
     * UsersList's parametrized constructor.
     *
     * @param users Map of users
     */
    public UsersList(Map<String, User> users){
        for(Map.Entry<String, User> e : users.entrySet()){
            this.users.put(e.getKey(), e.getValue());
        }
        this.users.forEach((k,v) -> v = v.clone());
    }

    /**
     * UsersList's copy constructor.
     *
     * @param usersList UsersList being replicated
     */
    public UsersList(UsersList usersList){
        this.users = usersList.getUsers();
    }

    /**
     * Returns Map with users.
     *
     * @return Map with users
     */
    public Map<String, User> getUsers() {
        return users.entrySet().stream().collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue().clone()));
    }

    /**
     * Updates the set of users.
     *
     * @param users Map with users
     */
    public void setUsers(HashMap<String, User> users) {
        this.users.putAll(users);
        this.users.forEach((k,v) -> v = v.clone());
    }

    /**
     * Displays a users list's information on the screen.
     *
     * @return users list's information
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        int count = 0;

        s.append("Users list:\n");
        for(Map.Entry<String, User> e : users.entrySet()) {
            s.append("User " + (count + 1) + ": " + e.toString() + "\n");
        }

        return s.toString();
    }

    /**
     * Method that compares if two users list are the same.
     *
     * @param o object being used as a term of comparison
     *
     * @return boolean indicating if two objects are the same
     */
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        UsersList test = (UsersList) o;

        return test.users.equals(this.users);
    }

    /**
     * Makes a copy of UsersList.
     *
     * @return a clone of this instance
     */
    @Override
    public UsersList clone(){
        return new UsersList(this);
    }

    /**
     * Method the add a user.
     *
     * @param u a new user
     */
    public void addUser(User u){
        this.users.put(u.getEmail(), u);
    }

    /**
     * Method that changes the profile's settings.
     *
     * @param email user's identifier
     * @param name new user's name
     * @param password new password's name
     */
    public void editProfile(String email, String name, String password){
        User u = this.users.get(email);
        u.setName(name);
        u.setPassword(password);
    }

    /**
     * Method that checks if a user with the given username exists.
     *
     * @param email user's identifier
     */
    public boolean exists(String email) {
        return users.containsKey(email);
    }

    /**
     * Method that returns a user.
     *
     * @param email the user's email
     * @return a user
     * @throws UserDoesntExistException
     */
    public User getUser(String email) throws UserDoesntExistException {
        if (users.containsKey(email)){
            return users.get(email);
        }else{
            throw new UserDoesntExistException("This user doesn't exist.");
        }
    }

    public void remove(String email) {
        this.users.remove(email);
    }
}