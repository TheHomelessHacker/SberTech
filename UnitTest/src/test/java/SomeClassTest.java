import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class SomeClassTest {

    @Test
    public void main() {
        firstClass firstclass = new firstClass();
        System.out.println("Тестирование метода methodA");
        firstclass.callMethodA();

        System.out.println("Тестирование вызова метода B из A");
        secondClass mockB = new secondClass() {
            @Override
            public void callMethodB() {
                System.out.println("Мок-метод B для тестирования");
            }
        };
        firstclass.callMethodB(mockB);
    }

    @Test
    public void testCallMethodB() {
        secondClass mockB = Mockito.mock(secondClass.class);
        firstClass firstclass = new firstClass(mockB);
        firstclass.callMethodB(mockB);
        Mockito.verify(mockB, Mockito.times(1)).callMethodB();
    }


    @Test
    public void testMethodB() {
        firstClass mockA = Mockito.mock(firstClass.class);
        secondClass secondclass = new secondClass(mockA);
        secondclass.callMethodA(mockA);
        //b.callMethodA(mockA);
        Mockito.verify(mockA, Mockito.times(1)).callMethodA();
    }

    @Test
    public void testMethodWithException() {
        firstClass firstclass = new firstClass();

        // Проверяем, что при передаче отрицательного значения будет выброшено исключение IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            firstclass.methodWithException(-2);
        });

        // Проверяем, что при передаче положительного значения исключение не выбрасывается
        assertDoesNotThrow(() -> {
            firstclass.methodWithException(5);
        });
    }


    @Test
    public void testPrivateMethod()  {
        try {
            SomeClass someClass2 = new SomeClass();
            Method method = SomeClass.class.getDeclaredMethod("privateMethod",  null);

            method.setAccessible(true);
            assertEquals("Hello", method.invoke(someClass2).toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testPrivateMethodWithArgument()  {

        try {
            SomeClass someClass3 = new SomeClass();
            Method method = SomeClass.class.getDeclaredMethod("privateMethodWithArgument", String.class);
            method.setAccessible(true);
            assertEquals("Hello", method.invoke(someClass3, "Hello").toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
