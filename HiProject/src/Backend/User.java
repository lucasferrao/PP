/**
 * A user is someone who has projects and
 * works on them.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class User implements Serializable {
    private String name;
    private String email;
    private String password;
    private ProjectsList projects;

    /**
     * User's default constructor.
     */
    public User(){
        this.name = "";
        this.email = "";
        this.password = "";
        this.projects = new ProjectsList();
    }

    /**
     * User's parametrized constructor.
     *
     * @param name user's name
     * @param email user's email
     * @param password user's password
     * @param projects list of user's projects
     */
    public User(String name, String email, String password, ProjectsList projects) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.projects = projects;
    }

    /**
     * User's parametrized constructor.
     *
     * @param name user's name
     * @param email user's email
     * @param password user's password
     */
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.projects = new ProjectsList();
    }

    /**
     * User's copy constructor.
     *
     * @param user a user
     */
    public User(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.projects = user.getProjects();
    }

    /**
     * Returns the user's name.
     *
     * @return user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the user's email.
     *
     * @return user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the user's password.
     *
     * @return user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the user's projects list.
     *
     * @return user's projects
     */

    public ProjectsList getProjects() {
        return projects.clone();
    }

    /**
     * Updates the user's name.
     *
     * @param name a new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Updates the user's email.
     *
     * @param email a new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Updates the user's password.
     *
     * @param password a new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Updates the user's projects list.
     *
     * @param projects a new projects list
     */
    public void setProjects(ProjectsList projects) {
        this.projects = projects.clone();
    }

    /**
     * Displays a user's information on the screen.
     *
     * @return user's information
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("User\n");
        s.append("User's name: " + this.name + "\n");
        s.append("User's email: " + this.email + "\n");
        s.append("User's projects:\n");
        for(Project p : this.projects.getProjects().values()){
            s.append(" -> " + p.toString() + "\n");
        }

        return s.toString();
    }

    /**
     * Method that compares if two users are the same.
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
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }

        User test = (User) o;

        /*return test.name.equals(this.name) && test.email.equals(this.email) && test.password.equals(this.password)
                && test.projects.equals(projects);*/
        return this.email.equals(((User) o).getEmail());
    }

    /**
     * Makes a copy of User.
     *
     * @return a clone of this instance
     */
    @Override
    public User clone(){
        return new User(this);
    }

    /**
     * Method that add a project.
     *
     * @param p new project
     */
    public void addProject(Project p){
        this.projects.addProject(p);
    }
}
