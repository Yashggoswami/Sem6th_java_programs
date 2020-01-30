public class GenericsExample {
    public static void main(String[] args) {
        Examples<String> obj = new Examples<>();
        obj.insert("yash");
        String name = obj.display();
        System.out.println(name);
    }
}

class Examples<T> {
    T var;

    public void insert(T var1) {
        this.var = var1;
    }

    public T display() {
        return var;
    }

}
