import java.util.ArrayList;

/**
 * Collaborator extends superclass User and respresents
 * a project collaborator.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class Collaborator extends User{

    /**
     * Collaborator's default constructor.
     */
    public Collaborator(){
        super();
    }

    /**
     * Collaborator's parametrized constructor.
     *
     * @param name Collaborator's name
     * @param email Collaborator's email
     * @param password Collaborator's password
     * @param projects list of Collaborator's projects
     */
    public Collaborator(String name, String email, String password, ArrayList<Project> projects){
        super(name, email, password, projects);
    }

    /**
     * Collaborator's copy constructor.
     *
     * @param collaborator a collaborator
     */
    public Collaborator(Collaborator collaborator){
        super(collaborator);
    }

    /**
     * Is a way to show a collaborator's information on the screen
     *
     * @return collaborator's information
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Collaborator\n");
        s.append("Collaborator's name: " + getName() + ".\n");
        s.append("Collaborator's email: " + getEmail() + ".\n");
        s.append("Collaborator's projects: " + getProjects() + ".\n");

        return s.toString();
    }

    /**
     * Compare if it is the same collaborator.
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
