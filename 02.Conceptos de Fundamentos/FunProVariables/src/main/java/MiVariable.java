public class MiVariable {

    long miNUmero = 20;
    Long miNUmeroObjeto;

    double horasAcumuladas;
    char nombre;
    String apellidos = "Angulo";

    Curso miCurso;


    public  static void main(String args[]){

        MiVariable instancia = new MiVariable();
        instancia.imprimir();
        instancia.calcularEdad();

    }



    public void imprimir(){

        int edad;
        System.out.println("Apellidos: " + apellidos);
    }

    public  void calcularEdad(){

        //int edadFinal = edad + 10;

        for (int i = 0; i < 10; i++){
            System.out.println("Correlativo: " + i);
        }

    }




}
