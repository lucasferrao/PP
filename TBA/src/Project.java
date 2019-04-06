import java.time.LocalDate;
import java.util.ArrayList;

public class Project{

	//Instance variables
	private String title;
	private int description;
	private LocalDate beginDate;
	private LocalDate endDate;
	private ArrayList<TasksList> lists;
	private Manager owner;
	private State projectState;
	private ArrayList<Collaborator> users;

}
