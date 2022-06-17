import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Agurk");
        arrList.add("Tomat");
        arrList.add("Salat");


        MyUserIO object = new MyUserIO();
        object.displayMenu(scan, arrList);



    }
}
