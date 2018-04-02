package test.wordladder;

import  wordladder.wordladder;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * wordladder Tester.
 *
 * @author <Authors name>
 * @since <pre>���� 8, 2018</pre>
 * @version 1.0
 */
public class wordladderTest {

    wordladder test_wl=new wordladder("","","");
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    /**
     *
     * Method: isIsinput_valid()
     *
     */
    @Test
    public void testIsIsinput_valid() throws Exception {
//TODO: Test goes here...
        test_wl.set_prop("src/dictionary.txt","ass","as");
        test_wl.read_dict();
        assertEquals(true,test_wl.isIsinput_valid());

        test_wl.set_prop("src/dictionary.txt","asasds","as");
        assertEquals(false,test_wl.isIsinput_valid());

        test_wl.set_prop("src/dictionary.txt","asdasds","aasdsads");
        assertEquals(false,test_wl.isIsinput_valid());

        test_wl.set_prop("src/dictionary.txt","data","daze");
        assertEquals(true,test_wl.isIsinput_valid());

        test_wl.set_prop("src/dictionary.txt","","as");
        assertEquals(false,test_wl.isIsinput_valid());

    }

    /**
     *
     * Method: read_dict()
     *
     */
    @Test
    public void testRead_dict() throws Exception {
//TODO: Test goes here...
        test_wl.set_prop("","","");
        assertEquals(false,test_wl.read_dict());
        test_wl.set_prop("src/dictionary.txt","","");
        assertEquals(true,test_wl.read_dict());
        test_wl.set_prop("src/dasdictionary.txt","","");
        assertEquals(false,test_wl.read_dict());

    }

    /**
     *
     * Method: wl_stack()
     *
     */
    @Test
    public void testWl_stack() throws Exception {
//TODO: Test goes here...
        test_wl.dict.clear();
        test_wl.set_prop("src/dictionary.txt","data","date");
        test_wl.read_dict();
        Stack<String>test=test_wl.wl_stack();
        assertEquals("data",test.peek());
        test_wl.set_prop("src/dictionary.txt","tricadcle","asd");
        assertEquals("No word ladder.",test_wl.wl_stack().peek());

    }

    /**
     *
     * Method: print_wl(Stack<String>wl)
     *
     */

    @Test
    public void testPrint_wl() throws Exception {
//TODO: Test goes here...
        Stack<String>test=new Stack<String>();
        test.push("1");
        test.push("2");
        test.push("3");
        test_wl.print_wl(test);
    }


} 
