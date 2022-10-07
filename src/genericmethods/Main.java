package genericmethods;

import javax.print.attribute.IntegerSyntax;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Tu", "Wa", "Ge", "Hi", "Jo"};
        Integer[] integers = {1, 23, 456, 7890, 12345};
        printer.print(strings);
        printer.print(integers);
    }
}
