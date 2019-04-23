/**
 * Represents a list of tasks.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

import java.util.ArrayList;

public class TasksList{
    private String description;
    private User creator;
    private ArrayList<Task> tasks;

    /**
     * TasksList's default constructor.
     */
    public TasksList(){
        this.description = "";
        this.creator = new User();
        this.tasks = new ArrayList<Task>();
    }

    /**
     * TasksList's Parametrized constructor.
     *
     * @param description tasks list's description
     * @param creator tasks list's creator
     * @param tasks tasks list's tasks
     */
    public TasksList(String description, User creator, ArrayList<Task> tasks) {
        this.description = description;
        this.creator = creator;
        this.tasks = tasks;
    }

    /**
     * TasksList's copy constructor.
     *
     * @param tasksList a tasks list
     */
    public TasksList(TasksList tasksList){
        this.description = tasksList.getDescription();
        this.creator = tasksList.getCreator();
        this.tasks = tasksList.getTasks();
    }

    /**
     * Returns the tasks list's description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the tasks list's creator.
     *
     * @return creator
     */
    public User getCreator() {
        return creator;
    }

    /**
     * Returns the tasks list.
     *
     * @return tasks
     */
    public ArrayList<Task> getTasks() {
        return tasks;
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
     * Update the task's creator.
     *
     * @param creator a new creator
     */
    public void setCreator(User creator) {
        this.creator = creator;
    }

    /**
     * Update the tasks list.
     *
     * @param tasks a new tasks list
     */
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Displays a tasks list's information on the screen
     *
     * @return tasks list's information
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Tasks List\n");
        s.append("Task's description: " + this.description + ".\n");
        s.append("Task's creator: " + this.creator + ".\n");
        s.append("Tasks:\n");
        for(Task t: this.tasks){
            s.append(" - " + t.toString() + ".\n");
        }

        return s.toString();
    }

    /**
     * Compare if it is the same tasks list.
     *
     * @return boolean indicating if two objects are the same
     */
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }

        TasksList test = (TasksList) o;

        return test.description.equals(this.description) && test.creator.equals(this.creator) &&
                    test.tasks.equals(this.tasks);
    }

    /**
     * Make a copy of TasksList.
     *
     * @return a clone of this instance
     */
    public TasksList clone(){
        return new TasksList(this);
    }
}

