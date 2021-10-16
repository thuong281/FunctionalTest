import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    // Kiểm thử giá trị biên

    @Test
    void Test1() {
        assertEquals("1 47", Problem.numMovesStones(50,51,99));
    }

    @Test
    void Test2() {
        assertEquals("1 48", Problem.numMovesStones(50,51,1));
    }

    @Test
    void Test3() {
        assertEquals("1 48", Problem.numMovesStones(50,51,100));
    }

    @Test
    void Test4() {
        assertEquals("1 47", Problem.numMovesStones(50,51,2));
    }

    @Test
    void Test5() {
        assertEquals("1 47", Problem.numMovesStones(50,99,51));
    }

    @Test
    void Test6() {
        assertEquals("1 48", Problem.numMovesStones(50,1,51));
    }

    @Test
    void Test7() {
        assertEquals("1 48", Problem.numMovesStones(50,100,51));
    }

    @Test
    void Test8() {
        assertEquals("1 47", Problem.numMovesStones(50,2,51));
    }

    @Test
    void Test9() {
        assertEquals("1 47", Problem.numMovesStones(99,50,51));
    }

    @Test
    void Test10() {
        assertEquals("1 48", Problem.numMovesStones(1,50,51));
    }

    @Test
    void Test11() {
        assertEquals("1 48", Problem.numMovesStones(100,50,51));
    }

    @Test
    void Test12() {
        assertEquals("1 47", Problem.numMovesStones(2,50,51));
    }

    @Test
    void Test13() {
        assertEquals("Invalid", Problem.numMovesStones(50,50,50));
    }

    // Kiểm thử bảng quyết định

    @Test
    void Test14() {
        assertEquals("Invalid", Problem.numMovesStones(50,50,23));
    }

    @Test
    void Test15() {
        assertEquals("Invalid", Problem.numMovesStones(45,50,50));
    }

    @Test
    void Test16() {
        assertEquals("Invalid", Problem.numMovesStones(50,67,50));
    }

    @Test
    void Test17() {
        assertEquals("Invalid", Problem.numMovesStones(120,50,45));
    }

    @Test
    void Test18() {
        assertEquals("Invalid", Problem.numMovesStones(50,123,67));
    }

    @Test
    void Test19() {
        assertEquals("Invalid", Problem.numMovesStones(50,65,980));
    }

    @Test
    void Test20() {
        assertEquals("2 42", Problem.numMovesStones(12,34,56));
    }
}