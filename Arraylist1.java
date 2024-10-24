import java.util.*;
public class Arraylist1 {
    
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(80);
        list.add(30);
        list.add(22);


        System.out.println(list);

        list.get(1);
        list.add(1,1);
        System.out.println(list);
        list.set(0,5);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.println(""+list.get(i));
        }

        Collections.sort(list);
    }
}
