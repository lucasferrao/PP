package Backend;

/**
 * A project has a list of tasks lists and
 * has a team that works on that tasks. A project
 * has a owner too and he's the only one
 * who can manage the users and edit project
 * general data.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project implements Serializable {
	private int projectID;
	private String title;
	private String description;
	private LocalDate beginDate;
	private LocalDate endDate;
	private ArrayList<TasksList> lists;
	private Manager owner;
	private State projectState;
	private ArrayList<Contributor> contributors;

	private static int nextID = 1;

	/**
	 * Project's default constructor.
	 */
	public Project(){
		this.projectID = Project.getAndIncNextID();
		this.title = "";
		this.description = "";
		this.beginDate = LocalDate.MIN;
		this.endDate = LocalDate.MIN;
		this.lists = new ArrayList<TasksList>();
		this.owner = new Manager();
		this.projectState = State.NotStarted;
		this.contributors = new ArrayList<Contributor>();
	}

	/**
	 * Project's parametrized constructor.
	 *
	 * @param projectID project's ID
	 * @param title project's title
	 * @param description project's description
	 * @param beginDate project's begin date
	 * @param endDate project's end date
	 * @param lists project's lists
	 * @param owner project's owner
	 * @param projectState project's state
	 * @param contributors project's contributors
	 */
	public Project(int projectID, String title, String description, LocalDate beginDate,
				   LocalDate endDate, ArrayList<TasksList> lists, Manager owner,
				   State projectState, ArrayList<Contributor> contributors){
		this.projectID = projectID;
		this.title = title;
		this.description = description;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.lists = lists;
		this.owner = owner;
		this.projectState = projectState;
		this.contributors = contributors;
	}

	/**
	 * Project's parametrized constructor.
	 *
	 * @param title project's title
	 * @param description project's description
	 * @param endDate project's end date
	 * @param owner project's owner
	 */
	public Project(String title, String description, LocalDate beginDate,
				   LocalDate endDate, Manager owner){
		this.projectID = Project.getAndIncNextID();
		this.title = title;
		this.description = description;
		this.beginDate = beginDate;
        this.endDate = endDate;
		this.lists = new ArrayList<TasksList>();
		this.owner = owner;
		this.projectState = State.Started;
		this.contributors = new ArrayList<Contributor>();
	}

	/**
	 * Project's copy constructor.
	 *
	 * @param project a project
	 */
	public Project(Project project){
		this.projectID = project.getProjectID();
		this.title = project.getTitle();
		this.description = project.getDescription();
		this.beginDate = project.getBeginDate();
		this.endDate = project.getEndDate();
		this.lists = project.getLists();
		this.owner = project.getOwner();
		this.projectState = project.getProjectState();
		this.contributors = project.getContributors();
	}

	/**
	 * Method that returns the project's ID.
	 *
	 * @return projectID
	 */
	public static int getAndIncNextID(){
		return Project.nextID++;
	}

	/**
	 * Returns the project's ID.
	 *
	 * @return projectID
	 */
	public int getProjectID(){
		return this.projectID;
	}

	/**
	 * Returns the project title.
	 *
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the project description.
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the project begin date.
	 *
	 * @return begin date
	 */
	public LocalDate getBeginDate() {
		return beginDate;
	}

	/**
	 * Returns the project end date.
	 *
	 * @return end date
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * Returns a list of tasks list.
	 *
	 * @return list of a tasks list
	 */
	public ArrayList<TasksList> getLists() {
		return lists;
	}

	/**
	 * Returns the project's owner.
	 *
	 * @return owner
	 */
	public Manager getOwner() {
		return owner;
	}

	/**
	 * Returns the project state.
	 *
	 * @return projectState
	 */
	public State getProjectState() {
		return projectState;
	}

	/**
	 * Returns a list of a project contributors.
	 *
	 * @return users
	 */
	public ArrayList<Contributor> getContributors() {
		return contributors;
	}

	/**
	 * Returns the next project's ID.
	 *
	 * @return nextID
	 */
	public static int getNextID(){
		return Project.nextID;
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
	 * Updates the project title.
	 *
	 * @param title a new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Updates the project description.
	 *
	 * @param description a new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Updates the project begin date.
	 *
	 * @param beginDate a new begin date
	 */
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * Updates the project end date.
	 *
	 * @param endDate a new end date
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * Updates a list of tasks list.
	 *
	 * @param lists a new list
	 */
	public void setLists(ArrayList<TasksList> lists) {
		this.lists = lists;
	}

	/**
	 * Updates the project's owner.
	 *
	 * @param owner a new owner
	 */
	public void setOwner(Manager owner) {
		this.owner = owner;
	}

	/**
	 * Updates the project state.
	 *
	 * @param projectState a new project state
	 */
	public void setProjectState(State projectState) {
		this.projectState = projectState;
	}

	/**
	 * Updates a list of a project's contributors.
	 *
	 * @param contributors a new user's contributors
	 */
	public void setContributors(ArrayList<Contributor> contributors) {
		this.contributors = contributors;
	}

	/**
	 * Updates the next project's ID
	 *
	 * @param nextID
	 */
	public static void setNextID(int nextID){
		Project.nextID = nextID;
	}

	/**
	 * Displays a project's information on the screen.
	 *
	 * @return project's information
	 */
	public String toString(){
		StringBuilder s = new StringBuilder();

		s.append("Project\n");
		s.append("Project's title: " + this.title + ".\n");
		s.append("Project's description: " + this.description + ".\n");
		s.append("Project's begin date: " + this.beginDate + ".\n");
		s.append("Project's end date: " + this.endDate + ".\n");
		s.append("Project's lists:\n");
		for(TasksList t: this.lists){
			s.append(" - " + t.toString() + ".\n");
		}
		s.append("Project's owner: " + this.owner.toString() + ".\n");
		s.append("Project's state: " + this.projectState + ".\n");
		s.append("Project's contributors:\n");
		for(Contributor c: this.contributors){
			s.append(" - " + c.toString() + ".\n");
		}
		s.append("Project's ID: " + projectID + ".");

		return s.toString();
	}

	/**
	 * Method that compares if two projects are the same.
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
		if(o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Project test = (Project) o;

		return test.title.equals(this.title) && test.description.equals(this.description) &&
					test.beginDate.equals(this.beginDate) && test.endDate.equals(this.endDate) &&
					test.lists.equals(this.lists) && test.owner.equals(this.owner) &&
					test.projectState.equals(this.projectState)
					&& test.contributors.equals(this.contributors) && (test.projectID == this.projectID);
	}

	/**
	 * Makes a copy of a project.
	 *
	 * @return a clone of this instance
	 */
	public Project clone(){
		return new Project(this);
	}

	public void addTasksList(int projectID, TasksList t){
		Project p = new Project();
		p.setProjectID(projectID);
		p.lists.add(t);
	}

	/**
	 * Method that verifies which tasks are late.
	 *
	 * @return latestTasks
	 */
	public TasksList lateTasks(){
		List<Task> latestTasks = new ArrayList<Task>();
		LocalDate now = LocalDate.now();
		for(TasksList e : this.lists){
			for(Task t : e.getTasks()){
				LocalDate taskDate = t.getEndDate();
				if(taskDate.isAfter(now)){
					latestTasks.add(t);
				}
			}
		}

		return (TasksList) latestTasks;
	}


}
