import org.yaml.snakeyaml.Yaml;
import java.io.IOException;
import java.io.InputStream;

public class MainClass {
    
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = MainClass.class
                .getResourceAsStream("/Customer.yml")) {
            Customer customer= yaml.loadAs(in, Customer.class);
            System.out.println(customer.getEmail());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
