import java.util.*;

public class DesignerPdfViewer {
    public static void main(String[] args) {
        List<Integer> char1= Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7);
        String word="zabc";
        System.out.println(designerPdfViewer(char1,word)+"mm2");
    }
    private static int designerPdfViewer(List<Integer> h, String word){
        Map<Character,Integer> m1=new HashMap<>();
        List<Integer> tofindwordMax= new ArrayList<>();
        int i=0;
        for (char c1='a';c1 <= 'z'; ++c1){
            m1.put(c1,h.get(i));
            i++;
        }
        for (int j=0; j< word.length(); j++){
            tofindwordMax.add(m1.get(word.charAt(j)));
        }
        return Collections.max(tofindwordMax)*word.length();
    }
}
