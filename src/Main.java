public class Main {
    public static void main(String[] args) {
        //задание 1
        String firstName = "Semen";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //задание 2
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
        //задание 3
        String fullName3 = "Иванов Семён Семёнович";
        String fullName4 = fullName3.replace('ё', 'е');
    }
}