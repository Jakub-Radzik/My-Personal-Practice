package parent_child;

public class Parent {
    public static int a = 0;

    private int b = 0;

    public Parent(int b) {
        this.b = b;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Parent.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
