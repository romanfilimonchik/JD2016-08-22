package by.it.snegurskiy.jd01.jd01_12;

import java.util.*;

/**
 * Created by snegurskiy.nn on 19.09.2016.
 */
public class B12 {

    public static ArrayList textInArray (String args) {
        String[] Text=args.split("[\\W]+");
        ArrayList <String> Txt= new ArrayList<>();
        for (int i = 0; i <Text.length ; i++) {
            Txt.add(Text[i]);
        }
        for (int i = 0; i <Txt.size() ; i++) {
            if (Txt.get(i).equals("")) Txt.remove(i);

        }
        return Txt;
    }
    public static HashMap B1 (ArrayList S) {
        HashMap H=new HashMap();
        for (int i = 0; i < S.size(); i++) {
            if (H.containsKey(S.get(i))) H.put(S.get(i),(int)H.get(S.get(i))+1);
            else H.put(S.get(i),1);
        }
        return H;
    }

    public static List<Integer> deletecircul(List<Integer> A) {
        int i=0;
        while (A.size()>1){
            if (i>=A.size()) i=i-A.size();
            A.remove(i);
            i++;
        }
           return A;
    }

}
