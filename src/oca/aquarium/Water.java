package oca.aquarium;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Water {
    @Override protected void finalize() throws Throwable {
        System.out.println("deleted");
    }
}
