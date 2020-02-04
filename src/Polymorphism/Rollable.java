package Polymorphism;

public interface Rollable {
    void rollBack();
    void rollForward();
    default void roll(){};
}
