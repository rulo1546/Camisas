package CostoCamisas;

import java.util.Scanner;

public class Camisa {
private double precio;
private double descuento;
private double precioTotal;
private int numCamisas;

    Scanner sc=new Scanner(System.in);
    public Camisa(double precio, double descuento, double precioTotal, int numCamisas) {
        this.precio = precio;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
        this.numCamisas = numCamisas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getNumCamisas() {
        return numCamisas;
    }

    public void setNumCamisas(int numCamisas) {
        this.numCamisas = numCamisas;
    }

    public void agregarCamisa(){

        int idCamisa=sc.nextInt();
        numCamisas++;
        if(idCamisa==1){
            this.precio+=190;
        }else if(idCamisa==2){
            this.precio+=230;
        }else if(idCamisa==3){
            this.precio+=310;
        }
    }
    public void generaDescuento(){
        if(numCamisas>=1&&numCamisas<=2){
            descuento=0;
        }else if(numCamisas>=3&&numCamisas<=5){
            descuento=precio*0.05;
        }else if(numCamisas>5){
            descuento=precio*0.08;
        }
    }
    public void generaPrecioTotal(){
        precioTotal=precio-descuento;
    }
}
