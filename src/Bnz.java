
public class Bnz extends Instruction{
    
    public Bnz(String label, String ins, int s1, String tLabel){
        this.label = label;
        this.s1 = s1;
        this.tLabel = tLabel;
    }
    
    public boolean execute(){
        if(reg.getValue(s1) != 0)
            //assign to tLabel
            return true;
        //System.out.println("****************bnz*f****" + reg.getValue(s1));
        return false;
    }
}