import java.util.ArrayList;
import java.util.Iterator;

public class itr {
    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        in.add(12);
        in.add(11);
        in.add(13);
        Iterator itr = in.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        for (int x : in)
            System.out.println(x);
    }
}
