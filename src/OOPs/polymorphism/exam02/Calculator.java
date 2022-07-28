package OOPs.polymorphism.exam02;

public abstract class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    public abstract void sum();
    public abstract void avg();

    final public void run() {
        sum();
        avg();
    }
}
