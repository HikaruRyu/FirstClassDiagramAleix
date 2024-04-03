package UML;

public class Alumnes extends Curs {	

	// Attributes
	   private int id;
	   private String name;

	   // Constructor
		public Alumnes(int numero, String classes, int id, String name) {
		   super(numero, classes);
		   this.id = id;
		   this.name = name;
	   }
	   
	   
	   public int comptar() {
		   int total=0;
		   for (int i=0; i<id; i++) {
		        total = i;
		   }
		return total;
	   }


}
