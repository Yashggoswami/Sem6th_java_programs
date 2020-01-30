interface Example<T> {


    void insert(T v);

    T display();

}

public class GenericInterface {
    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.insert("yash");
        String name = obj.display();
        System.out.println(name);
    }
}

class Example1 implements Example<String> {
    String var;

    public void insert(String str) {
        var = str;
    }

    public String display() {
        return var;
    }
}