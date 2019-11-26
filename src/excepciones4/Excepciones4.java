package excepciones4;

public class Excepciones4 {

        public static void main(String[] args) {
            int nums[]=new int[4];
            try {
                lanzarUnaExcepcion();
                
            }catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Índice fuera de los límites");
            }
            System.out.println("Despuès de que se genere la excepción.");
        
    }
        public static void lanzarUnaExcepcion(){
            int nums[]=new int[4];
            System.out.println("Antes de que se genere una excepción,");
            nums[7]=10;
            System.out.println("Esto no se mostrará");
        }
    
}
