package app;

public class MethodReferencesTest {

    int calc(int x, int y, Calculate cal) {
        return cal.operation(x, y);
    }
}