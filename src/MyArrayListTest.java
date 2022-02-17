import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList<Integer> list1;
    private ArrayList<Integer>  list2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        list1 = new MyArrayList<>(10);
        list2 = new ArrayList<>();
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        int expected = list1.getSize();
        int actual = list2.size();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void add() {
        list1.add(1);
        list2.add(1);
        int expected = (int) list1.get(0);
        int actual = list2.get(0);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        boolean expected = list1.isEmpty();
        boolean actual = list2.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void get() {
        for (int i = 0; i < 1; i++) {
            list1.add(1);
            list2.add(1);
        }
        int expected = (int) list1.get(0);
        int actual = list2.get(0);
        Assert.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void remove() {
        for (int i = 0; i < 5; i++) {
            list1.add(i);
            list2.add(i);
        }
        list1.remove(0);
        list2.remove(0);
        int expected = (int) list1.get(0);
        int actual = list2.get(0);
        Assert.assertEquals(expected, actual);
    }
}