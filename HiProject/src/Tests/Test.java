package Tests;

import Backend.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        ArrayList<String> contributors = new ArrayList<String>();
        Project p = new Project();
        Project p3 = new Project();
        Contributor c = new Contributor();


        /*
        p.setEndDate(LocalDate.of(2014, Month.JANUARY, 15));
        p.setBeginDate(LocalDate.of(2014, Month.JANUARY, 1));
        p3.setBeginDate(LocalDate.of(2014, Month.JANUARY, 1));
        p3.setEndDate(LocalDate.of(2014, Month.JANUARY, 14));

        Map<Integer, Project> asd = new HashMap<>();
        asd.put(p.getProjectID(), p);
        asd.put(p3.getProjectID(), p3);

        ProjectsList l = new ProjectsList();
        l.setProjects(asd);

        System.out.println(l.delayedProjects().toString());
        */


        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();
        t1.setTitle("a");
        t1.setEndDate(LocalDate.of(2014, Month.JANUARY, 15));
        t2.setTitle("c");
        t2.setEndDate(LocalDate.of(2014, Month.JANUARY, 16));
        t3.setTitle("b");
        t3.setEndDate(LocalDate.of(2014, Month.JANUARY, 14));

        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);

        TasksList tL = new TasksList();
        tL.setTasks(tasks);

        System.out.println(tL.sortTitleAsc());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(tL.sortEndDateDesc());

    }
}
