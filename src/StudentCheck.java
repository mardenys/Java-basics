import java.util.Scanner;

//3 obiekty klasy student, przypisane wartości do pól. Stworzona tablica i dodanie studentów do tablicy
public class StudentCheck {

    public static void main(String[] args) {

        Student Alba = new Student();
        Alba.imie = "Alba";
        Alba.nazwisko = "Denysenko";
        Alba.nick = "Albubu";

        Student Tomasz = new Student();
        Tomasz.imie = "Tomasz";
        Tomasz.nazwisko = "Denysenko";
        Tomasz.nick = "Tomcik";

        Student Marcin = new Student();
        Marcin.imie = "Marcin";
        Marcin.nazwisko = "Denysenko";
        Marcin.nick = "Tester";

        Student[] students = new Student[3];
        students[0] = Alba;
        students[1] = Tomasz;
        students[2] = Marcin;


        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].zalogujSie();

        }

        String imie = "Kasua";
        Scanner scanner = new Scanner(System.in);





    }
}
