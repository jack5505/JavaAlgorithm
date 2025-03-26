package desginpattern;

public class Demo {
    private static Application application(){
        Application application;
        UiFactory uiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);
        if(osName.equals("mac os x")) {
            uiFactory = new MacUiFactory();
        }else{
            uiFactory = new WindowUiFactory();
        }
        application = new Application(uiFactory);
        return application;
    }
    public static void main(String[] args) {
        Application application = application();
        application.paint();
    }
}
