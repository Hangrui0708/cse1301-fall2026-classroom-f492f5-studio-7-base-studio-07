public class Die{
     private int sides;

     public Die(int n){
        sides=n;
     }
    
     public int thrown(){
        return (int)(Math.random()*sides)+1;
     }
  
   


public static void main(String[] args){
   Die x = new Die(5);
   System.out.println(x.thrown());

}

}


