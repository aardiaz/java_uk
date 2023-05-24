package objectwithmethod;

public class Test {
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		Student std[] = t.getStudentData();
		
		 t.printStudent(std);
	}
	
	//================== object as parameter ===================
	
	 void printStudent(Student stdArray[]) {
		 for(Student s : stdArray) {
		 System.out.println("Id = "+s.getId());
		 System.out.println("FName = "+s.getFname());
		 System.out.println("LName = "+s.getLname());
		 System.out.println("College = "+s.getCollege());
		 System.out.println("Age = "+s.getAge());
		 System.out.println("==============");
		 }
	 }
	 
	 //================== object as return type ================
       Student[] getStudentData() {
    	   
    	   Student studentArray[] = new Student[20];
    	
    	   for(int i=0; i<20; i++) {
    	   Student std1 = new Student(8899, "Hari", "KC", 22, "KEC");
    	   studentArray[i] = std1;
    	   }
    	   
    	   
    	   
//    	   Student std1 = new Student(8899, "Hari", "KC", 22, "KEC");
//    	   Student std2 = new Student(4654, "aa", "KC", 22, "KEC");
//    	   Student std3 = new Student(456, "ff", "KC", 22, "KEC");
//    	   Student std4 = new Student(24324, "Hddari", "KC", 22, "KEC");
//    	   Student std5 = new Student(34543, "dfdff", "KC", 22, "KEC");
//    	   
//    	   Student studentArray[] = new Student[5];
//    	   studentArray[0] = std1;
//    	   studentArray[1] = std2;
//    	   studentArray[2] = std3;
//    	   studentArray[3] = std4;
//    	   studentArray[4] = std5;
    	   
    	   return studentArray;
       }
}







