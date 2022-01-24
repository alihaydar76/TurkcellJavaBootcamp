package oopWorkShops.turkcell;

public class UserManager
{

    String regex = "^.*(?=.{8,})(?=..*[\\d])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

    public void signIn(User user) {
        if(user.getPassword().contains(regex))
        {
            System.out.println("Hosgeldiniz...");
        }
        else
            System.out.println("Standartlara uymayan bir sifre girisi yaptiniz...");
    }


    public void logIn(User user)
    {
        if(user.getName().equals("dB_userName"))
        {
            if(user.getPassword().equals("dB_password"))
            {
                System.out.println("Giris yapildi.");
            }

            else if(!user.getPassword().equals("dB_password"))
            {
                System.out.println("Sifreniz yanlis...");
            }

        }
        else if(!user.getName().equals("dB_userName"))
        {
            System.out.println("Kullanici adiniz yanlis...");
        }
    }


    public void update(User user) {
        System.out.println("Updated : " + user.getName());
    }

    public void delete(User user) {
        System.out.println("Deleted : " + user.getName());
    }
}
