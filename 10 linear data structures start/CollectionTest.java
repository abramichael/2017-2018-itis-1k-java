package tests;

import itis.collections.IntArrayCollection;
import org.junit.Assert;
import org.junit.Test;

public class CollectionTest {

    @Test
    public void newCollectionShouldHaveSize0() {
        IntArrayCollection iac = new IntArrayCollection();
        Assert.assertEquals(0, iac.size());
    }

    @Test
    public void newCollectionShouldBeEmpty() {
        IntArrayCollection iac = new IntArrayCollection();
        Assert.assertTrue(iac.isEmpty());
    }
    @Test
    public void checkIfAddIsOk() {
        IntArrayCollection iac = new IntArrayCollection();
        iac.add(100);
        Assert.assertTrue(iac.contains(100));
    }

    @Test
    public void checkThatSizeAfterAddIncrements() {
        IntArrayCollection iac = new IntArrayCollection();
        iac.add(100);
        Assert.assertEquals(1, iac.size());
    }
}
