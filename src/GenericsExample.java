public class GenericsExample {
    public static void main(String[] args) {
        Example<String> obj = new Example<>();
        obj.insert("yash");
        String name = obj.display();
        System.out.println(name);
    }
}

class Example<T> {
    T var;

    public void insert(T var1) {
        this.var = var1;
    }

    public T display() {
        return var;
    }

}
