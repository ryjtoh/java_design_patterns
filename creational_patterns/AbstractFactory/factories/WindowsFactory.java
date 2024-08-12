package creational_patterns.AbstractFactory.factories;

import creational_patterns.AbstractFactory.buttons.Button;
import creational_patterns.AbstractFactory.buttons.WindowsButton;
import creational_patterns.AbstractFactory.checkboxes.Checkbox;
import creational_patterns.AbstractFactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
