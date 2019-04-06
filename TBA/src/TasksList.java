/**
 * Represents a list of taks.
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
}
