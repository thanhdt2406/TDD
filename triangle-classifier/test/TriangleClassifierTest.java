import com.codegym.TriangleClassifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testClassifyTriangle2_2_2() {
        int[] size = {2,2,2};
        String expected = "Tam giác đều";

        assertEquals(expected, TriangleClassifier.classifyTriangle(size));
    }

    @Test
    void testClassifyTriangle2_2_3() {
        int[] size = {2,2,3};
        String expected = "Tam giác cân";

        assertEquals(expected, TriangleClassifier.classifyTriangle(size));
    }

    @Test
    void testClassifyTriangle3_4_5() {
        int[] size = {3,4,5};
        String expected = "Tam giác thường";

        assertEquals(expected, TriangleClassifier.classifyTriangle(size));
    }

    @Test
    void testClassifyTriangle8_2_3() {
        int[] size = {8,2,3};
        String expected = "Không phải là tam giác";

        assertEquals(expected, TriangleClassifier.classifyTriangle(size));
    }

    @Test
    void testClassifyTriangleNegative1_2_1() {
        int[] size = {-1,2,1};
        String expected = "Không phải là tam giác";

        assertEquals(expected, TriangleClassifier.classifyTriangle(size));
    }

    @Test
    void testClassifyTriangle0_1_1() {
        int[] size = {0,1,1};
        String expected = "Không phải là tam giác";

        assertEquals(expected, TriangleClassifier.classifyTriangle(size));
    }
}