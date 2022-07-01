package States;
public class ProcBlockedState implements ProcState { //DONE

    Proc p;
    
    public ProcBlockedState(Proc p) {
        this.p = p;
    }

    @Override
    public void admit() {}

    @Override
    public void dispatch() {
        System.err.println("You can't execute a blocked process!");
    }

    @Override
    public void interrupt() {}

    @Override
    public void ioEvent() {}

    @Override
    public void ioComplete() {
        System.out.println(p + " is done with I/O. Ready to execute.");
        p.changeState(new ProcReadyState(p));
    }

    @Override
    public void terminate() {}
    
}
