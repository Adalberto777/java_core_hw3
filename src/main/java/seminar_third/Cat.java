package seminar_third;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    public static String voice;
    public String name;
    public int age;

    public int add(int a, int b){
        return a + b;
    }
}
