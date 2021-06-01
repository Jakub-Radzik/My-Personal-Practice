package parent_child;

public class main {

    public static void main(String[] args) {

        Parent p = new Parent(5);
        Child c = new Child(10);


        System.out.println(p.getB());
        Parent.a = 2;
        System.out.println(Child.a);
        System.out.println(Parent.a);
        Parent.a = 3;
        System.out.println(Child.a);
        System.out.println(Parent.a);
        Child.a = 1;
        System.out.println(Child.a);
        System.out.println(Parent.a);
    }
}
