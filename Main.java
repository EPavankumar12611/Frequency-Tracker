import java.util.Scanner;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String na = sc.nextLine();

        for(char ch : na.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for(char key : map.keySet()){
            System.out.println(key + "=" + map.get(key));
        }
        sc.close();
    }
}