package interfaceImpl;

import classs.Profile;
import enam.Status;

import java.util.*;

public class Imple implements Proekt{


    List<String> messegs = new ArrayList<String>();
    ArrayList<Profile>profil=new ArrayList<>();
    ArrayList<Contact>contacts=new ArrayList<>();







    @Override
    public void InstallWhatsapp() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("телефон номер жазыныз:");
            int namber = new Scanner(System.in).nextInt();
            System.out.println("атынызды жазыныз");
            String name = new Scanner(System.in).nextLine();
            for (Profile profile:profil) {
                if (profile.getUserName().equals(name)) {
                    System.out.println("такой юхер уже есть");


                }break;
            }
                System.out.println("пароль ойлоп табыныз");
                String passwort = new Scanner(System.in).nextLine();


        Profile profile = new Profile(+1,name,namber,passwort,Status.DAFAULT_IMAGE.name(),Status.HELLO_I_USE_WHATSAPP.name(), "");
        profil.add(profile);
        System.out.println(profile.toString());



    }

    @Override
    public void GoToProfile() {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("юзердин атын жазыныз");
            String name= new Scanner(System.in).nextLine();
            System.out.println("парол жазыныз");
            String passwor=new Scanner(System.in).nextLine();
            for (Profile p:profil) {
                if (p.getUserName().equals(name)){
                    if (p.getPassword().equals(passwor)) {
                        System.out.println(p);
                    }else {
                        System.out.println("мындай юзер жок");
                    }
                }

            }
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
    }

    @Override
    public void GetAllWhatsappStatus() {
        for (Profile profile:profil) {
            System.out.println(profile.getStatus()+ profile.getImege());

        }
    }

    @Override
    public void ChangeProfilePhoto() {
        Scanner scanner= new Scanner(System.in);
        try {

            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            System.out.println("Введите ссылку на новое изображение:");
            String newImage = scanner.nextLine();

            for (Profile p : profil) {
                if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                    p.setImege(newImage);
                    System.out.println(p);
                    System.out.println("Изображение профиля успешно изменено.");
                    break;
//
//            System.out.println("юзердин атын жазыныз");
//            String name= new Scanner(System.in).nextLine();
//            System.out.println("пароль жазыныз");
//            String passow=new Scanner(System.in).nextLine();
//            System.out.println("профильди озгорту усун ссылка коюнуз");
//            String foto=new Scanner(System.in).nextLine();
//            for (Profile p:profil){
//                if (p.getUserName().equals(name)){
//                    if (p.getPassword().equals(passow)){


                    }
                }
            }catch (Exception a){
            System.out.println(a.getMessage());
        }

        }



    @Override
    public void ChangeWhatsappStatus() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            System.out.println("Введите ссылку на новое изображение:");
            String newImage = scanner.nextLine();
            for (Profile p : profil) {
                if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                    p.setStatus(newImage);
                    System.out.println("успешно озгорду");
                    System.out.println(p);
                }

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void AddCoutact() {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();
            System.out.println("номер контакта");
            int nom =scanner.nextInt();
            for (Profile a:profil){
              if (a.getPhoneNumber()==nom) {
                  System.out.println("он успешно добавлен ваш контакт");
                  contacts.add(a);

              }else {
                  throw new Exception("такой юзера нету");
              }
            }
        }catch (Exception a){
            System.out.println(a.getMessage());
        }

    }

    @Override
    public void SendMessage() {
//


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String senderName = scanner.nextLine();
        System.out.println("Введите пароль:");
        String senderPassword = scanner.nextLine();

        Profile senderProfile = null;
        for (Profile profile : profil) {
            if (profile.getUserName().equals(senderName) && profile.getPassword().equals(senderPassword)) {
                senderProfile = profile;
            }else {

            }

                if (senderProfile == null) {
                    System.out.println("");
                } else {

                        System.out.println("Кому вы хотите отправить сообщение?");
                        String recipientName = scanner.nextLine();

                        Profile recipientProfile = null;
                        for (Profile profile1 : profil) {
                            if (profile1.getUserName().equals(recipientName)) {
                                recipientProfile = profile1;

                            }
                        }

                        if (recipientProfile == null) {
                            System.out.println("Пользователь с таким именем не найден");
                            continue;
                        }

                        System.out.println("Введите текст сообщения:");
                        String message = scanner.nextLine();



                        System.out.println("Хотите отправить еще сообщение? (да/нет)");
                        String answer = scanner.nextLine();recipientProfile.setMesseg(message);
                    System.out.println("Сообщение отправлено");
                        if (answer.equals("да"))
                            profile.setMesseg(answer);
                        if (answer.equals("нет")) {

                        }
                    }
                }
            }


    @Override
    public void DeleteWhatsapp() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("юзердин атын жазыныз:");
        String usernameToRemove = scanner.nextLine();

        boolean removed = false;
        Iterator<Profile> iterator = profil.iterator();
        while (iterator.hasNext()) {
            Profile profile = iterator.next();
            if (profile.getUserName().equals(usernameToRemove)) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("юзер удалень из списка");
        } else {
            System.out.println("такой юзер не найдет");
        }


    }
}
