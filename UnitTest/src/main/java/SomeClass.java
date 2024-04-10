public class SomeClass {

    public static void main(String[] args) {
        A a1 = new A();
        a1.methodWithException(-1);
    }

    private String privateMethod(){
        return "Hello";
    }

    private String privateMethodWithArgument(String a){
        return a;
    }

}

class A {
    public A(B mockB) {
    }

    public A() {
    }

    public void methodA() {
        System.out.println("Вызван метод A");
    }

    public void callMethodB(B b) {
        System.out.println("Вызов метода B из A");
        b.methodB();
    }

    public void methodWithException(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение должно быть больше или равно нулю");
        } else {
            System.out.println("Норм");
        }
    }

}

class B {
    public B(A mockA) {
    }

    public B() {
    }

    public void methodB() {
        System.out.println("Вызов метода B");
    }

    public void callMethodA(A a) {
        System.out.println("Вызов метода A из B");
        a.methodA();
    }
}

