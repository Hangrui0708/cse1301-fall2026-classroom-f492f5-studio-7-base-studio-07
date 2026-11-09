public class rectangle{
   private int width;
   private int length;

   public rectangle(int x, int y){
     width=x;
     length=y;
   }
   
    
   
   public int getArea(){
     return width*length;
   }

  public int getPerimeter(){
      return 2*(width+length);
  }

  public boolean isSquare(){
    if(width!=length){
        return false;
    }

    return true;
  }

   public boolean isSmaller(rectangle other){
     return this.getArea()<other.getArea();
   }
  }
  

public void main(){
rectangle s = new rectangle(5, 5);

 System.out.println(s.getArea());

}
