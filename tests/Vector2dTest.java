import main.Vector2d;
import org.junit.Test;
import org.junit.Assert;

import java.util.Vector;

public class Vector2dTest {

    /**
     * Tests for Vector2d.dist
     */
    @Test
    public void testDist() {
        Vector2d v1 = new Vector2d(1, 2);
        Vector2d v2 = new Vector2d(3, 4);
        Assert.assertEquals(2 * Math.sqrt(2), Vector2d.dist(v1, v2), 0.1);

        Assert.assertEquals(v1.length(), Vector2d.dist(v1, new Vector2d(0, 0)), 0.1);
        Assert.assertEquals(v1.length(), Vector2d.dist(new Vector2d(0, 0), v1), 0.1);
    }

    @Test
    public void testNormalize() {
        Vector2d v = new Vector2d(5, 5);
        Vector2d ret = new Vector2d(0, -25);
        Vector2d.normalize(v, ret);
        Assert.assertEquals(1.0, ret.length(), 0.1);
        Assert.assertEquals(1.0, Vector2d.normalize(v).length(), 0.1);
        v.normalize();
        Assert.assertEquals(1.0, v.length(), 0.1);
    }

    /**
     * Tests for Vector2d.add
     */
    @Test
    public void testAdd() {
        Vector2d v1 = new Vector2d(1, 2);
        Vector2d v2 = new Vector2d(3, 4);
        Vector2d ret = new Vector2d(-4, -6);
        Assert.assertEquals(new Vector2d(4, 6), Vector2d.add(v1, v2));

        Vector2d.add(v1, v2, ret);
        Assert.assertEquals(new Vector2d(4, 6), ret);

        v2 = new Vector2d(0, 0);
        Assert.assertEquals(v1, Vector2d.add(v1, v2));

        v1 = new Vector2d(0, 0);
        v2 = new Vector2d(0, 0);
        Assert.assertEquals(new Vector2d(0, 0), Vector2d.add(v1, v2));

        v1 = new Vector2d(-3, -4);
        v2 = new Vector2d(-1, -2);
        Assert.assertEquals(new Vector2d(-4, -6), Vector2d.add(v1, v2));
    }
}
