/**
 * Represents a list of tasks.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

package Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TasksList implements Serializable {
    private String title;
    private User creator;
    private ArrayList<Task> tasks;

    /**
     * TasksList's default constructor.
     */
    public TasksList(){
        this.title = "";
        this.creator = new User();
        this.tasks = new ArrayList<Task>();
    }

    /**
     * TasksList's Parametrized constructor.
     *
     * @param title tasks list's title
     * @param creator tasks list's creator
     * @param tasks tasks list's tasks
     */
    public TasksList(String title, User creator, ArrayList<Task> tasks) {
        this.title = title;
        this.creator = creator;
        this.tasks = tasks;
    }

    /**
     * TasksList's copy constructor.
     *
     * @param tasksList a tasks list
     */
    public TasksList(TasksList tasksList){
        this.title = tasksList.getTitle();
        this.creator = tasksList.getCreator();
        this.tasks = tasksList.getTasks();
    }

    /**
     * Returns the tasks list's title.
     *
     * @return tasks list's title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the tasks list's creator.
     *
     * @return tasks list's creator
     */
    public User getCreator() {
        return this.creator;
    }

    /**
     * Returns the tasks list.
     *
     * @return a list of tasks
     */
    public ArrayList<Task> getTasks() {
        return this.tasks;
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
     * Updates the tasks list.
     *
     * @param tasks a new tasks list
     */
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Displays a tasks list's information on the screen.
     *
     * @return tasks list's information
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Tasks List\n");
        s.append("Task's title: " + this.title + "\n");
        s.append("Task's creator: " + this.creator + "\n");
        s.append("Tasks:\n");
        for(Task t: this.tasks){
            s.append(" -> " + t.toString() + "\n");
        }

        return s.toString();
    }

    /**
     * Method that compares if two tasks list are the same.
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

        TasksList test = (TasksList) o;

        return test.title.equals(this.title) && test.creator.equals(this.creator) &&
                test.tasks.equals(this.tasks);

    }

    /**
     * Makes a copy of TasksList.
     *
     * @return a clone of this instance
     */
    @Override
    public TasksList clone(){
        return new TasksList(this);
    }

    /**
     * Method that adds tasks to a task list.
     *
     * @param task new tasks
     */
    public void addTasks(Task task){
        this.tasks.add(task);
    }

    /**
     * Method that change the task's state.
     *
     * @param task a task
     * @param state new task's state
     */
    public void changeTaskState(Task task, State state){
        task.setTaskState(state);
    }

    /**
     * Method that filter the tasks list by task's owner.
     *
     * @param owner task's owner
     * @return tasks by owner
     */
    public ArrayList<Task> filterOwner(Manager owner){
        return (ArrayList<Task>) tasks.stream().
                filter(f-> f.getCreator().equals(owner)).
                collect(Collectors.toList());
    }

    /**
     * Method that filter the tasks list by task's contributor.
     *
     * @param contributor task's contributor
     * @return tasks by contributor
     */
    public ArrayList<Task> filterContributor(Contributor contributor){
        return (ArrayList<Task>) tasks.stream().
                filter(f-> f.getContributor().equals(contributor)).
                collect(Collectors.toList());
    }

    /**
     * Method that filter the tasks list by task's priority.
     *
     * @param priority task's priority
     * @return tasks by priority
     */
    public ArrayList<Task> filterPriority(TasksPriority priority){
        return (ArrayList<Task>) tasks.stream().
                filter(f-> f.getPriority().equals(priority)).
                collect(Collectors.toList());
    }

    /**
     * Method that filter the tasks list by task's state.
     *
     * @param state task's state
     * @return tasks by state
     */
    public ArrayList<Task> filterState(State state){
        return (ArrayList<Task>) tasks.stream().
                filter(f-> f.getTaskState().equals(state)).
                collect(Collectors.toList());
    }

    /**
     * Method that filter the tasks list by task's end date.
     *
     * @param endDate task's end date
     * @return tasks by end date
     */
    public ArrayList<Task> filterEndDate(LocalDate endDate){
        return (ArrayList<Task>) tasks.stream().
                filter(f-> f.getEndDate().equals(endDate)).
                collect(Collectors.toList());
    }

    /**
     * Method that sort the tasks list by title ascending.
     *
     * @return tasks list sorted by title ascending
     */
    public ArrayList<Task> sortTitleAsc(){
        return (ArrayList<Task>) tasks.stream().sorted(Comparator.comparing(Task :: getTitle)).
                collect(Collectors.toList());
    }

    /**
     * Method that sort the tasks list by title descending.
     *
     * @return tasks list sorted by title descending
     */
    public ArrayList<Task> sortTitleDesc(){
        return (ArrayList<Task>) tasks.stream().sorted(Comparator.comparing(Task :: getTitle).reversed()).
                collect(Collectors.toList());
    }

    /**
     * Method that sort the tasks list by end date ascending.
     *
     * @return tasks list sorted by end date ascending
     */
    public ArrayList<Task> sortEndDateAsc(){
        return (ArrayList<Task>) tasks.stream().sorted(Comparator.comparing(Task :: getEndDate)).
                collect(Collectors.toList());
    }

    /**
     * Method that sort the tasks list by end date descending.
     *
     * @return tasks list sorted by end date descending
     */
    public ArrayList<Task> sortEndDateDesc(){
        return (ArrayList<Task>) tasks.stream().sorted(Comparator.comparing(Task :: getEndDate).reversed()).
                collect(Collectors.toList());
    }
}