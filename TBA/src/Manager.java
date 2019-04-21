import java.util.ArrayList;

/**
 * Manager extends superclass User and respresents
 * the project owner.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class Manager extends User{

    /**
     * Manager's default constructor.
     */
    public Manager(){
        super();
    }

    /**
     * Manager's parametrized constructor.
     *
     * @param name user's name
     * @param email user's email
     * @param password user's password
     * @param projects list of user's projects
     */
    public Manager(String name, String email, String password, ArrayList<Project> projects){
        super(name, email, password, projects);
    }

    /**
     * Manager's copy constructor.
     *
     * @param manager a Manager
     */
    public Manager(Manager manager){
        super(manager);
    }

    /**
     * Is a way to show a manager's information on the screen
     *
     * @return manager's information
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Manager\n");
        s.append("Manager's name: " + getName() + ".\n");
        s.append("Manager's email: " + getEmail() + ".\n");
        s.append("Manager's projects: " + getProjects() + ".\n");

        return s.toString();
    }

    /**
     * Compare if it is the same manager.
     *
     * @return boolean indicating if two objects are the same
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof User) {
            User test = (User) o;
            if ((test.getName().equals(this.getName())) && (test.getEmail().equals(this.getEmail())) &&
                    (test.getPassword().equals(this.getPassword())) && (test.getProjects().equals(this.getProjects()))){
                return true;
            }
        }
        return false;
    }
}
