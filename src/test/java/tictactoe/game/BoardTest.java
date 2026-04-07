package tictactoe.game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private static Board boardTest;

    @BeforeAll
    public static void initBlankBoard(){
        boardTest= new Board();
    }

    @Test
    public void constructorTest(){
        assertTrue(boardTest.isEmptyAt()); // Will come back to this !!!!!!!!!!
        assertFalse(boardTest.isFull());
        assertNotNull(boardTest);
        assertNotNull(boardTest.toString());

    }

    @Test
    public void testPlace() throws ParseException {

        Position midmid = Position.parse("Middle middle");
        boardTest.place(midmid, Token.X);
        assertFalse(boardTest.isEmptyAt(midmid),"Should not be empty in the middle cells");
    }




}