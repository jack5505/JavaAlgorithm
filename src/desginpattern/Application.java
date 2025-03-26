package desginpattern;

public class Application {
    private Button button;
    private CheckBox checkBox;
    public Application(UiFactory uiFactory){
        button = uiFactory.createButton();
        checkBox = uiFactory.createCheckBOx();
    }
    public void paint(){
        button.render();
        checkBox.toggle();
    }

}
