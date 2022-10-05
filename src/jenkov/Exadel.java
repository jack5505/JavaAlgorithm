package jenkov;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Exadel {
    class Test{
        public String name;
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("salom",3);
        hashMap.put("test",5);
        hashMap.put("test",9);
        hashMap.put("test2",15);
        Map map = Collections.synchronizedMap(hashMap);
        synchronized (map){
            Iterator i = map.entrySet().iterator();
            while (i.hasNext()){
                Map.Entry me = (Map.Entry) i.next();
                System.out.println(me.getKey() +" : ");
                System.out.println(me.getValue());
            }
        }
    }
}
