import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class SomeClassTest {

    SomeClass someClass;
    @Test
    public void main() {
        A a = new A();
        System.out.println("Тестирование метода methodA");
        a.methodA();

        System.out.println("Тестирование вызова метода B из A");
        B mockB = new B() {
            @Override
            public void methodB() {
                System.out.println("Мок-метод B для тестирования");
            }
        };
        a.callMethodB(mockB);
    }

    @Test
    public void testCallMethodB() {
        B mockB = Mockito.mock(B.class);
        A a = new A(mockB);
        a.callMethodB(mockB);
        Mockito.verify(mockB, Mockito.times(1)).methodB();
    }


    @Test
    public void testMethodB() {
        A mockA = Mockito.mock(A.class);
        B b = new B(mockA);
        b.callMethodA(mockA);
        b.callMethodA(mockA);
        Mockito.verify(mockA, Mockito.times(1)).methodA();
    }

    @Test
    public void testMethodWithException() {
        A a = new A();

        // Проверяем, что при передаче отрицательного значения будет выброшено исключение IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            a.methodWithException(-2);
        });

        // Проверяем, что при передаче положительного значения исключение не выбрасывается
        assertDoesNotThrow(() -> {
            a.methodWithException(5);
        });
    }

    @Test
    public void testPrivateMethod1() throws Exception {
        String result;
        result = Whitebox.<String>invokeMethod(someClass, "privateMethod", null);
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testPrivateMethod()  {
        try {
            Method method = SomeClass.class.getDeclaredMethod("privateMethod", null);

            method.setAccessible(true);
            assertEquals("abc", method.invoke(someClass).toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testPrivateMethodWithArgument()  {

        try {
            Method method = SomeClass.class.getDeclaredMethod("privateMethodWithArgument", String.class);
            method.setAccessible(true);
            assertEquals("Hello", method.invoke(someClass, "h").toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
