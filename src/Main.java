import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Object o = new Scanner(System.in);
        Scanner scanner = null;
        if (o instanceof Scanner) scanner = (Scanner) o;
        if (scanner != null) {
            scanner.nextInt();
        }
        Object o1 = new String();
        Object o2 = new Integer(15);*/
        Object[] objects = {10, "Hello", 3.14};
        for (Object o : objects) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s);
            }
        }
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (Integer o : numbers) {
            sum = sum + o;
        }
        System.out.println(sum);


        HashMap<Integer, String> map = new HashMap();
        map.put(7, "hello");
        map.put(8, "allo");

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("privet");
        listHello.add("hi");

        ArrayList<String> listBye = new ArrayList<>();
        listHello.add("poka");
        listHello.add("bye");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(listHello);
        list.add(listBye);

        for(ArrayList<String> spisok:list){
            for (String s:spisok){
                System.out.println(s);
            }
        }
    }
}