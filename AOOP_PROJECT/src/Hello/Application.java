package Hello;
import java.util.*;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.paint();
        checkbox.check();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        UIFactory factory;

        System.out.println("Enter Windows or MacOS");
        String osType=sc.nextLine();
        if (osType.equals("Windows")) {
            factory = new WindowsFactory();
            Application app = new Application(factory);
            app.render();
        } else if (osType.equals("MacOS")){
            factory = new MacOSFactory();
            Application app = new Application(factory);
            app.render();
        } else {
        	System.out.println("OS name not found");
        	System.exit(0);
        }
        sc.close();
    }
}