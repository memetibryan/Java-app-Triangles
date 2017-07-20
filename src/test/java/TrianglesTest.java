import org.junit.*;
import static org.junit.Assert.*;

public class TrianglesTest {

	@Test
	public void triangleName_triangleNameEqiulateral_userInput() {
		Triangles checkName = new Triangles();
		sideA = 1;
		sideB = 1;
		sideC = 1;
		assertEquals(checkName.triangleName("Equilateral"));
	}
}