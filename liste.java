import org.yaml.snakeyaml.Yaml;
import java.io.IOException;
import java.io.InputStream;

public class Liste {
    public static void main(String[] args) throws IOException{
        Yaml yaml = new Yaml();
        try (InputStream in = Liste.class.getResourceAsStream("/persons.yaml")){
            Persons persons = yaml.loadAs(in, Persons.class);

            Person tifani = persons.getPersons().get(0);
//            for(Person person: persons.getPersons()) {
//                System.out.println(person.getAddress());
//            }
            System.out.println(tifani.getAddress());
        }
    }
}
