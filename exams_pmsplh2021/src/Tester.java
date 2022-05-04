import java.util.ArrayList;

public class Tester {

    public static void main(String[] args){
        MyClass[] myClasses=new MyClass[2];
        String[] str=new String[3];
        str[0]="1";
        str[1]="2";
        str[2]="3";
        ArrayList<MyInterface> al=new ArrayList<>();
        myClasses[0]=new A("Fota",3);
        myClasses[1]=new B("theodora",24,true,1234,str);
        C c=new C(al);
        A a=new A("Maria",23);
        B b=new B("Papadopoulou",34,false,5678,str);
        c.addElement(a);
        c.addElement(b);
        System.out.println(a.doSomething(2));
        System.out.println(b.doSomething(5));
        c.Something(12);
    }
}
