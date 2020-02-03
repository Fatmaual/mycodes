package InterfaceMuhtar;

public interface Interface_vs_AbstractClass {
    public abstract void method1();
    public abstract int method2();
    public void method3();
    public void method4();

}
class Test implements Interface_vs_AbstractClass{

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}