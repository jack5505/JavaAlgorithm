package oca;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Checked {
    class NoMoreCarrotException extends Exception{

    }

    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotException e) {
            e.printStackTrace();
        }
    }

    private static void eatCarrot() throws NoMoreCarrotException {

    }

    private static void good(){

    }


    class CanNotHopException extends Exception{}

    class Hoper{
        public void hop() {}
    }

    class Bunny extends Hoper{

        @Override
        public void hop() throws ClassCastException {

        }
    }
}
