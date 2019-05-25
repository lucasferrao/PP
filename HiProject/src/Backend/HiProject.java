package Backend;

import Exceptions.UserDoesntExistException;

import java.io.Serializable;

/**
 * HiProject main application class.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class HiProject implements Serializable {
    private int projectID;
    private ProjectsList projects;
    private UsersList users;
    private User connectedUser;
    private final Serialization serialization = new Serialization(String.format("%s\\HiProject.data", System.getProperty("user.dir")));

    /**
     * HiProject's default constructor.
     */
    public HiProject(){
        this.projects = new ProjectsList();
        this.projectID = 0;
        this.users = new UsersList();
    }

    /**
     * HiProject's parametrized constructor.
     *
     * @param projectsList a projects list
     * @param usersList a users list
     */
    public HiProject(ProjectsList projectsList, UsersList usersList){
        this.projects = projectsList.clone();
        this.users = usersList.clone();
    }

    /**
     * HiProject's copy constructor.
     *
     * @param hiProject HiProject being replicated
     */
    public HiProject(HiProject hiProject){
        this.projects = hiProject.getProjects();
        this.projectID = hiProject.getProjectID();
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
     * Returns the project's ID.
     *
     * @return project's ID
     */
    public int getProjectID(){
        return this.projectID;
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
     * Returns the connected user.
     *
     * @return connectedUser
     */
    public User getConnectedUser() {
        return connectedUser;
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
     * Updates the project's ID.
     *
     * @param projectID new project's ID
     */
    public void setProjectID(int projectID){
        this.projectID = projectID;
    }

    /**
     * Updates a users list.
     *
     * @param users a new users list
     */
    public void setUsersList(UsersList users){
        this.users = users.clone();
    }


    public void setConnectedUser(User connectedUser) {
        this.connectedUser = connectedUser;
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
                this.users.equals(hiProject.getUsers()) && (hiProject.projectID == this.projectID);
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
     *
     */
    public void incProjectID() {
        projectID++;
    }

    /**
     * Method that registers a new user.
     *
     * @param name user's name
     * @param email user's email
     * @param password user's password
     */
    public void registerNewUser(String name, String email, String password){
        User u = new User(name, email, password);
        this.users.addUser(u);
        serialization.save(this);
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
     * Method that authenticates a user.
     *
     * @param email user's email
     * @param password user's password
     *
     * @return boolean indicating if the user exists
     */
    public boolean authenticateUser(String email, String password) {
        try{
            users = serialization.load().users;
            if (users.exists(email)) {
                User u = users.getUser(email);
                if (u.getPassword().equals(password)) {
                    connectedUser = u;
                    return true;
                }
            }
         }catch (Exception e) {
                e.printStackTrace();
            }
        return false;
    }

    public void addProjectAndSerialize(User user, Project project) {
        try {
            User u = users.getUser(user.getEmail());
            u.addProject(project);
            incProjectID();
            this.projects.addProject(project);
            serialization.save(this);
        } catch (UserDoesntExistException e) {
            e.printStackTrace();
        }
    }

    public void editUserProfileAndSerialize(User user, String name, String email, String password) {
        try {
            User u = this.users.getUser(user.getEmail());
            User newUser = new User(name, email, password, u.getProjects());
            this.users.getUsers().remove(u.getEmail());
            this.users.addUser(newUser);
            serialization.save(this);
        } catch (UserDoesntExistException e) {
            e.printStackTrace();
        }
    }

    public int getAndIncProjectID() {
        return projectID++;
    }


}
