package org.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest extends AbstractTest{

    @Override
    protected Component createLeaf(String name) {
        return new Leaf(name);
    }

    @Override
    protected Component createComposite(String name) {
        return new Composite(name);
    }
    @Test
    public void testRemoveNonExistingLeaf() {
        Composite composite = (Composite) createComposite("Composite");
        Component leaf = createLeaf("Leaf");
        composite.remove(leaf); // Удаляем элемент, которого нет
        assertEquals("Composite contains: ", composite.getName()); // Ожидаем, что композит остается пустым
    }

    @Test
    public void testEmptyComposite() {
        Composite composite = (Composite) createComposite("EmptyComposite");
        assertEquals("EmptyComposite contains: ", composite.getName()); // Ожидаем, что композит пуст
    }
}

