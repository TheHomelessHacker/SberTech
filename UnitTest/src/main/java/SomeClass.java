import org.mockito.Mockito;

public class SomeClass {

    public static void main(String[] args) {
        secondClass mockB = Mockito.mock(secondClass.class);
        firstClass a1 = new firstClass(mockB);
        a1.methodWithException(0);
    }

    private String privateMethod(){
        return "Hello";
    }

    private String privateMethodWithArgument(String a){
        return a;
    }

}

class firstClass {
    public firstClass(secondClass mockB) {
    }

    public firstClass() {
    }

    public void callMethodA() {
        System.out.println("Вызван метод A");
    }

    public void callMethodB(secondClass secondclass) {
        System.out.println("Вызов метода B из A");
        secondclass.callMethodB();
    }

    public void methodWithException(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение должно быть больше или равно нулю");
        } else {
            System.out.println("Норм");
        }
    }



}

class secondClass {
    public secondClass(firstClass mockA) {
    }

    public secondClass() {
    }

    public void callMethodB() {
        System.out.println("Вызов метода B");
    }

    public void callMethodA(firstClass firstclass) {
        System.out.println("Вызов метода A из B");
        firstclass.callMethodA();
    }
}

