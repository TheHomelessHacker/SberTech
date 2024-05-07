import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWorkTest {

    @org.junit.Test
    public void testCountEvenElements(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(2, HomeWork.countEvenElements(list1));
    }

    @org.junit.Test
    public void testSwap() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        HomeWork.swap(list, 1, 3);
        assertEquals(4, (int) list.get(1));
        assertEquals(1, (int) list.get(3));
    }
}
