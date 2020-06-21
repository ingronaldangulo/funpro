public class Casa {

    // Declaracion de variables
    long cantidad;
    short edad;
    double monto;


    // Inicialización de variables
    String apellidoPaterno = "Angulo";
    double pago = 2;

    public void primerCuarto(){
        cantidad = 100;
        System.out.println("cerrando puerta");
        System.out.println("Apellido paterno: " + apellidoPaterno);
        System.out.println("Edad:" + edad);

    }

    public void segundoCuarto(){
        int edad = 20;
        System.out.println("Segundo cuarto");
        System.out.println("Edad:" + edad);
        System.out.println("Edad:" + this.edad);

    }

    public void tercerCuarto(){

        for(int x = 0; x < 10; x++){
            System.out.println("Valor x: " + x);
        }

    }

    public static void main(String[] args){

        Casa casa = new Casa();
        casa.primerCuarto();
        casa.segundoCuarto();
        casa.tercerCuarto();

    }





}
