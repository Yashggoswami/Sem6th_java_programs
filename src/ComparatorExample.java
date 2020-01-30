import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample implements Comparable<ComparatorExample> {
    public String name;
    public int id;
    public float salary;

    ComparatorExample(String str, int id, float sal) {
        this.name = str;
        this.id = id;
        this.salary = sal;

    }

    public static void main(String[] args) {
        List<ComparatorExample> list = new ArrayList<>();
        list.add(new ComparatorExample("yash", 12, 23456));
        list.add(new ComparatorExample("vinay", 10, 8765432));
        Collections.sort(list);
        for (ComparatorExample c : list) {
            c.getoutput();
        }
    }

    void getoutput() {
        System.out.println(this.name + " " + this.id + " " + this.salary);
    }

    @Override
    public int compareTo(ComparatorExample o) {
        if (this.salary > o.salary) {
            return 1;
        } else
            return -1;

    }
}
