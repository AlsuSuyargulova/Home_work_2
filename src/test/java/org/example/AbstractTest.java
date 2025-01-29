package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractTest {
    protected abstract Component createLeaf(String name);
    protected abstract Component createComposite(String name);

    @Test
    public void testLeaf() {
        Component leaf = createLeaf("Leaf");
        assertEquals("Leaf", leaf.getName());
    }

    @Test
    public void testComposite() {
        Component composite = createComposite("Composite");
        composite.add(createLeaf("Leaf 1"));
        composite.add(createLeaf("Leaf 2"));
        assertEquals("Composite contains: Leaf 1, Leaf 2, ", composite.getName());
    }
}
