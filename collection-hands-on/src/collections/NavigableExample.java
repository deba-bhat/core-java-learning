package collections;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableExample {

    public static void main(String[] args) {
        NavigableSet<LocalDateTime> appointments = new TreeSet<>();

        appointments.add(LocalDateTime.of(2024,3,4,10,30));
        appointments.add(LocalDateTime.of(2024,3,4,11,30));
        appointments.add(LocalDateTime.of(2024,3,4,12,0));
        appointments.add(LocalDateTime.of(2024,3,4,12,30));

        LocalDateTime nextApp = appointments.ceiling(LocalDateTime.of(2024, 3, 4, 10, 45));
        System.out.println("NextApp: "+nextApp);


    }
}
