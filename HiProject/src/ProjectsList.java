import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a list of projects.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

public class ProjectsList {
    private List<Project> projects;

    /**
     * ProjectsList's default constructor.
     */
    public ProjectsList(){
        this.projects = new ArrayList<Project>();
    }


    /**
     * ProjectsList's default constructor.
     *
     * @param projects list of projects
     */
    public ProjectsList(List<Project> projects){
        setProjects(projects);
    }

    /**
     * ProjectsList's default constructor.
     *
     * @param projectsList a projects list
     */
    public ProjectsList(ProjectsList projectsList){
        this.projects = projectsList.getProjects();
    }

    /**
     * Returns the projects list.
     *
     * @return projects
     */
    public ArrayList<Project> getProjects(){
        return projects.stream().
                collect(Collectors.toCollection(ArrayList::new));     //Security (encapsulation)
    }

    /**
     * Updates the projects list.
     *
     * @param projects new projects list
     */
    public void setProjects(List<Project> projects){
        this.projects = projects.stream().
                collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Method that compares if two projects list are the same.
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

        ProjectsList that = (ProjectsList) o;

        return Objects.equals(projects, that.projects);
    }

    /**
     * Displays a projects list's information on the screen.
     *
     * @return projects list's information
     */
    @Override
    public String toString() {
        return "ProjectsList{" +
                "projects =" + projects +
                '}';
    }

    /**
     * Makes a copy of ProjectsList.
     *
     * @return a clone of this instance
     */
    @Override
    public ProjectsList clone(){
        return new ProjectsList(this);
    }

    /**
     * Method that add a project.
     *
     * @param p new project
     */
    public void addProject(Project p){
        this.projects.add(p);
    }
}
