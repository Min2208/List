import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    public static int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] =  e;
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public Object get(int i) {
//        if (i >= size || i < 0) {
//            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
//
//        }
        return  elements[i];

    }

}