import java.util.*;

public class Comparatorjava {
    public static void main(String[] args) {
        List<Comparatorjav> obj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        obj.add(new Comparatorjav(10, "yash"));
        obj.add(new Comparatorjav(11, "vinay"));
        obj.add(new Comparatorjav(12, "neil"));
        obj.add(new Comparatorjav(12, "nitin"));

        Collections.sort(obj, new sortbyroll());
        for (Comparatorjav x : obj)
            x.exit();

    }
}

class Comparatorjav {
    int rollno = 0;
    String name = "yash";

    public Comparatorjav(int nextInt, String nextLine) {
        this.rollno = nextInt;
        this.name = nextLine;
    }


    void exit() {
        System.out.println(this.name + " " + this.rollno);
    }
}

class sortbyroll implements Comparator<Comparatorjav> {
    @Override
    public int compare(Comparatorjav o1, Comparatorjav o2) {
        if (o1.rollno == o2.rollno)
            return o1.name.compareTo(o2.name);
        else
            return o1.rollno - o2.rollno;

    }
}