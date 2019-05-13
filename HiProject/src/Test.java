import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        ArrayList<String> contributors = new ArrayList<String>();
        Project p = new Project();
        Contributor c = new Contributor();
        ProjectsList pl = new ProjectsList();

        contributors.add("a");
        contributors.add("b");
        contributors.add("c");
        contributors.add("d");
        contributors.add("e");
        contributors.add("f");
        contributors.add("g");

        pl.addContributors(p.getProjectID(), c, contributors);
    }
}
