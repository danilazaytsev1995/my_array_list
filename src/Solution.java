import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(generator.nextInt(100));
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("");
        list.doSort(0, list.getSize()-1);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
