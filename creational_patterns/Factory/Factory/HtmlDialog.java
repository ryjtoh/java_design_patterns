package creational_patterns.Factory.Factory;

import creational_patterns.Factory.Buttons.Button;
import creational_patterns.Factory.Buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
