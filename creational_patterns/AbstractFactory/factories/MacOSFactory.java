package creational_patterns.AbstractFactory.factories;

import creational_patterns.AbstractFactory.buttons.Button;
import creational_patterns.AbstractFactory.buttons.MacOSButton;
import creational_patterns.AbstractFactory.checkboxes.Checkbox;
import creational_patterns.AbstractFactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}