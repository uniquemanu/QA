package mypackage;
//Parent class
class Tree
{
      public void move()
      {
             System.out.println("Tree");
      }
}



//child class
package mypackage;

public class Plant extends Tree

{
     public void move()
      {
            System.out.println("Plant");
      }
}

//main class

package mypackage;

public class Branch {
	public static void main(String args[])
    {
            Tree aObj1 = new Tree(); 
            Plant dObj = new Plant();
            Tree aObj2 = new Plant(); 
           
            aObj1.move();
            dObj.move();

            aObj2.move(); // Dynamic method dispatch
     }
}