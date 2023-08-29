package home_work_thrid;

import static home_work_thrid.Manager.changeSalaryByAgeMulti;

public class Main {
    private final static int NUMBER_OF_WORKER = 6;


    public static void main(String[] args) {

        Worker[] workers = new Worker[NUMBER_OF_WORKER];
        workers[0] = new Worker("Aleksandr Michailov", "Developer", "+1234567890", 100000, 38);
        workers[1] = new Worker("Anton Sergeev", "UI Designer", "+2345678901", 80000, 38);
        workers[2] = new Worker("Liliya Latipova", "UX Designer", "+3456789012", 110000, 29);
        workers[3] = new Worker("Ildar Tliashev", "QA Engineer", "+4567890123", 70000, 35);
        workers[4] = new Worker("Azat Hasanov", "QA Engineer", "+5678901234", 75000, 50);
        workers[5] = new Manager("Albert Tliashev", "Head of IT Department", "+6789012345", 300000, 55);

        for (int i = 0; i < NUMBER_OF_WORKER; i++) {
            workers[i].printInfo();
        }
        System.out.println();

        changeSalaryByAgeMulti(workers, 0, 5000);
        for (int i = 0; i < NUMBER_OF_WORKER; i++) {
            workers[i].printInfo();
        }
        System.out.println();
        System.out.printf("Average age: %.2f%n", Worker.averageAge(workers));
        System.out.printf("Average salary: %.2f%n", Worker.averageSalary(workers));
    }
}
