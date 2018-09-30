import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UniqueInArrayTest {

    @Test
    public void setImplIsDupl() {
        Integer arr[] = {1,2,3,4,3,5};
        UniqueInArray<Integer> uniqueInArray = new UniqueInArray<>();
        assertTrue(uniqueInArray.printUnqiueSetImplReturn(arr));
    }

    @Test
    public void setImplIsNotDupl() {
        Integer arr[] = {1,2,3,4,5};
        UniqueInArray<Integer> uniqueInArray = new UniqueInArray<>();
        assertFalse(uniqueInArray.printUnqiueSetImplReturn(arr));
    }

    @Test
    public void adjacentDuplIsDupl() {
        Integer arr[] = {5, 1,2,2, 3,4,5};
        UniqueInArray<Integer> uniqueInArray = new UniqueInArray<>();
        assertTrue(uniqueInArray.printUnique_AdjacentDuplicates(arr));
    }

    @Test
    public void adjacentDuplNotDupl() {
        Integer arr[] = {1,2,3,4,5};
        UniqueInArray<Integer> uniqueInArray = new UniqueInArray<>();
        assertFalse(uniqueInArray.printUnique_AdjacentDuplicates(arr));
    }
}
