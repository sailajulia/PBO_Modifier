public class ModifierExample {
    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40; // tanpa modifikasi akses

    public void publicMethod() {
        System.out.println("Ini adalah metode dengan akses publik (public).");
    }

    private void privateMethod() {
        System.out.println("Ini adalah metode dengan akses privat (private).");
    }

    protected void protectedMethod() {
        System.out.println("Ini adalah metode dengan akses terlindungi (protected).");
    }

    void defaultMethod() { // tanpa modifikasi akses
        System.out.println("Ini adalah metode dengan akses default.");

    }

}