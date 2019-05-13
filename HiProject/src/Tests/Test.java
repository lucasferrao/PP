package Tests;

import Backend.Contributor;
import Backend.Project;
import Backend.ProjectsList;

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
    }
}
