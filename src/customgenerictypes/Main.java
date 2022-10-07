package customgenerictypes;

public class Main {
    public static void main(String[] args){
        Account<Integer> acc1 = new Account(13, 500);
        System.out.println(acc1.getId());
        Account<String> acc2 = new Account("Gena228", 300);
        System.out.println(acc2.getId());
        int a = acc1.getId() + 10;
        System.out.println(a);
    }
}
