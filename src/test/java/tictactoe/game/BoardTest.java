package tictactoe.game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

//Should be called "broad test" bc of how broad I have this thing (An AI wouldn't be this funny)
class BoardTest {

    private static Board boardTest;

    @BeforeAll //RE-Check This!!!
    public static void initBlankBoard(){
        boardTest= new Board();
    }

    @Test
    public void constructorTest(){
      //  assertTrue(boardTest.isEmptyAt()); // Will come back to this !!! (Maybe not?)
        assertFalse(boardTest.isFull());
        assertNotNull(boardTest);
        assertNotNull(boardTest.toString());

    }
//battle of the mids, also known as a mid-off (Eg: Leafs and Canadians fans arguing who's the better team)
    @Test
    public void testPlace() throws ParseException {

        Position midmid = Position.parse("Middle middle");
        boardTest.place(midmid, Token.X);
        assertFalse(boardTest.isEmptyAt(midmid),"Should not be empty in the middle cells");
    }




}