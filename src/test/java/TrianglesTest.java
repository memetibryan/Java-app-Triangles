import org.junit.*;
import static org.junit.Assert.*;

public class TrianglesTest {

	@Test
    public void newTriangle_instantiatesCorrectly() {
    Triangles testTriangle = new Triangles(2, 4, 6);
    assertEquals(true, testTriangle instanceof Triangles);
   }
}