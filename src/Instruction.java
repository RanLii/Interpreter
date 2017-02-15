
public abstract class Instruction {
    protected String label;
    protected String ins;
    protected int r;
    protected int s1;
    protected int s2;
    protected String tLabel;
    
    static Register reg = new Register();

    public Instruction() {
        //label ins s1??
    }
    
    public abstract boolean execute();
}
