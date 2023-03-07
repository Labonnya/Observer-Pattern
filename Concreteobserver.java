import java.io.File;
import java.util.Date;

public class Concreteobserver implements Observer {
    private String name;

    public Concreteobserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(message);
    }
}