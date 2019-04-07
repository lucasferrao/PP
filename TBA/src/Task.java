/**
 * Is a task of a project that represents
 * something that needs to be done.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

import java.time.LocalDate;

public class Task{
	private String title;
	private User creator;
	private User responsable;
	private String description;
	private State taskState;
	private LocalDate beginDate; // justify
	private LocalDate endDate;
	private LocalDate limiteDate;
	private TasksPriority priority;

	/**
	 * Task's default constructor
	 */
	public Task(){
		this.title = "";
		this.creator = new User();
		this.responsable = new User();
		this.description = "";
		this.taskState = State.NotStarted;
		this.beginDate = LocalDate.MIN;
		this.endDate = LocalDate.MIN;
		this.limiteDate = LocalDate.MIN;
		this.priority = TasksPriority.Low;
	}

	/**
	 * Task's parametrized constructor
	 *
	 * @param title task's title
	 * @param creator task's creator
	 * @param responsable task's responsable
	 * @param description task's description
	 * @param taskState task's state
	 * @param beginDate task's begin date
	 * @param endDate task's end date
	 * @param limiteDate task's limite date
	 * @param priority task's priority
	 */
	public Task(String title, User creator, User responsable, String description,
				State taskState, LocalDate beginDate, LocalDate endDate,
				LocalDate limiteDate, TasksPriority priority) {
		this.title = title;
		this.creator = creator;
		this.responsable = responsable;
		this.description = description;
		this.taskState = taskState;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.limiteDate = limiteDate;
		this.priority = priority;
	}

	/**
	 * Task's copy constructor
	 *
	 * @param task a task
	 */
	public Task(Task task){
		this.title = task.getTitle();
		this.creator = task.getCreator();
		this.responsable = task.getResponsable();
		this.description = task.getDescription();
		this.taskState = task.getTaskState();
		this.beginDate = task.getBeginDate();
		this.endDate = task.getEndDate();
		this.limiteDate = task.getLimiteDate();
		this.priority = task.getPriority();
	}

	/**
	 * Returns the task's title.
	 *
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the task's creator.
	 *
	 * @return creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * Returns the task's responsable.
	 *
	 * @return responsable
	 */
	public User getResponsable() {
		return responsable;
	}

	/**
	 * Returns the task's description.
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the task's state.
	 *
	 * @return task state
	 */
	public State getTaskState() {
		return taskState;
	}

	/**
	 * Returns the task's begin date.
	 *
	 * @return begin date
	 */
	public LocalDate getBeginDate() {
		return beginDate;
	}

	/**
	 * Returns the task's end date.
	 *
	 * @return end date
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * Returns the task's limite date.
	 *
	 * @return limite date
	 */
	public LocalDate getLimiteDate() {
		return limiteDate;
	}

	/**
	 * Returns the task's priority.
	 *
	 * @return priority
	 */
	public TasksPriority getPriority() {
		return priority;
	}

	/**
	 * Update the task's title.
	 *
	 * @param title a new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Update the task's creator.
	 *
	 * @param creator a new creator
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * Update the task's responsable.
	 *
	 * @param responsable a new responsable
	 */
	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}

	/**
	 * Update the task's description.
	 *
	 * @param description a new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Update the task's state.
	 *
	 * @param taskState a new task state
	 */
	public void setTaskState(State taskState) {
		this.taskState = taskState;
	}

	/**
	 * Update the task's begin date.
	 *
	 * @param beginDate a new begin date
	 */
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * Update the task's end date.
	 *
	 * @param endDate a new end date
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * Update the task's limite date.
	 *
	 * @param limiteDate a new limite date
	 */
	public void setLimiteDate(LocalDate limiteDate) {
		this.limiteDate = limiteDate;
	}

	/**
	 * Update the task's priority.
	 *
	 * @param priority a new priority
	 */
	public void setPriority(TasksPriority priority) {
		this.priority = priority;
	}
}
