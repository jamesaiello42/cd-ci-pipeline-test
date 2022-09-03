package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FoodsTest {

    @Test
    public void testIfFoodIsPresent() {
        assertTrue(linearSearch("Lobster"));
    }

    @Test
    public void testIfFoodIsNotPresent() {
        assertFalse(linearSearch("Ice cream"));
    }

    private boolean linearSearch(String searchTerm) {
        for (String food : new Foods().getFoods()) {
            if (searchTerm.equals(food)) {
                return true;
            }
        }
        return false;
    }
}
