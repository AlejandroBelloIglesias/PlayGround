package States;

public class ProcRunningState implements ProcState { //DONE

    Proc p;
    
    public ProcRunningState(Proc p) {
        this.p = p;
    }

    @Override
    public void admit() {}

    @Override
    public void dispatch() {}

    @Override
    public void interrupt() {
        System.out.println(p + " got interrupted.");
        p.changeState(new ProcReadyState(p));
    }

    @Override
    public void ioEvent() {
        System.out.println(p + " got blocked by I/O operation.");
        p.changeState(new ProcBlockedState(p));
    }

    @Override
    public void ioComplete() {}

    @Override
    public void terminate() {
        System.out.println(p + " terminates.");
        p.changeState(new ProcTerminatedState(p));
    }
    
}
