package creational_patterns.FactoryMethod;

import creational_patterns.FactoryMethod.Buttons.Button;
import creational_patterns.FactoryMethod.Buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
