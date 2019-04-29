import Exceptions.UserNullException;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * HiProject main application class.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class HiProject implements Serializable{
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
    public boolean login(String email, String password) throws UserNullException {
        return this.users.login(email, password);
    }

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
}
