package States;

public class ProcReadyState implements ProcState { //DONE

    Proc p;
    
    public ProcReadyState(Proc p) {
        this.p = p;
    }

    @Override
    public void admit() {}

    @Override
    public void dispatch() {
        System.out.println(p + " got executed.");
        p.changeState(new ProcRunningState(p));
    }

    @Override
    public void interrupt() {}

    @Override
    public void ioEvent() {}

    @Override
    public void ioComplete() {}

    @Override
    public void terminate() {
        System.out.println(p + " was killed :(.");
        p.changeState(new ProcTerminatedState(p));
    }
    
}
