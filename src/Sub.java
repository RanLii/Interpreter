public class Sub extends Instruction{
    public Sub(String label, String ins, int r, int s1, int s2){
        this.label = label;
        this.ins = ins;
        this.r = r;
        this.s1 = s1;
        this.s2 = s2;
    }
    
    public boolean execute(){
        reg.setRegister(r, reg.getValue(s1) - reg.getValue(s2));
        //System.out.println("****************sub*****" + reg.getValue(r));
        
        return false;
    }
}