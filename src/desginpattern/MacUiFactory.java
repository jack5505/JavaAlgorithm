package desginpattern;

public class MacUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBOx() {
        return new MacCheckBox();
    }

}
