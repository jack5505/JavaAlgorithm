package effectiveJava;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class TestIt {
    public static void main(String[] args) {
        Builder builder = new Builder.Build()
            .name("jack")
            .age("29")
            .gender("MALE")
            .buildIt();
        System.out.println(builder.getAge() +" " + builder.getName() +" " + builder.getGender());
    }
}
