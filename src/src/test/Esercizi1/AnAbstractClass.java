package src.test.Esercizi1;

public abstract class AnAbstractClass {

    public AnAbstractClass() {
        System.out.println("Constructor of abstract class");
    }

    public abstract void aMethod();

    public void NotAbstractMethod(){
        System.out.println("normal method of abstract class");
    }
}
