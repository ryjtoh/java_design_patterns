package creational_patterns.Factory.Factory;

import creational_patterns.Factory.Buttons.Button;
import creational_patterns.Factory.Buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
