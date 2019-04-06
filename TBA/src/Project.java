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
	private ArrayList<Collaborator> users;

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
	 * Returns the project's onwer.
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
	 * Returns a list of a project collaborators.
	 *
	 * @return users
	 */
	public ArrayList<Collaborator> getUsers() {
		return users;
	}

	/**
	 * Update the project title.
	 *
	 * @param title a new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Update the project description.
	 *
	 * @param description a new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Update the project begin date.
	 *
	 * @param beginDate a new begin date
	 */
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * Update the project end date.
	 *
	 * @param endDate a new end date
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * Update a list of tasks list.
	 *
	 * @param lists a new list
	 */
	public void setLists(ArrayList<TasksList> lists) {
		this.lists = lists;
	}

	/**
	 * Update the project's owner.
	 *
	 * @param owner a new onwer
	 */
	public void setOwner(Manager owner) {
		this.owner = owner;
	}

	/**
	 * Update the project state.
	 *
	 * @param projectState a new project state
	 */
	public void setProjectState(State projectState) {
		this.projectState = projectState;
	}

	/**
	 * Update a list of a project collaborators.
	 *
	 * @param users a new user's list
	 */
	public void setUsers(ArrayList<Collaborator> users) {
		this.users = users;
	}
}
