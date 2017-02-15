
public class Out extends Instruction{
    public Out(String label, String ins, int s1){
        this.label = label;
        this.ins = ins;
        this.s1 = s1;
    }
    
    public boolean execute(){
        System.out.println("****************" + reg.getValue(s1) + "***********************");
        return false;
    }
}
