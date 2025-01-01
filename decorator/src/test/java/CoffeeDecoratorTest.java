import com.zlatenov.Coffee;
import com.zlatenov.MilkDecorator;
import com.zlatenov.SimpleCoffee;
import com.zlatenov.SugarDecorator;
import com.zlatenov.WhipCreamDecorator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for verifying the Coffee Decorator pattern implementation.
 * Tests various combinations of coffee decorators and their behaviors.
 *
 * @author Angel Zlatenov
 */
class CoffeeDecoratorTest {

    @Test
    @DisplayName("Should create simple coffee with correct base price")
    void shouldCreateSimpleCoffeeWithBasePrice() {
        Coffee coffee = new SimpleCoffee();
        assertEquals(5.0, coffee.getCost());
        assertEquals("Simple Coffee", coffee.getDescription());
    }

    @Test
    @DisplayName("Should add milk correctly")
    void shouldAddMilkCorrectly() {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        assertEquals(6.5, coffee.getCost());
        assertEquals("Simple Coffee, Milk", coffee.getDescription());
    }

    @Test
    @DisplayName("Should add sugar correctly")
    void shouldAddSugarCorrectly() {
        Coffee coffee = new SugarDecorator(new SimpleCoffee());
        assertEquals(5.5, coffee.getCost());
        assertEquals("Simple Coffee, Sugar", coffee.getDescription());
    }

    @Test
    @DisplayName("Should add whip cream correctly")
    void shouldAddWhipCreamCorrectly() {
        Coffee coffee = new WhipCreamDecorator(new SimpleCoffee());
        assertEquals(7.0, coffee.getCost());
        assertEquals("Simple Coffee, Whip Cream", coffee.getDescription());
    }

    @Test
    @DisplayName("Should combine multiple decorators correctly")
    void shouldCombineDecoratorsCorrectly() {
        Coffee coffee = new WhipCreamDecorator(
                new SugarDecorator(
                        new MilkDecorator(new SimpleCoffee())));

        assertEquals(9.0, coffee.getCost());
        assertEquals("Simple Coffee, Milk, Sugar, Whip Cream", coffee.getDescription());
    }

    @Test
    @DisplayName("Should maintain order independence for cost")
    void shouldMaintainOrderIndependenceForCost() {
        Coffee coffee1 = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        Coffee coffee2 = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));

        assertEquals(coffee1.getCost(), coffee2.getCost());
    }

    @Test
    @DisplayName("Should handle multiple instances of same decorator")
    void shouldHandleMultipleInstancesOfSameDecorator() {
        Coffee coffee = new MilkDecorator(new MilkDecorator(new SimpleCoffee()));
        assertEquals(8.0, coffee.getCost());
        assertEquals("Simple Coffee, Milk, Milk", coffee.getDescription());
    }

}