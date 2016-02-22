import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Taylor on 2/19/16.
 */
public class DataValidator {

    public boolean isValidUsername(String userName) {
        String pattern = "[a-z]{3,25}";
        Pattern patternObj = Pattern.compile(pattern);
        Matcher matcherObj = patternObj.matcher(userName);
        return matcherObj.matches();
    }

    public boolean isValidEnhancedUsername(String userName) {
        String enhancedPattern = "^[a-z][a-z|_*|1-9]{3,25}";
        Pattern patternObj = Pattern.compile(enhancedPattern);
        Matcher enhancedMatcherObj = patternObj.matcher(userName);
        return enhancedMatcherObj.matches();

    }

    public boolean isValidIpAddress(String Ip) {
        String IpPattern = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
        Pattern patternObj = Pattern.compile(IpPattern);
        Matcher matcher = patternObj.matcher(Ip);
        return matcher.matches();
    }
}
