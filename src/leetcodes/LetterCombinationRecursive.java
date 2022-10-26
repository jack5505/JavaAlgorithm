package leetcodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class LetterCombinationRecursive {
    static Map<Integer,String> map = new HashMap<>();
    public static void main(String[] args) {
        List<String> p = new ArrayList<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(8,"wxyz");
        List<String> ans = new ArrayList<>();
        solve("23345","",ans);
        for (String an : ans) {
            System.out.println(an);
        }



    }
    public static void  solve(String pos,String path, List<String> list){
            if(pos.isEmpty()){
                list.add(path);
                return;
            }
            Integer id = Integer.parseInt(pos.charAt(0)+"");
            String p = map.get(id);
            pos = pos.substring(1);
            for (int i = 0; i < p.length() ; i++) {
                solve(pos,path + p.charAt(i),list);
            }
        }
    }

