package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

public class EjercicioNueve {

    public static void main(String[] args) {

        /*Crear un programa que calcule el precio total de la venta,
        teniendo en cuenta los recargos y descuentos.*/

        int a1 = 50;
        int a2 = 32;
        int a3 = 18;
        int a4 = 125;
        int a5 = 230;
        int a6 = 48;
        int a7 = 44;
        int a8 = 20;
        int a9 = 12;
        int a10 = 140;

        double totalTarjeta =  (a1 + a4 + a5 + a6 + a10) ;
        System.out.println("El total de tarjeta es: " + totalTarjeta);
        double recargoTarjeta =  totalTarjeta * 0.1;
        double totalRecargoTarjeta =  recargoTarjeta + totalTarjeta;
        System.out.println("El recargo de tarjeta es: " + recargoTarjeta + ". Su nuevo saldo es: " + totalRecargoTarjeta);

        double totalContado =  (a2 + a3 + a7 + a8 + a9) ;
        System.out.println("El total de contado es: " + totalContado);
        double descuentoContado =  totalContado * 0.05;
        double totalDescuentoContado =  totalContado - descuentoContado;
        System.out.println("El descuento por la compra al contado es: " + descuentoContado + ". Su nuevo saldo es: " + totalDescuentoContado);



    }
}
