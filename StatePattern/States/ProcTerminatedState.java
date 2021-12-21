package States;
public class ProcTerminatedState implements ProcState { //DONE

    Proc p;
    
    public ProcTerminatedState(Proc p) {
        this.p = p;
    }

    @Override
    public void admit() {}

    @Override
    public void dispatch() {}

    @Override
    public void interrupt() {}

    @Override
    public void ioEvent() {}

    @Override
    public void ioComplete() {}

    @Override
    public void terminate() {}

}
