
public class Register {
    private int[] register = new int[32];
    
    public void setRegister(int r, int value){
        register[r] = value;
    }
    
    public int getValue(int r){
        return register[r];
    }
}
