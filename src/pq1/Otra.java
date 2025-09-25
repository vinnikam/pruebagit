package pq1;

import java.io.Serializable;

public class Otra implements Serializable {
    public String a;

    @Override
    public String toString() {
        return "Otra{" +
                "a='" + a + '\'' +
                '}';
    }
}
