import java.io.IOException;
import java.util.Properties;

public class PrintVersion {

    public static void main(String[] args) throws IOException {
        System.out.println(getProjectVerion());
    }

    private static String getProjectVerion() throws IOException {
        Properties prop = new Properties();
        prop.load(PrintVersion.class.getResourceAsStream("gitflow.properties"));
        return prop.getProperty("gitflow.version");
    }
}
