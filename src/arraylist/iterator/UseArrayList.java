package arraylist.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("NY");
        list.add("FL");
        list.add("NJ");

        //Using Iterator
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Using for each loop
        for(String st:list){
            System.out.println(st);
        }

    }
}
