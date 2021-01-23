import Adapter.Adapter;
import Adapter.ContactManager;
import Adapter.Table;
import Decorator.*;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
//        ********Adapter**************
        System.out.println("\n\n********Adapter**************");
        PrintWriter pw = new PrintWriter(System.out);
        Table table = new Table(pw, new Adapter(new ContactManager()));

        try {
            table.display();
            pw.flush();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

//        ********Decorator**********
        System.out.println("\n\n********Decorator**************");
        IStringSource test1 = new StringSource1();
        System.out.println(test1.next());
        System.out.println((new UpperCaseDecorator(test1)).next());
        System.out.println((new ReverseDecorator(new UpperCaseDecorator(test1))).next());
        System.out.println((new SensorDecorator( new ReverseDecorator(new UpperCaseDecorator(test1)))).next());

        System.out.println("\n");

        IStringSource test2 = new StringSource2();
        System.out.println(test2.next());
        System.out.println((new UpperCaseDecorator(test2)).next());
        System.out.println((new ReverseDecorator(new UpperCaseDecorator(test2))).next());
        System.out.println((new SensorDecorator( new ReverseDecorator(new UpperCaseDecorator(test2)))).next());
    }
}
