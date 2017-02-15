
public class Sto extends Instruction{
    public Sto(String label, String ins, int r, int s1){
        this.label = label;
        this.ins = ins;
        this.r = r;
        this.s1 = s1;
    }
    
    public boolean execute(){
        reg.setRegister(r, s1);
        //System.out.println("****************sto*****" + reg.getValue(r));
        
        return false;
    }
}
