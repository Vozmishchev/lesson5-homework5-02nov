package lesson5.homework5;

import java.util.Arrays;

public class MassEmpl {

    private String fullName;
    private String post;
    private String eMail;
    private String phone;
    private int zarobotok;
    private int age;

    public MassEmpl(String fullName, String post, String eMail, String phone, int zarobotok, int age) {
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phone = phone;
        this.zarobotok = zarobotok;
        this.age = age;
    }

    public String toString() {
        return String.format("Сотрудник старше 40 лет- %s: Должность - %s, почта - %s, номер телефона - %s," +
                "зарплата - %s, лет - %d", fullName, post, eMail, phone, zarobotok, age);
    }


    public static void main(String[] args) {

        MassEmpl[] persArray = new MassEmpl[5];
        persArray[0] = new MassEmpl("Иванов Иван", "Инженер", "1@mail.ru", "111222333444", 30000, 35);
        persArray[1] = new MassEmpl("Иванов Петр", "Технолог", "2@mail.ru", "111555666444", 35000, 30);
        persArray[2] = new MassEmpl("Петров Петр", "Мастер цеха", "3@mail.ru", "111778888444", 40000, 42);
        persArray[3] = new MassEmpl("Сидоров Петр", "Начальник цеха", "4@mail.ru", "3111465456", 60000, 50);
        persArray[4] = new MassEmpl("Сидоров Иван", "Токарь", "5@mail.ru", "464657641564", 35000, 47);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}







