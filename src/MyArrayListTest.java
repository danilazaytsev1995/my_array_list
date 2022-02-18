import org.junit.Assert;

class MyArrayListTest {
    private MyArrayList<Integer> list1;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        list1 = new MyArrayList<>(10);
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        int expected = list1.getSize();
        int actual = 0;
        Assert.assertEquals(expected, actual);
        list1.add(1);
        expected = list1.getSize();
        actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void add() {
        list1.add(1);
        int expected = (int) list1.get(0);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        boolean expected = list1.isEmpty();
        boolean actual = true;
        Assert.assertEquals(expected, actual);
        list1.add(1);
        expected = list1.isEmpty();
        actual = false;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void get() {
        for (int i = 0; i < 1; i++) {
            list1.add(1);
        }
        int expected = (int) list1.get(0);
        int actual = 1;
        Assert.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void remove() {
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }
        list1.remove(0);
        int expected = (int) list1.get(0);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }
}