package creational_patterns.AbstractFactory.factories;

import creational_patterns.AbstractFactory.buttons.Button;
import creational_patterns.AbstractFactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
