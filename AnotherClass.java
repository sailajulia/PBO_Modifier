public class AnotherClass {
    ModifierExample obj = new ModifierExample();

    void accessExample() {
        System.out.println("Public variable: " + obj.publicVariable);
        // System.out.println("Private variable: " + obj.privateVariable); // Ini akan menyebabkan kesalahan kompilasi karena private
        System.out.println("Protected variable: " + obj.protectedVariable);
        System.out.println("Default variable: " + obj.defaultVariable);

        obj.publicMethod();
        // obj.privateMethod(); // Ini akan menyebabkan kesalahan kompilasi karena private
        obj.protectedMethod();
        obj.defaultMethod();
    }
}