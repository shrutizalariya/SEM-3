import java.util.*;

public class ABPattern {
    public static void main(String[] args) {
        System.out.println("Enter the input string:");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        Stack s = new Stack(in.length());
        // int n = in.length();
        int i =0;
        if(in.length()%2==1){
            System.out.println("Invalid");
        }
   
       else{
             while (i<in.length()) {
                 s.push(in.charAt(i)); 
                 System.out.println(in.charAt(i)+"is filled");
                 i++;
             }
             
            }
        i=0;    
        int counta =0;
        int countb=0;
        while (i<in.length()/2){
            char ch = s.pop();
            if(ch=='b'){
                countb++;
                
            }else{
                break;
            }
            i++;
        }
        System.out.println(countb);
      if(countb==in.length()/2){
            for(i=0;i<in.length()/2;i++){
                char c = s.pop();
                if(c=='a'){
                    counta++;
                }else{
                    break;
                }
            }
            System.out.println(counta);
        }
        if(counta>0 && countb>0 && counta==countb){
            System.out.println("Valid");
        }
        else{
            System.out.println("invalid");
        }

     }
    
 }

class Stack{
    int n;
    int TOP;
    char s[];

    public Stack(int n){
        this.n = n;
        TOP=-1;
        s = new char[n];
    }
        
        public void push(char x){
            if(TOP>=n){
                System.out.println("Stack overflow");
            }else{
                TOP++;
                s[TOP]=x;
            }
        }
        public char pop(){
            if(TOP<=-1){
                System.out.println("Stack underflow");
                return(0);
            
            }else{
                TOP--;
                return  (s[TOP+1]);
            }
         }
         public boolean isEmpty() {
            return (TOP == -1);
        }
        }