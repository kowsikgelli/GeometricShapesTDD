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
        void toCalculateAreaWhenLengthIsNegativeAndWidthIsPositive(){
            Rectangle rectangle = new Rectangle(-4,2);
            assertEquals(-8,rectangle.area());
        }

        @Test
        void toCalculatePerimeterWhenLengthAndWidthArePositive(){
            Rectangle rectangle = new Rectangle(4,2);
            assertEquals(12,rectangle.perimeter());
        }

        @Test
        void toCalculatePerimeterWhenLengthAndWidthAreNegative(){
            Rectangle rectangle = new Rectangle(-4,-2);
            assertEquals(-12,rectangle.perimeter());
        }

        @Test
        void toCalculatePerimeterWhenLengthIsPositiveAndWidthIsNegative(){
            Rectangle rectangle = new Rectangle(4,-2);
            assertEquals(4,rectangle.perimeter());
        }

        @Test
        void toCalculatePerimeterWhenLengthIsNegativeAndWidthIsPositive(){
            Rectangle rectangle = new Rectangle(-4,2);
            assertEquals(-4,rectangle.perimeter());
        }
    }

    @Nested
    public class SquareAreaAndPerimeterTest{
        @Test
        void toCalculateAreaWhenSideIsPositive(){
           Square square = new Square(4);
           assertEquals(16,square.area());
        }

        @Test
        void toCalculateAreaWhenSideIsNegative(){
            Square square = new Square(-4);
            assertEquals(16,square.area());
        }
    }
}
