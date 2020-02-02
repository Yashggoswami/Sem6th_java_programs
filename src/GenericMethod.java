public class GenericMethod<T extends Number> {
    private Number var1;


    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();
        obj.printArray(12, 13, 14, 15, 21);
        GenericMethod<Float> ob = new GenericMethod<>();
        ob.sum_it(12);
    }

    private <E> void printArray(E... var) {
        for (E x : var)
            System.out.println(x);
    }

    private <E extends Number> void sum_it(E r) {
        var1 = r.floatValue();
        System.out.println(var1);
    }
}
