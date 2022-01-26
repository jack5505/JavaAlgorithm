package effectiveJava;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Builder {
    private String name;
    private String age;
    private String gender;

    public static class Build{
        private String name;
        private String age;
        private String gender;

        public Build name(String name) {
            this.name = name;
            return this;
        }
        public Build age(String age){
            this.age = age;
            return this;
        }
        public Build gender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder buildIt(){
            return new Builder(this);
        }

    }

    public Builder(Build build) {
        this.name = build.name;
        this.age = build.age;
        this.gender = build.gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
