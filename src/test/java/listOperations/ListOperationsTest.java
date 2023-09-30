package listOperations;

import org.junit.jupiter.api.Test;
import ru.chirkov.listOperations.ListOperations;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
//import static sun.awt.SunToolkit.isInstanceOf;

public class ListOperationsTest {
    public static void main(String[] args) {
        ListOperationsTest.hasCorrectSum();
        ListOperationsTest.hasCorrectFindMax();
        ListOperationsTest.hasCorrectFilterDtrings();
    }

    @Test
    public static void hasCorrectSum() {
        assertThatThrownBy(() -> ListOperations.sumLists(null, null))
                .isInstanceOf(NullPointerException.class);
        assertThat(ListOperations.sumLists(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)))
                .isEqualTo(Arrays.asList(5, 7, 9));
        System.out.println("Summary method for two integer list successfully ended");
    }

    @Test
    public static void hasCorrectFindMax() {
        assertThatThrownBy(() -> ListOperations.findMax(null))
                .isInstanceOf(NullPointerException.class);

        assertThat(ListOperations.findMax(Arrays.asList(1,2,3,4,-4,-9,0,232845)))
                .isEqualTo(232845);
        System.out.println("FindMax method for integer list successfully ended");
    }

    @Test
    public static void hasCorrectFilterDtrings() {

        assertThatThrownBy(() -> ListOperations.filterStrings(null,  0))
                .isInstanceOf(NullPointerException.class);

        assertThat(ListOperations.filterStrings(Arrays.asList("foo", "bar", "baz", "", "come on","Condition"),5))
                .isEqualTo(Arrays.asList("come on","Condition"));
        assertThat(ListOperations.filterStrings(Arrays.asList("foo", "bar", "baz", "", "come on","Condition"),-4))
                .isEqualTo(Arrays.asList("foo", "bar", "baz", "", "come on","Condition"));
        System.out.println("Filter strings from strings lengths are correct");

    }
}
