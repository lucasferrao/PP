/**
 * Is a task of a project that represents
 * something that needs to be done.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

package Backend;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable {
	private String title;
	private User creator;
	private User contributor;
	private String description;
	private State taskState;
	private LocalDate beginDate;
	private LocalDate endDate;
	private LocalDate limitDate;
	private TasksPriority priority;

	/**
	 * Task's default constructor.
	 */
	public Task(){
		this.title = "";
		this.creator = new User();
		this.contributor = new User();
		this.description = "";
		this.taskState = State.NotStarted;
		this.beginDate = LocalDate.MIN;
		this.endDate = LocalDate.MIN;
		this.limitDate = LocalDate.MIN;
		this.priority = TasksPriority.Low;
	}

	/**
	 * Task's parametrized constructor.
	 *
	 * @param title task's title
	 * @param creator task's creator
	 * @param contributor task's contributor
	 * @param description task's description
	 * @param taskState task's state
	 * @param beginDate task's begin date
	 * @param endDate task's end date
	 * @param limitDate task's limit date
	 * @param priority task's priority
	 */
	public Task(String title, User creator, User contributor, String description,
				State taskState, LocalDate beginDate, LocalDate endDate,
				LocalDate limitDate, TasksPriority priority) {
		this.title = title;
		this.creator = creator;
		this.contributor = contributor;
		this.description = description;
		this.taskState = taskState;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.limitDate = limitDate;
		this.priority = priority;
	}

	/**
	 * Task's copy constructor.
	 *
	 * @param task a task
	 */
	public Task(Task task){
		this.title = task.getTitle();
		this.creator = task.getCreator();
		this.contributor = task.getContributor();
		this.description = task.getDescription();
		this.taskState = task.getTaskState();
		this.beginDate = task.getBeginDate();
		this.endDate = task.getEndDate();
		this.limitDate = task.getLimitDate();
		this.priority = task.getPriority();
	}

	/**
	 * Returns the task's title.
	 *
	 * @return task's title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Returns the task's creator.
	 *
	 * @return task's creator
	 */
	public User getCreator() {
		return this.creator;
	}

	/**
	 * Returns the task's contributor.
	 *
	 * @return task's contributor
	 */
	public User getContributor() {
		return this.contributor;
	}

	/**
	 * Returns the task's description.
	 *
	 * @return task's description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Returns the task's state.
	 *
	 * @return task's state
	 */
	public State getTaskState() {
		return this.taskState;
	}

	/**
	 * Returns the task's begin date.
	 *
	 * @return task's begin date
	 */
	public LocalDate getBeginDate() {
		return this.beginDate;
	}

	/**
	 * Returns the task's end date.
	 *
	 * @return task's end date
	 */
	public LocalDate getEndDate() {
		return this.endDate;
	}

	/**
	 * Returns the task's limit date.
	 *
	 * @return task's limit date
	 */
	public LocalDate getLimitDate() {
		return this.limitDate;
	}

	/**
	 * Returns the task's priority.
	 *
	 * @return task's priority
	 */
	public TasksPriority getPriority() {
		return this.priority;
	}

	/**
	 * Updates the task's title.
	 *
	 * @param title a new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Updates the task's creator.
	 *
	 * @param creator a new creator
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * Updates the task's contributor.
	 *
	 * @param contributor a new contributor
	 */
	public void setContributor(User contributor) {
		this.contributor = contributor;
	}

	/**
	 * Updates the task's description.
	 *
	 * @param description a new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Updates the task's state.
	 *
	 * @param taskState a new task state
	 */
	public void setTaskState(State taskState) {
		this.taskState = taskState;
	}

	/**
	 * Updates the task's begin date.
	 *
	 * @param beginDate a new begin date
	 */
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * Updates the task's end date.
	 *
	 * @param endDate a new end date
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * Updates the task's limit date.
	 *
	 * @param limitDate a new limit date
	 */
	public void setLimitDate(LocalDate limitDate) {
		this.limitDate = limitDate;
	}

	/**
	 * Updates the task's priority.
	 *
	 * @param priority a new priority
	 */
	public void setPriority(TasksPriority priority) {
		this.priority = priority;
	}

	/**
	 * Displays a task's information on the screen.
	 *
	 * @return task's information
	 */
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();

		s.append("Task\n");
		s.append("Task's title: " + this.title + ".\n");
		s.append("Task's creator: " + this.creator.toString() + ".\n");
		s.append("Task's contributor: " + this.contributor.toString() + ".\n");
		s.append("Task's description: " + this.description + ".\n");
		s.append("Task's state: " + this.taskState + ".\n");
		s.append("Task's begin date: " + this.beginDate + ".\n");
		s.append("Task's end date: " + this.endDate + ".\n");
		s.append("Task's limit date: " + this.limitDate + ".\n");
		s.append("Task's priority: " + this.priority + ".\n");

		return s.toString();
	}

	/**
	 * Method that compares if two tasks are the same.
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
		if(o == null || this.getClass() != o.getClass()){
			return false;
		}

		Task test = (Task) o;

		return test.title.equals(this.title) && test.creator.equals(this.creator) &&
				test.contributor.equals(this.contributor) && test.description.equals(this.description) &&
				test.taskState.equals(this.taskState) && test.beginDate.equals(this.beginDate) &&
				test.endDate.equals(this.endDate) && test.limitDate.equals(this.limitDate) &&
				test.priority.equals(this.priority);
	}

	/**
	 * Makes a copy of Task.
	 *
	 * @return a clone of this instance
	 */
	@Override
	public Task clone(){
		return new Task(this);
	}
}
