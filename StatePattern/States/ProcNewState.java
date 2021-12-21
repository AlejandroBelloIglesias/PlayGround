package States;

public class ProcNewState implements ProcState { //DONE

    Proc p;
    
    public ProcNewState(Proc p) {
        this.p = p;
    }

    @Override
    public void admit() { 
        System.out.println( p + " admitted. Moving towards ready state");
        p.changeState(new ProcReadyState(p));
    }

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
