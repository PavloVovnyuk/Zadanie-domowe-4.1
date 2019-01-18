public class Televisor {
    private boolean isInclusive = false;

    void turnOn() {
        isInclusive = true;
    }

    void turnOff() {
        isInclusive = false;
    }

    void showStatus() {
        System.out.println ("Czy wyłączony ? _" + isInclusive);
    }
}
