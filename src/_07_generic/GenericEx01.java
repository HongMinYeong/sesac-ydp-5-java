package _07_generic;

import java.lang.annotation.ElementType;
import java.util.ArrayList;

// 일반 클래스
class CustomList{
    ArrayList<String> list = new ArrayList<>();
    public void addElement(String element){ list.add(element);}
    public void removeElement(String element){ list.remove(element);}

    public String get(int idx){return list.get(idx);}

    @Override
    public String toString() { return "CustomList = " + list ;}
}

// 제네릭 클래스
class CustomeListGeneric<T>{

        ArrayList<T> list = new ArrayList<>();
        public void addElement(T element){ list.add(element);}
        public void removeElement(T element){ list.remove(element);}

        public T get(int idx){return list.get(idx);}

        @Override
        public String toString() { return "CustomeListGeneric = " + list ;}

}
public class GenericEx01 {
    public static void main(String[] args) {
        //not using generic
        CustomList li = new CustomList();
        li.addElement("first");
        li.addElement("second");
        li.addElement("third");
        System.out.println(li.toString()); //CustomList = [first, second, third]
        System.out.println();
        li.removeElement("second");
        System.out.println(li.toString()); //CustomList = [first, third]

        String str = li.get(1);
        System.out.println(str); //third
        System.out.println();

        //using generic
        CustomeListGeneric<Integer> gLi =  new CustomeListGeneric<>();
        gLi.addElement(3);
        gLi.addElement(6);
        gLi.addElement(9);
        gLi.addElement(12);
        System.out.println(gLi.toString()); //CustomeListGeneric = [3, 6, 9, 12]
        gLi.removeElement(9);
        System.out.println();
        System.out.println(gLi.toString()); //CustomeListGeneric = [3, 6, 12]
        System.out.println();

        Integer value = gLi.get(1);
        System.out.println(value); //6
        System.out.println();

        CustomeListGeneric<Character> gLi2 =  new CustomeListGeneric<>();
        gLi2.addElement('A');
        gLi2.addElement('B');
        gLi2.addElement('C');
        gLi2.addElement('D');
        gLi2.addElement('E');
        System.out.println(gLi2.toString()); //CustomeListGeneric = [A, B, C, D, E]
        System.out.println();


        gLi2.removeElement('D');
        System.out.println(gLi2.toString());

        System.out.println();
        Character value2 = gLi2.get(3);
        System.out.println(value2); //E
    }
}
