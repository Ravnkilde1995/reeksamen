import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyUserIO implements UserIO {


    public  int displayMenu(Scanner scan, ArrayList<String> arrList) {

        int answer = 1;

            while (answer != 0) {

                System.out.println("Velkommen til menuen");
                System.out.println("intast dit valg");
                System.out.println("-------------------------\n");
                System.out.println("tast 1 for at printe Agurk");
                System.out.println("tast 2 for at printe Tomat");
                System.out.println("tast 3 for at printe Salat");
                System.out.println("tast 0 for at lukke programmet" + "\n");
                answer = getAnInteger(scan);

                switch (answer) {
                    case 1:
                        String result1 = arrList.get(0);
                        System.out.println(result1 + "\n");
                        displayChoice(answer);
                        break;
                    case 2:
                        String result2 = arrList.get(1);
                        System.out.println(result2 + "\n");
                        displayChoice(answer);
                        break;

                    case 3:
                        String result3 = arrList.get(2);
                        System.out.println(result3 + "\n");
                        displayChoice(answer);
                        break;

                    case 0:
                        System.out.println("lukker programmet");
                        break;

                }

            }
            return answer;
        }

        public static int getAnInteger(Scanner scan){
            while(true){
                try{
                    return scan.nextInt();
                }
                catch(InputMismatchException e){
                    scan.next();
                    System.out.println("Det er ikke et tal" +
                            " prøv igen: ");
                }
            }

        }

        public static void displayChoice(int answer){


            if(answer == 1){
                System.out.println("Du har valgt Agurk" + "\n");
            }
            if(answer == 2){
                System.out.println("Du har valgt Tomat" + "\n");
            }
            if(answer == 3){
                System.out.println("Du har valgt Salat" + "\n");
            }

        }
    }

