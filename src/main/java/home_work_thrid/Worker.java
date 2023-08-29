package home_work_thrid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private String fullName;
    private String post;
    private String telephone;
    private int salary;
    private  int age;

    public void printInfo() {
        System.out.printf("Worker %s, post: %s, telephone: %s, salary: %d, age: %d%n", fullName, post, telephone, salary, age);
    }

    public void changeSalaryByAgeSingle(int ageOfChange, int increase) {
        if (age > ageOfChange) {
            salary += increase;
        }
    }

//    public static void changeSalaryByAgeMulti(Worker[] workers, int ageOfChange, int increase){
//        for (int i = 0; i < workers.length; i++) {
//            workers[i].changeSalaryByAgeSingle(ageOfChange, increase);
//        }
//    }

    public static double averageAge(Worker[] workers){
        return Arrays.stream(workers)
                .mapToInt(Worker::getAge)
                .average()
                .orElse(0.0);
    }

    public static double averageSalary(Worker[] workers) {
        return Arrays.stream(workers)
                .mapToInt(Worker::getSalary)
                .average()
                .orElse(0.0);
    }


}
