public class Main {

    public static void main(String[] args) {

        Category category1 = new Category(1,"Web Programlama");
        Category category2 = new Category(2,"Veritabani");
        Category category3 = new Category(3,"Isletim Sistemleri");

        Instructor intructor1 = new Instructor(1,"Engin Demirog","img1.jpg");
        Instructor instructor2 = new Instructor(2,"Mustafa Murat Coskun","img2.jpg");

        Course kurs1 = new Course(1,"JavaScript","1.5 ay surecek...","image1.jpg",0,52,new Instructor[] {intructor1},category1) ;
        Course kurs2 = new Course(2,"C#","Backend egitimi...","image2.jpg",0,80,new Instructor[] {intructor1},category1) ;
        Course kurs3 = new Course(3,"Postgresql","Veritabani yonetimi egitimi","image3.jpg",0,8,new Instructor[] {intructor1},category2) ;
        Course kurs4 = new Course(4,"Linux","Temel Linux Komutlari","image4.jpg",0,67,new Instructor[] {intructor1,instructor2},category3) ;

        category1.setKurs(new Course[] {kurs1,kurs2});
        category2.setKurs(new Course[] {kurs3});
        category3.setKurs(new Course[] {kurs4});

        intructor1.setKurs(new Course[] {kurs1,kurs2,kurs3,kurs4});
        instructor2.setKurs(new Course[] {kurs4});

        Course[] kurslar = {kurs1,kurs2,kurs3,kurs4};
        for (Course course : kurslar) {
            System.out.println("Kurs Adi: "+course.getName());
            System.out.println("Kurs Icerigi: "+course.getContent());
            System.out.println("Tamamlanma Orani: "+course.getPercentOfComplete());
            //System.out.println("Fiyati: "+kurs.getPrice());
            System.out.println("Kurs Resim: "+course.getImage());
            for (Instructor instructor : course.getInstructors()) {
                System.out.println("Egitmen: "+instructor.getName());

            }
            for (Instructor instructor : course.getInstructors()) {
                System.out.println("Egitmen "+instructor.getName()+ "'in Fotografi: "+instructor.getImage());
            }

            System.out.println("Kategori: "+course.getCategory().getName());
            System.out.println("----------------------------------------");
        }



    }
}
