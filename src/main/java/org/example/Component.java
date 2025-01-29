package org.example;

public interface Component {
    String getName();
    void add(Component component);
    void remove(Component component);
}
