package Backend;

import java.io.Serializable;
import java.time.LocalDate;
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

public class ProjectsList implements Serializable {
    private Map<Integer, Project> projects;

    /**
     * ProjectsList's default constructor.
     */
    public ProjectsList(){
        this.projects = new HashMap<Integer, Project>();
    }

    /**
     * ProjectsList's parametrized constructor.
     *
     * @param projects list of projects
     */
    public ProjectsList(Map<Integer, Project> projects){
        for(Map.Entry<Integer, Project> e : projects.entrySet()){
            this.projects.put(e.getKey(), e.getValue());
        }
        this.projects.forEach((k,v) -> v = v.clone());
        this.projects = projects;
    }

    /**
     * ProjectsList's copy constructor.
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
    public Map<Integer, Project> getProjects(){
        return projects.entrySet().stream().collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue().clone()));
    }

    /**
     * Updates the projects list.
     *
     * @param projects new projects list
     */
    public void setProjects(Map<Integer, Project> projects){
        this.projects.putAll(projects);
        this.projects.forEach((k,v) -> v = v.clone());
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

        /*if(o instanceof Contributor){
            return true;
        }

        if(o instanceof Manager){
            return true;
        }*/

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        ProjectsList that = (ProjectsList) o;

        //return Objects.equals(projects, that.projects);
        return projects.equals(((ProjectsList) o).getProjects());
    }

    /**
     * Displays a projects list's information on the screen.
     *
     * @return projects list's information
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        int count = 0;

        s.append("Projects list:\n");
        for(Map.Entry<Integer, Project> e : projects.entrySet()) {
            s.append("Project " + (count + 1) + ": " + e.toString() + "\n");
        }

        return s.toString();
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
        this.projects.put(p.getProjectID(), p);
    }

    /**
     * Method that edit a project.
     *
     * @param projectID the project that has that ID
     * @param title new title
     * @param description new description
     * @param endDate new end date
     */
    public void editProject(int projectID, String title, String description, LocalDate endDate){
        Project p = this.projects.get(projectID);
        p.setTitle(title);
        p.setDescription(description);
        p.setEndDate(endDate);
    }

    /**
     * Method to get a project.
     *
     * @param projectID the project that has that ID
     */
    public Project getProject(int projectID){
        return this.projects.get(projectID);
    }

    /**
     * Method that add contributors to a project.
     *
     * @param contributor new contributors
     */
    public void addContributors(int projectID, Contributor contributor, ArrayList<Contributor> contributors){
        Project p = this.getProject(projectID);
        Manager owner = p.getOwner();

        if(owner.equals(contributor)){
            for(Contributor e : contributors) {
                p.getContributors().add(e);
            }
        }
    }

    /**
     * Method that adds a tasks list to a project.
     *
     * @param projectID a project's ID
     * @param tasksList a list of tasks
     */
    public void addTasksList(int projectID, TasksList tasksList){
        Project p = this.getProject(projectID);
        p.getLists().add(tasksList);
    }

    /**
     * Method that returns the number of completed projects.
     *
     * @return the finished projects
     */
    public int completedProjects(){
        int finishedProject = 0;
        for(Map.Entry<Integer, Project> e : projects.entrySet()){
            State projectState = e.getValue().getProjectState();
            if(projectState.equals(State.Finished)){
                finishedProject++;
            }
        }

        return finishedProject;
    }

    /**
     * Method that returns the number of ongoing projects.
     *
     * @return the ongoing projects
     */
    public int ongoingProjects(){
        int ongoingProjects = 0;
        LocalDate now = LocalDate.now();
        for(Map.Entry<Integer, Project> e : projects.entrySet()){
            State projectState = e.getValue().getProjectState();
            LocalDate projectEndDate = e.getValue().getEndDate();
            if(projectState.equals(State.Started) && projectEndDate.isAfter(now)){
                ongoingProjects++;
            }
        }

        return ongoingProjects;
    }

    /**
     * Method that returns the number of late projects.
     *
     * @return the late projects
     */
    public int lateProjects(){
        int lateProjects = 0;
        LocalDate now = LocalDate.now();
        for(Map.Entry<Integer, Project> e : projects.entrySet()){
            State projectState = e.getValue().getProjectState();
            LocalDate projectEndDate = e.getValue().getEndDate();
            if(!projectState.equals(State.Finished) && projectEndDate.isBefore(now)){
                lateProjects++;
            }
        }

        return lateProjects;
    }

    /**
     * Method that returns the three most delayed projects.
     *
     * @return the delayed projects
     */
    public ArrayList<Project> delayedProjects(){
        List<Project> delayedProjects = new ArrayList<Project>();
        LocalDate now = LocalDate.now();
        for(Map.Entry<Integer, Project> e : projects.entrySet()){
            LocalDate projectEndDate = e.getValue().getEndDate();
            State projectState = e.getValue().getProjectState();
            if(!projectState.equals(State.Finished) && !projectEndDate.isAfter(now)){
                delayedProjects.add(e.getValue());
            }
        }

        return (ArrayList<Project>) delayedProjects.stream().
                sorted(Comparator.comparing(Project :: getEndDate)).limit(3).
                collect(Collectors.toList());
    }

    /**
     * Method that gives the biggest project.
     *
     * @return the biggest project
     */
    public Project biggestProject(){
        double total = 0.0;
        double biggestTotal = 0.0;
        Project biggestProject = new Project();

        for(Map.Entry<Integer, Project> e : projects.entrySet()){
            total = 1.5 * e.getValue().getContributors().size();
            for(TasksList t : e.getValue().getLists()){
                total += t.getTasks().size();
            }

            if(total >= biggestTotal){
                biggestTotal = total;
                biggestProject = e.getValue();
            }
        }

        return  biggestProject;
    }

    public Project getProjectByTitle(String projectTitle) {
        for (Map.Entry<Integer, Project> e : projects.entrySet()) {
            if (e.getValue().getTitle().equals(projectTitle)) {
                return e.getValue();
            }
        }
        return null;
    }

    public boolean exists(String title) {
        return getProjectByTitle(title) != null;
    }

    public void remove(int key) {
        this.projects.remove(key);
    }
}