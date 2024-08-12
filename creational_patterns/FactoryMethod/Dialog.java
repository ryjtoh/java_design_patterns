package creational_patterns.FactoryMethod;

import creational_patterns.FactoryMethod.Buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // other code
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
