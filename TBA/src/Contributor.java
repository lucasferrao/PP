import java.util.ArrayList;

/**
 * Contributor extends superclass User and represents
 * a project Contributor.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class Contributor extends User {

    /**
     * Contributor's default constructor.
     */
    public Contributor() {
        super();
    }

    /**
     * Contributor's parametrized constructor.
     *
     * @param name     Contributor's name
     * @param email    Contributor's email
     * @param password Contributor's password
     * @param projects list of Contributor's projects
     */
    public Contributor(String name, String email, String password, ArrayList<Project> projects) {
        super(name, email, password, projects);
    }

    /**
     * Contributor's copy constructor.
     *
     * @param Contributor a Contributor
     */
    public Contributor(Contributor Contributor) {
        super(Contributor);
    }

    /**
     * Is a way to show a Contributor's information on the screen.
     *
     * @return Contributor's information
     */
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Contributor\n");
        s.append("Contributor's name: " + getName() + ".\n");
        s.append("Contributor's email: " + getEmail() + ".\n");
        s.append("Contributor's projects: " + getProjects() + ".\n");

        return s.toString();
    }

    /**
     * Compare if it is the same Contributor.
     *
     * @return boolean indicating if two objects are the same
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || this.getClass() != o.getClass()) {
            return false;
        }

        User test = (User) o;

        return super.equals(test);
    }

    /**
     * Make a copy of a contributor.
     *
     * @return a clone of this instance
     */
    public Contributor clone() {
        return new Contributor(this);
    }
}
