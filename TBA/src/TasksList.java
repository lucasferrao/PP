import java.util.ArrayList;

public class TasksList{

    //Instance variables
    private String description;
    private User creator;
    private ArrayList<Task> tasks;

    //Getters
    public String getDescription() {
        return description;
    }

    public User getCreator() {
        return creator;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    //Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
