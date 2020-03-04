package CostoCamisas; 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        Camisa c1=new Camisa(0, 0, 0, 0);
        
        
        do{
            System.out.println("");
        System.out.println("Digite la opcion deseada");
            System.out.println("");
        System.out.println("1.- Agregar camisa");
        System.out.println("2.- Ver descuento");
        System.out.println("3.- Ver precio Total");
        System.out.println("4.- Salir.");
        
        opcion=sc.nextInt();
        switch (opcion){
            case 1:   
                System.out.println("");
                System.out.println("Digite la camisa a agregar:");
                System.out.println("1.- Camisa de manga corta $190");
                System.out.println("2.- Camisa Casual de manga larga $230");
                System.out.println("3.- Camisa formal de manga larga $310"); 
                c1.agregarCamisa();
                System.out.println("Camisa agregada con exito.");
                System.out.println("");
                break;
            case 2: c1.generaDescuento();
                System.out.println("El descuento es de: $" + c1.getDescuento() + " pesos");
                break;
            case 3: c1.generaPrecioTotal();
                System.out.println("El precio total es: $" + c1.getPrecioTotal() + " pesos.");
                break;
            default: System.out.println("salir.");
        }
        }while(opcion!=4);
        
        
    }
    
}
