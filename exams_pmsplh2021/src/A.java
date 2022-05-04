public class A extends MyClass implements MyInterface{
    private String myName;
    A(String s1,int i2){
        this.setS1(s1);
        this.setI2(i2);
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
   public String doSomething(int a){

        return "Hi from class A";
    }
}
