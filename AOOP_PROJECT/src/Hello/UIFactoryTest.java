package Hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class UIFactoryTest {

    @Test
    public void testWindowsFactory() {
        UIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertTrue("Factory should produce WindowsButton", button instanceof WindowsButton);
        assertTrue("Factory should produce WindowsCheckbox", checkbox instanceof WindowsCheckbox);
    }

    @Test
    public void testMacOSFactory() {
        UIFactory factory = new MacOSFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertTrue("Factory should produce MacOSButton", button instanceof MacOSButton);
        assertTrue("Factory should produce MacOSCheckbox", checkbox instanceof MacOSCheckbox);
    }

    @Test
    public void testInvalidOS() {
        String osType = "Linux"; // Unsupported OS
        UIFactory factory = null;

        if (osType.equals("Windows")) {
            factory = new WindowsFactory();
        } else if (osType.equals("MacOS")) {
            factory = new MacOSFactory();
        }

        assertNull("Factory should be null for unsupported OS", factory);
    }

    @Test
    public void testApplicationWithWindows() {
        UIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        assertNotNull("Application should be created with WindowsFactory", app);
    }

    @Test
    public void testApplicationWithMacOS() {
        UIFactory factory = new MacOSFactory();
        Application app = new Application(factory);
        assertNotNull("Application should be created with MacOSFactory", app);
    }
}
