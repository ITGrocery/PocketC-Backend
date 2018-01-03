/**
 * @ author chenxl
 * @ date 2018/1/2 14:42
 * @ describe
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething() {
        System.out.println( "call doSomething() in RealSubject" );
    }
}
