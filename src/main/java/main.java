import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        Encrypt encript = new Encrypt("", 0);


        System.out.println("choose the action you want:\n [1] ENCRYPT\n [2] DECRYPT");
        int x = Integer.parseInt(keyboard.next());

        switch (x){
            case 1:
                System.out.println("\nEnter the desired text u want to ENCRYPT:\n");
                encript.setInput(keyboard.next());
                System.out.println("\nEnter a key::\n");
                encript.setKey(Integer.parseInt(keyboard.next()));
                System.out.println("\nYour encrypted text is::    "+encript.encrypt());
                break;

            case 2:
                System.out.println("\nEnter the desired text u want to DECRYPT:\n");
                encript.setInput(keyboard.next());
                System.out.println("\nEnter a key::\n");
                encript.setKey(Integer.parseInt(keyboard.next()));
                System.out.println("\nYour decrypted text is::   "+encript.decrypt());
                break;

            default:
                System.out.println("pliz choose!!");

        }
    }
}
