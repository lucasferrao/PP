import java.time.LocalDate;
import java.util.ArrayList;

public class Project{

	//Instance variables
	private String title;
	private String description;
	private LocalDate beginDate;
	private LocalDate endDate;
	private ArrayList<TasksList> lists;
	private Manager owner;
	private State projectState;
	private ArrayList<Collaborator> users;

	//Getters
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public ArrayList<TasksList> getLists() {
		return lists;
	}

	public Manager getOwner() {
		return owner;
	}

	public State getProjectState() {
		return projectState;
	}

	public ArrayList<Collaborator> getUsers() {
		return users;
	}

	//Setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setLists(ArrayList<TasksList> lists) {
		this.lists = lists;
	}

	public void setOwner(Manager owner) {
		this.owner = owner;
	}

	public void setProjectState(State projectState) {
		this.projectState = projectState;
	}

	public void setUsers(ArrayList<Collaborator> users) {
		this.users = users;
	}
}
