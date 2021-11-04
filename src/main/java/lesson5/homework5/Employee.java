package lesson5.homework5;

/* 1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
   2.Конструктор класса должен заполнять эти поля при создании объекта.
   3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/

public class Employee {
    private String fullName;
    private String post;
    private String eMail;
    private String numberPhone;
    private String wages;
    private int age;

    public Employee(String fullName, String post, String eMail, String numberPhone, String wages, int age) {
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.numberPhone = numberPhone;
        this.wages = wages;
        this.age = age;

    }

    public String toString() {
        return String.format("Сотрудник - %s: Должность - %s, почта - %s, номер телефона - %s," +
                "зарплата - %s, лет - %d\n", fullName, post, eMail, numberPhone, wages, age);
    }

    public static void main(String[] args) {


        Employee empl1 = new Employee("Иванов Иван Иваныч", "Инженер", "1@mail.ru",
                "+7111222333444", " 10 $ ", 30);
        System.out.println(empl1);


        //System.out.printf("Сотрудник - %s: Должность - %s, почта - %s, номер телефона - %s," +
        //      "зарплата - %s, лет - %d\n", empl1.fullName, empl1.post, empl1.eMail, empl1.numberPhone, empl1.wages, empl1.age);
    }
}








