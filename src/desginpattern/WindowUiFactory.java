package desginpattern;

public class WindowUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBOx() {
        return new WindowCheckBox();
    }

}
