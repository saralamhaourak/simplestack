package deqo.slam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplTest {


    SimleStack s0,s1;
    Item it;

    @Before
    public void setup(){

        s0=new SimpleStackImpl();
        s1=new SimpleStackImpl();
        it=new Item();
        s1.push(it);
    }

    @Test
    public void isEmptyTest() {

        assertTrue(s0.isEmpty());
        assertFalse(s1.isEmpty());
    }

    @Test
    public void getSizeTest() {
        assertEquals(0,s0.getSize());
        assertEquals(1,s1.getSize());
    }

    @Test
    public void pushTest() {
        it=new Item();
        s0.push(it);
        assertEquals(it,s0.peek());
    }


    @Test
    public void peekTest() {
        it=new Item();
        s0.push(it);
        assertEquals(it,s0.peek());
    }

    @Test
    public void popTest() {
        s1.pop();
        assertTrue(s1.isEmpty());
    }





}