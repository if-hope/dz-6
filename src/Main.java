public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{8, 2, 3, 4, 5, 6, 7};
        Task1 object1 = new Task1();
        object1.getSumOfEven(array);

        Task2 uniqChar = new Task2();
        uniqChar.print("Alexx9800");

        String [] words = new String [] {"mama", "cxz", "papy", "dada", "it was me", "yes", "no"};
        String [] words2 = new String [] {"мама", "тато", "їж їжак желе"};
        Task3 x = new Task3();

        x.transform(words);
        x.transform(words2);
    }
}