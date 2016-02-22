import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Taylor on 2/19/16.
 */

public class DataValidatorSpec {

    DataValidator dataValidator;
    boolean shouldBeFalse = false;
    boolean shouldBeTrue = true;

    @Before
    public void setUp(){
        dataValidator = new DataValidator();
    }

    @Test
    public void isValidUsernameTest() {
        String usernameValid = "supercoolusername";
        boolean actual = dataValidator.isValidUsername(usernameValid);
        assertEquals("The boolean returned false",shouldBeTrue,actual);
    }

    @Test
    public void isNotValidUserNameTest() {
        String usernameInvalid = "NoTAC00lUserNameCAUSEi+'sTooLOn6AndjUNKAndw04hlookatALLThesecharAcht3rsTh4+swaymoreThaN26letters";
        boolean actual = dataValidator.isValidUsername(usernameInvalid);
        assertEquals("The boolean returned true",shouldBeFalse,actual);
    }

    @Test
    public void isValidEnhancedUsername() {
        String usernameValid = "a35ccc__234234ab";
        boolean actual = dataValidator.isValidEnhancedUsername(usernameValid);
        assertEquals("The boolean returned false",shouldBeTrue,actual);
    }

    @Test
    public void isNotValidEnhancedUsername() {
        String usernameInvalid = "234@$%#^@$eygegervds  23r23t 5634@#@@";
        boolean actual = dataValidator.isValidEnhancedUsername(usernameInvalid);
        assertEquals("The boolean returned true",shouldBeFalse,actual);
    }

    @Test
    public void isValidIpAddressTest() {
        String ipValid = "111.111.111.000";
        boolean actual = dataValidator.isValidIpAddress(ipValid);
        assertEquals("The boolean returned false",shouldBeTrue,actual);
    }

    @Test
    public void isNotValidIpAddress() {
        String ipInValid = "1235wfwdasfwfq34.1ewfwqds.23...sd..34";
        boolean actual = dataValidator.isValidIpAddress(ipInValid);
        assertEquals("The boolean returned true", shouldBeFalse, actual);
    }
}