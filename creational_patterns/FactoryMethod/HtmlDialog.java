package creational_patterns.FactoryMethod;

import creational_patterns.FactoryMethod.Buttons.Button;
import creational_patterns.FactoryMethod.Buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
