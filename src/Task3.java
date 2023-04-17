import java.util.*;

public class Task3 {

    public Set transform(String[] words) {

        List<String> arrayList = new ArrayList<>();
        int count = 0;

        UP_LOP: for (String word : words) {
            char[] chars = word.toCharArray();
            //все, що далі робимо з кожним словом

            Map<Character, Integer> helpMap = new HashMap<>();

            for (Character character : chars) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    helpMap.put(character, value);
                } else {
                    helpMap.put(character, 1);
                }
            }
            //System.out.println(helpMap);

            for (Character key : helpMap.keySet()) {
                if (helpMap.get(key) % 2 != 0) {
                    continue UP_LOP;
                }
            }
                arrayList.add(word);
                count++;

            if (count >= 2){
                break;
            }

        }
        //System.out.println(helparrayList);

            Set<Character> mySet = new HashSet<>();

            for (String word2 : arrayList) {
                    for (Character character : word2.toCharArray()) {
                    mySet.add(character);
                    }
            }
            System.out.println("\nTask 3: The unique symbols are: " + mySet);

            return mySet;
    }


}
