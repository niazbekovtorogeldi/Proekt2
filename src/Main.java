import interfaceImpl.Imple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imple imple = new Imple();
        while (true) {
            System.out.println("" +
                    "1: InstallWhatsapp" +
                    "\n2: GoToProfile" +
                    "\n3: GetAllWhatsappStatus" +
                    "\n4: ChangeProfilePhoto" +
                    "\n5: ChangeWhatsappStatus" +
                    "\n6: AddCoutact" +
                    "\n7: SendMessage" +
                    "\n8: DeleteWhatsapp" +
                    "");

            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    imple.InstallWhatsapp();
                    break;
                case 2:
                    imple.GoToProfile();
                    break;
                case 3:
                    imple.GetAllWhatsappStatus();
                    break;
                case 4:
                    imple.ChangeProfilePhoto();
                    break;
                case 5:
                    imple.ChangeWhatsappStatus();
                    break;
                case 6:
                    imple.AddCoutact();
                    break;
                case 7:
                    imple.SendMessage();
                    break;
                case 8:
                    imple.DeleteWhatsapp();
               break;

            }


        }
    }
}