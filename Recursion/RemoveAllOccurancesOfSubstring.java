package Recursion;

public class RemoveAllOccurancesOfSubstring {
    public String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        if(index==-1)
         return s;
        
        return removeOccurrences(s.substring(0,index)+s.substring(index+part.length()),part);
       
    }
    public static void main(String[] args) {
        RemoveAllOccurancesOfSubstring remover = new RemoveAllOccurancesOfSubstring();
        String s = "daabcbaabcbc";
        String part = "abc";
        String result = remover.removeOccurrences(s, part);
        System.out.println(result); // Output: "dab"
    }
}
