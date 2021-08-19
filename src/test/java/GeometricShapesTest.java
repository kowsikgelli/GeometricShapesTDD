import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricShapesTest {
    @Nested
    public class RectangleAreaAndPerimeterTest{
        @Test
        void toCalculateAreaWhenLengthAndWidthArePositive(){
            Rectangle rectangle = new Rectangle(4,2);
            assertEquals(8,rectangle.area());
        }

        @Test
        void toCalculateAreaWhenLengthAndWidthAreNegative(){
            Rectangle rectangle = new Rectangle(-4,-2);
            assertEquals(8,rectangle.area());
        }

        @Test
        void toCalculateAreaWhenLengthIsPositiveAndWidthIsNegative(){
            Rectangle rectangle = new Rectangle(4,-2);
            assertEquals(-8,rectangle.area());
        }

        @Test
        void toCalculateWhenLengthIsNegativeAndWidthIsPositive(){
            Rectangle rectangle = new Rectangle(-4,2);
            assertEquals(-8,rectangle.area());
        }
    }
}
