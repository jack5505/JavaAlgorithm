package leetcodes;

import java.util.ArrayList;
import java.util.List;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Medium {
    public static void main(String[] args) {
            Medium m = new Medium();
        for (String combination : m.letterCombinations("")) {
            System.out.println(combination);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        String ans[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> answer = new ArrayList<>();
        if(digits.length() == 4){
            for(int i =  0 ; i < ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].length(); i++){
                for(int j = 0 ; j < ans[Integer.parseInt(String.valueOf(digits.charAt(1)))].length(); j ++){
                    for(int j1 = 0 ; j1 < ans[Integer.parseInt(String.valueOf(digits.charAt(2)))].length(); j1 ++){
                        for(int k = 0 ; k < ans[Integer.parseInt(String.valueOf(digits.charAt(3)))].length(); k ++){
                                answer.add(String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].charAt(i)) +
                                        String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(1)))].charAt(j)) +
                                        String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(2)))].charAt(j1)) +
                                        String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(3)))].charAt(k)));
                        }
                    }
                }
            }
        }
        else if(digits.length() == 3){
            for(int i = 0 ; i < ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].length(); i ++){
                for(int j = 0 ; j < ans[Integer.parseInt(String.valueOf(digits.charAt(1)))].length(); j ++){
                    for(int k = 0 ; k < ans[Integer.parseInt(String.valueOf(digits.charAt(2)))].length(); k ++){
                        answer.add(String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].charAt(i)) +
                            String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(1)))].charAt(j)) +
                            String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(2)))].charAt(k)));
                    }
                }
            }
        }
        else if(digits.length() == 2){
            for(int i = 0 ; i < ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].length(); i ++){
                for(int j = 0 ; j < ans[Integer.parseInt(String.valueOf(digits.charAt(1)))].length(); j ++){
                    answer.add(String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].charAt(i)) +
                        String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(1)))].charAt(j)));
                }
            }
        }
        else{
            for (int i = 0 ; i < ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].length(); i ++ ){
                answer.add(String.valueOf(ans[Integer.parseInt(String.valueOf(digits.charAt(0)))].charAt(i)));
            }
        }
        return answer;

    }
}
