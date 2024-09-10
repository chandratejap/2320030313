package Hello;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checking a checkbox in Windows style.");
    }
}