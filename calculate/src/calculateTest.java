
public class calculateTest {
    calculate c1 = new calculate();

    @Test
    public void addTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = c1.add(num1, num2);
        // then
        assertEquals(45, result);
    }

    @Test
    public void subTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = c1.sub(num1, num2);
        // then
        assertEquals(35, result);
    }

    @Test
    public void mulTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = c1.mul(num1, num2);
        // then
        assertEquals(200, result);
    }

    @Test
    public void divTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = c1.div(num1, num2);
        // then
        assertEquals(8, result);
    }
}
