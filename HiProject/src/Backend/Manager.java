package Backend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Manager extends superclass User and represents
 * the project's owner.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class Manager extends User implements Serializable {

    /**
     * Manager's default constructor.
     */
    public Manager(){
        super();
    }


    public Manager(User toManager) {
        super(toManager);
    }

    /**
     * Manager's parametrized constructor.
     *
     * @param name user's name
     * @param email user's email
     * @param password user's password
     * @param projects list of user's projects
     */
    public Manager(String name, String email, String password, ProjectsList projects){
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
     * Displays a manager's information on the screen.
     *
     * @return manager's information
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Manager\n");
        s.append("Manager's name: " + getName() + ".\n");
        s.append("Manager's email: " + getEmail() + ".\n");
        s.append("Manager's projects: " + getProjects() + ".\n");

        return s.toString();
    }

    /**
     * Method that compares if two managers are the same.
     *
     * @param o object being used as a term of comparison
     *
     * @return boolean indicating if two objects are the same
     */
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if((o == null) || this.getClass() != o.getClass()) {
            return false;
        }

        Manager test = (Manager) o;

        return this.getEmail().equals(((Manager) o).getEmail());
    }

    /**
     * Makes a copy of a manager.
     *
     * @return a clone of this instance
     */
    @Override
    public Manager clone(){
        return new Manager(this);
    }
}
