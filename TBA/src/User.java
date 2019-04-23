/**
 * A user is someone who has projects and
 * works on them.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

import java.util.ArrayList;
import java.util.stream.Collectors;

public class User{
    private String name;
    private String email;
    private String password;
    private ArrayList<Project> projects;

    /**
     * User's default constructor.
     */
    public User(){
        this.name = "";
        this.email = "";
        this.password = "";
        this.projects = new ArrayList<Project>();
    }

    /**
     * User's parametrized constructor.
     *
     * @param name user's name
     * @param email user's email
     * @param password user's password
     * @param projects list of user's projects
     */
    public User(String name, String email, String password, ArrayList<Project> projects) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.projects = projects;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the user's email.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the user's password.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the user's projects list.
     *
     * @return projects
     */
    public ArrayList<Project> getProjects() {
        return projects.stream().map(Project::new).collect(Collectors.toCollection(ArrayList::new)); //Data protection
    }

    /**
     * Update the user's name.
     *
     * @param name a new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Update the user's email.
     *
     * @param email a new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Update the user's password.
     *
     * @param password a new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Update the user's projects list.
     *
     * @param projects a new projects list
     */
    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    /**
     * Is a way to show a user's information on the screen
     *
     * @return user's information
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("User\n");
        s.append("User's name: " + this.name + ".\n");
        s.append("User's email: " + this.email + ".\n");
        s.append("User's projects:\n");
        for(Project p: this.projects){
            s.append(" - " + p.toString() + ".\n");
        }

        return s.toString();
    }

    /**
     * Compare if it is the same user.
     *
     * @return boolean indicating if two objects are the same
     */
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }

        User test = (User) o;

        return test.name.equals(this.name) && test.email.equals(this.email) && test.password.equals(this.password)
                && test.projects.equals(projects);
    }

    /**
     * Make a copy of User.
     *
     * @return a clone of this instance
     */
    public User clone(){
        return new User(this);
    }
}
