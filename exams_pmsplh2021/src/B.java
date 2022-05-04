public class B extends MyClass implements MyInterface {
    private int afm;
    private String[] strings;

    B(String s1, int i2, boolean b3, int afm, String[] strings) {
        super();
        this.afm = afm;
        this.strings = strings;
    }

    public int getAfm() {
        return afm;
    }

    public void setAfm(int afm) {
        this.afm = afm;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String doSomething(int a) {

        return "Hi from class B";
    }
}
