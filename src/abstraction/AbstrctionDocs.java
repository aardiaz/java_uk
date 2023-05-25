package abstraction;

public class AbstrctionDocs {
	
	/*
	 * ====================== Abstraction ===================
	 * # process of hiding implementation details in the program is known 
	 *   as abstraction.
	 *   
	 *  # To achieve abstraction :
	 *     a> Abstract class :
	 *     	  # class which contains abstract(unimplemented methods) and non-abstract(implemented) methods is called abstract class.
	 *               # Abstract method :
	 *                   -> method which does not have implementation details/body.
	 *                     e.g.
	 *                         abstract void sum(int a, int b);
	 *                         abstract int getData();
	 *                         
	 *        # we can't create object of abstract class.
	 *        # every abstract class must have at lest one child class and child class must
	 *          override abstract methods.
	 *          
	 *          syntax :
	 *          
	 *             abstract class class_name{
	 *             
	 *                  //abstract methods
	 *                  
	 *                     abstract void print();
	 *                  
	 *                  //non-abstract methods
	 *                    void sum(){
	 *                    
	 *                    }
	 *              
	 *              }
	 *     
	 *     b> Interface :  
	 *        # same as class which contains public abstract methods and public static final variables.  
	 *        # we cant create object of interface.
	 *        # every interface must have at least one implementation class and impl. class must override
	 *          abstract methods.
	 *          
	 *        # 100% abstraction.   
	 *        
	 *        syntax :
	 *        
	 *        interface  interface_name{
	 *        
	 *                //public static final variables // constants
	 *               //public abstract methods
	 *        
	 *        }
	 */

}
