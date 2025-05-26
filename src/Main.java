import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1, пример 1
        int[] value = new int[3];
        value[0] = 1;
        value[1] = 2;
        value[2] = 3;
        System.out.println(value[0]);
        System.out.println(value[1]);
        System.out.println(value[2]);
        //Пример 2
        double[] meaning = {1, 2, 3};
        meaning[0] = 1.57;
        System.out.println(meaning[0]);
        meaning[1] = 7.654;
        System.out.println(meaning[1]);
        meaning[2] = 9.986;
        System.out.println(meaning[2]);
        //Пример 3
        int[] sense = new int[5];
        sense[0] = 33;
        int apple = 0;
        System.out.println(sense[apple]);
        //Задание 2
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
            if (i < value.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < meaning.length; i++) {
            System.out.print(meaning[i]);
            if (i < meaning.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < sense.length; i++) {
            System.out.print(sense[i]);
            if (i < sense.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 3
        for (int i = value.length - 1; i >= 0; i--) {
            System.out.print(value[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = meaning.length - 1; i >= 0; i--) {
            System.out.print(meaning[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = sense.length - 1; i >= 0; i--) {
            System.out.print(sense[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 4
        int[] edition = new int[]{1, 2, 3};
        for (int i = 0; i < edition.length; i++) {
            if (edition[i] % 2 != 0) {
                edition[i] += 1;
            }
        }
        System.out.println(Arrays.toString(edition));
    }
}
