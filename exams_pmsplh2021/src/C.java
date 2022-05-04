import java.util.ArrayList;

public class C {
    ArrayList<MyInterface> arrayList;

    public C(ArrayList<MyInterface> arrayList) {
        this.arrayList = arrayList;
    }

    public void addElement(MyInterface element) {
        arrayList.add(element);
        System.out.println("Element added!");
    }

    public void Something( int number) {
        for (MyInterface i : arrayList) {
           System.out.println( i.doSomething(number));
        }
    }


}

