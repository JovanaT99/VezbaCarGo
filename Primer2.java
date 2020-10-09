import org.yaml.snakeyaml.Yaml;
import java.io.IOException;
import java.io.InputStream;

public class Primer2 {
    public static void main(String[] args) throws IOException {
        loadFromFile();
    }
    private static void loadFromFile() throws IOException{
        System.out.println("/primer2.yaml");
        Yaml yaml = new Yaml();
        try(InputStream in = Primer2.class.getResourceAsStream("/primer2.yaml")){
            Iterable<Object> itr =yaml.loadAll(in);
            for(Object j: itr){
                System.out.println("test" + j.getClass());
                System.out.println(j);
            }
        }
    }
}
