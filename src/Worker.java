// Bizim calisanimiz
public class Worker implements IWorkable, IEatable, IPayable{

    // COKLU İMPLEMENTS

    @Override
    public void eat() {
        System.out.println("To eat!");
    }

    @Override
    public void pay() {
        System.out.println("Get a pay!");
    }

    @Override
    public void work() {
        System.out.println("To work!");
    }
}
