import java.io.IOException;
import java.util.Properties;

public class VersionUtil {

    static String getProjectVerion() throws IOException {
        Properties prop = new Properties();
        prop.load(VersionUtil.class.getResourceAsStream("gitflow.properties"));
        return prop.getProperty("gitflow.version");
    }
}
