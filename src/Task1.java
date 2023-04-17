public class Task1 {

    public int getSumOfEven(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                sum = sum + array[i];
            }
        }

        System.out.printf("%nTask 1: The summ is %d%n", sum);
        return sum;
    }
}
