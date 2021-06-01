package parent_child;

public class Child extends Parent {
    public Child(int b) {
        super(b);
    }

    @Override
    public int getB() {
        return super.getB();
    }

    @Override
    public void setB(int b) {
        super.setB(b);
    }
}
