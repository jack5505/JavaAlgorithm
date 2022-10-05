package effectiveJava;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Builder2 {
    private String name;
    private int age;
    private String family;

    public static class  Builder {
        private String name;
        private int age;
        private String family;

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder family(String family){
            this.family = family;
            return this;
        }

        public Builder2 build(){
            return new Builder2(this);
        }
    }

    public Builder2(Builder builder) {
        this.name = builder.name;
        this.age  = builder.age;
        this.family = builder.family;
    }

}
