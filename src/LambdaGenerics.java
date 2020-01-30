interface Examplesimple<T> {
    T add(T v, T o);
}

public class LambdaGenerics {
    public static void main(String[] args) {
        Examplesimple<String> ob = (String a, String b) -> a + b;
        String str = ob.add("yash", "goswami");
        System.out.println(str);

        Examplesimple<Integer> ob1 = (Integer a, Integer b) -> a + b;
        Integer st = ob1.add(12, 11);
        System.out.println(st);
    }
}