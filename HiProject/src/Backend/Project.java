package Backend; /**
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

import java.time.LocalDate;
import java.util.ArrayList;

public class Project{
	private String title;
	private String description;
	private LocalDate beginDate;
	private LocalDate endDate;
	private ArrayList<TasksList> lists;
	private Manager owner;
	private State projectState;
	private ArrayList<Contributor> users;

	/**
	 * Project's default constructor.
	 */
	public Project(){
		this.title = "";
		this.description = "";
		this.beginDate = LocalDate.MIN;
		this.endDate = LocalDate.MIN;
		this.lists = new ArrayList<TasksList>();
		this.owner = new Manager();
		this.projectState = State.NotStarted;
		this.users = new ArrayList<Contributor>();
	}

	/**
	 * Project's parametrized constructor.
	 *
	 * @param title project's title
	 * @param description project's description
	 * @param beginDate project's begin date
	 * @param endDate project's end date
	 * @param lists project's lists
	 * @param owner project's owner
	 * @param projectState project's state
	 * @param users project's users
	 */
	public Project(String title, String description, LocalDate beginDate,
				   LocalDate endDate, ArrayList<TasksList> lists, Manager owner,
				   State projectState, ArrayList<Contributor> users){
		this.title = title;
		this.description = description;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.lists = lists;
		this.owner = owner;
		this.projectState = projectState;
		this.users = users;
	}

	/**
	 * Project's parametrized constructor.
	 *
	 * @param title project's title
	 * @param description project's description
	 * @param endDate project's end date
	 * @param owner project's owner
	 */
	public Project(String title, String description,
				   LocalDate endDate, Manager owner){
		this.title = title;
		this.description = description;
		this.beginDate = LocalDate.now();
        this.endDate = endDate;
		this.lists = new ArrayList<TasksList>();
		this.owner = owner;
		this.projectState = State.NotStarted;
		this.users = new ArrayList<Contributor>();
	}

	/**
	 * Project's copy constructor.
	 *
	 * @param project a project
	 */
	public Project(Project project){
		this.title = project.getTitle();
		this.description = project.getDescription();
		this.beginDate = project.getBeginDate();
		this.endDate = project.getEndDate();
		this.lists = project.getLists();
		this.owner = project.getOwner();
		this.projectState = project.getProjectState();
		this.users = project.getUsers();
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
	public ArrayList<Contributor> getUsers() {
		return users;
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
	 * Updates a list of a project Contributors.
	 *
	 * @param users a new user's list
	 */
	public void setUsers(ArrayList<Contributor> users) {
		this.users = users;
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
		s.append("Project's users:\n");
		for(Contributor c: this.users){
			s.append(" - " + c.toString() + ".\n");
		}

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
					&& test.users.equals(this.users);
	}

	/**
	 * Makes a copy of a project.
	 *
	 * @return a clone of this instance
	 */
	public Project clone(){
		return new Project(this);
	}
}
