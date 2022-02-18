import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("");

        list.sort(Integer::compareTo);

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
