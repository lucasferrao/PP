import java.time.LocalDate;

public class Task{

	//Instance variables
	private String title;
	private User creator;
	private User responsable;
	private String description;
	private State taskState;
	private LocalDate beginDate; // justify
	private LocalDate endDate;
	private LocalDate limiteDate;
	private TasksPriority priority;

	//Getters
	public String getTitle() {
		return title;
	}

	public User getCreator() {
		return creator;
	}

	public User getResponsable() {
		return responsable;
	}

	public String getDescription() {
		return description;
	}

	public State getTaskState() {
		return taskState;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public LocalDate getLimiteDate() {
		return limiteDate;
	}

	public TasksPriority getPriority() {
		return priority;
	}

	//Setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTaskState(State taskState) {
		this.taskState = taskState;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setLimiteDate(LocalDate limiteDate) {
		this.limiteDate = limiteDate;
	}

	public void setPriority(TasksPriority priority) {
		this.priority = priority;
	}
}
