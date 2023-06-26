package ut.com.devdemo;

import org.junit.Test;
import com.devdemo.api.MyPluginComponent;
import com.devdemo.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class SubtractionServiceUnitTests
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}