import org.yaml.snakeyaml.Yaml;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = MainClass.class
                .getResourceAsStream("/Customer.yml")) {
            HashMap<String, String> map = new HashMap<String, String>();
            map = yaml.load(in);
             System.out.println(map);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
