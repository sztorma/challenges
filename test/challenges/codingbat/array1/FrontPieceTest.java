package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FrontPieceTest {

    public FrontPieceTest() {
    }

    @Test
    public void testFrontPiece() {
        System.out.println("frontPiece");
        FrontPiece instance = new FrontPiece();
        assertArrayEquals(new int[]{1, 2}, instance.frontPiece(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, instance.frontPiece(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, instance.frontPiece(new int[]{1}));
        assertArrayEquals(new int[]{}, instance.frontPiece(new int[]{}));
    }

}
