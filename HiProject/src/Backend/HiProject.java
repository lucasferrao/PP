package Backend;

import Exceptions.UserNullException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

/**
 * HiProject main application class.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class HiProject {
    private ProjectsList projects;
    private UsersList users;

    /**
     * HiProject's default constructor.
     */
    public HiProject(){
        this.projects = new ProjectsList();
        this.users = new UsersList();
    }

    /**
     * HiProject's parametrized constructor.
     *
     * @param projectList a projects list
     * @param usersList a users list
     */
    public HiProject(ProjectsList projectList, UsersList usersList){
        this.projects = projectList.clone();
        this.users = usersList.clone();
    }

    /**
     * HiProject's copy constructor.
     *
     * @param hiProject HiProject being replicated
     */
    public HiProject(HiProject hiProject){
        this.projects = hiProject.getProjects();
        this.users = hiProject.getUsers();
    }

    /**
     * Returns a projects list.
     *
     * @return projects
     */
    public ProjectsList getProjects() {
        return projects.clone();
    }

    /**
     * Returns a users list.
     *
     * @return users
     */
    public UsersList getUsers() {
        return users.clone();
    }

    /**
     * Updates a projects list.
     *
     * @param projects a new projects list
     */
    public void setProjects(ProjectsList projects) {
        this.projects = projects.clone();
    }

    /**
     * Updates a users list.
     *
     * @param users a new users list
     */
    public void setUsersList(UsersList users){
        this.users = users.clone();
    }


    /**
     * Displays a HiProject's information on the screen.
     *
     * @return HiProject's information
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("HiProject:\n");

        return s.toString();
    }

    /**
     * Method that compares if two HiProjects are the same.
     *
     * @param o object being used as a term of comparison
     *
     * @return boolean indicating if two objects are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || (this.getClass() != o.getClass()))
            return false;

        HiProject hiProject = (HiProject) o;

        return this.projects.equals(hiProject.getProjects()) &&
                this.users.equals(hiProject.getUsers());
    }

    /**
     * Makes a copy of a HiProject.
     *
     * @return a clone of this instance
     */
    @Override
    public HiProject clone(){
        return new HiProject(this);
    }

    /**
     * Method that registers a new user.
     *
     * @param name the name of the new user
     * @param email the email of the new user
     * @param password the password of the new user
     */
    public void registerNewUser(String name, String email, String password){
        User u = new User(name, email, password);
        this.users.addUser(u);
    }

    /**
     * Method that checks if exists a user with this email and password.
     *
     * @param email user's identifier
     * @param password user's password
     * @return true if the email and password combines
     * @throws UserNullException
     */
    /*public boolean login(String email, String password) throws UserNullException {
        return this.users.login(email, password);
    }*/

    /**
     * Method that changes the profile's settings.
     *
     * @param email user's identifier
     * @param name new user's name
     * @param password new user's password
     */
    public void editProfile(String email, String name, String password){
        this.users.editProfile(email, name, password);
    }

    /**
     * Method that creates a project.
     *
     * @param title project's title
     * @param description project's description
     * @param endDate project's end date
     * @param email project's owner email
     */
    public void createProject(String title, String description, LocalDate endDate, String email){
        Manager owner = new Manager();     // ?????
        Project p = new Project(title, description, endDate, owner);
        this.projects.addProject(p);
        this.users.addUserProject(owner.getEmail(), p);
    }

    public static void serializeJson(String file, Object obj) {

        if (obj instanceof UsersList) {
            UsersList usersList = (UsersList) obj;
            Map<String, User> users = usersList.getUsers();
            if (usersList.getUsers().isEmpty()) {
                return;
            } else {
                FileWriter writer;
                try {
                    writer = new FileWriter(file);
                    Gson gson = new GsonBuilder().create();
                    String jsonObj = gson.toJson(users);

                    writer.write(jsonObj);
                    writer.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /*FileWriter writer;
        try {
            writer = new FileWriter(file);
            Gson gson = new Gson();
            String jsonObj = gson.toJson(obj);

            writer.write(jsonObj);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public static boolean login(String email, String password) {

        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, User>>(){}.getType();
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get("C:\\Users\\Raphael\\Desktop\\PP\\HiProject\\src\\Estado\\UsersList.json")));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        Map<String, User> clonedMap = gson.fromJson(content, type);

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(clonedMap));

        UsersList usersList = new UsersList(clonedMap);
        User u = usersList.getUsers().get(email);

        return u.getPassword().equals(password);

    }

    public static void main(String[] args) {

        //Teste para verificar o funcionamento da serialização em json, apagar depois.
        UsersList usersList = new UsersList();
        usersList.addUser(new User("Lucas", "lucas@gmail.com", "password", new ArrayList<Project>()));
        usersList.addUser(new User("Joca", "jocagay@gmail.com", "password", new ArrayList<Project>()));
        serializeJson("C:\\Users\\Raphael\\Desktop\\PP\\HiProject\\src\\Estado\\UsersList.json", usersList);
        System.out.println(login("lucas@gmail.com", "password"));
    }


}
