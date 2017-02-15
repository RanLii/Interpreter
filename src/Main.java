
import java.io.*;
import java.util.Scanner;
public class Main{
    static String tok;
        
    public static void main(String[] args){
        Instruction[] prog = new Instruction[30];
        
        
        File file = new File("data.txt");
        try{
            Scanner scanner = new Scanner(file);
            for(int i = 0; scanner.hasNextLine(); i++){
                tok = scanner.nextLine();
                System.out.println(tok);
                prog[i] = setInstruction();
                //prog[i].execute();
            }
            //prog[0].execute();
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        //loop for bnz
        for(int i = 0; prog[i] != null; i++){
            boolean flag = false;
            flag = prog[i].execute();
            if(flag==true)
                for(int j = 0; prog[j] != null; j++)
                    if(prog[j].label.equals(prog[i].tLabel)){
                        i = j - 1;//--------------!!!
                        break;
                    }
                        
        }
    
    }
   
    
    public static Instruction setInstruction(){
        String label;
        String ins;
        String tLabel;
        int r;
        int s1;
        int s2;
        
        label = getString();
        
        //System.out.println("label=" + label);//t
        //System.out.println("tok="+tok);//t
        
        
        ins = getString();
        
        //System.out.println("ins="+ins);//t
        //System.out.println("tok="+tok);//t
        
        
        if(ins.equals("sto")){
            r = getInt();
            
            //System.out.println("r="+r);//t
            //System.out.println("tok="+tok);//t
            
            s1 = getInt();
            
            //System.out.println("s1="+s1);//t
            //System.out.println("tok="+tok);//t
            
            return new Sto(label, ins, r, s1);
        }
        if(ins.equals("mul")){
            r = getInt();
            
            //System.out.println("r="+r);//t
            //System.out.println("tok="+tok);//t
            
            s1 = getInt();
            
            //System.out.println("s1="+s1);//t
            //System.out.println("tok="+tok);//t
            
            s2 = getInt();
            
            //System.out.println("s2="+s2);//t
            //System.out.println("tok="+tok);//t
            
            return new Mul(label, ins, r, s1, s2);
        }
        if(ins.equals("sub")){
            r = getInt();
            
            //System.out.println("r="+r);//t
            //System.out.println("tok="+tok);//t
            
            s1 = getInt();
            
            //System.out.println("s1="+s1);//t
            //System.out.println("tok="+tok);//t
            
            s2 = getInt();
            
            //System.out.println("s2="+s2);//t
            //System.out.println("tok="+tok);//t
            
            return new Sub(label, ins, r, s1, s2);
        }
        if(ins.equals("bnz")){
            s1 = getInt();
            
            //System.out.println("s1="+s1);//t
            //System.out.println("tok="+tok);//t
            
            tLabel = getString();
            
            //System.out.println("tLabel=" + tLabel);//t
            //System.out.println("tok="+tok);//t
            
            
            //-------------------how bnz------------------------------------------------------------------------------!!!!
            return new Bnz(label, ins, s1, tLabel);
        }
        if(ins.equals("out")){
            s1 = getInt();
            
            //System.out.println("s1="+s1);//t
            //System.out.println("tok="+tok);//t
            
            return new Out(label, ins, s1);
        }
        return null;//----------------------------t
    }
    
    public static String getString(){
        //---------may add trim() here
        String sub;
        int i = 0;
        for(; i < tok.length() && tok.charAt(i) != ' ' && tok.charAt(i) != '\t'; i++){
        }
        sub = tok.substring(0, i);        
        tok = tok.substring(i);
        
        tok = tok.trim();
        return sub;
    }
    
    public static int getInt(){
        String gInt = getString();
        int sub = 0;
        sub = Integer.parseInt(gInt);
        
        return sub;
    }

}

