package home_work_thrid;

public class Manager extends Worker {
    public Manager(String fullName, String post, String telephone, int salary, int age) {
        super(fullName, post, telephone, salary, age);
    }

    public static void changeSalaryByAgeMulti(Worker[] workers, int ageOfChange, int increase) {
        for (int i = 0; i < workers.length; i++) {
            if (!(workers[i] instanceof Manager)){
                    workers[i].changeSalaryByAgeSingle(ageOfChange, increase);
                }

            }
        }
}



