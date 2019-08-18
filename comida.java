import java.util.Scanner;

/**
 * Programa para hallar precio de comida seleccionada
 * 
 * @author Carlos Alvarez 
 * @version 20190817
 */
public class comida
{
    public static void main(String[] args)
    {
        double sv=10000, ens=25000, jug=5000; 
        double bc=30000, bp=28000;
        double pc=5000, hb=7000;
        int tc, tveg, tnoveg, trap, cp;
        double iva=0.19, subt, imp, tot, desc, net;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Hola, ¿que deseas comer?");
        System.out.println("Selecciona 1 para comida vegetarianas, 2 para comidas no vegetarianas y 3 para comidas rápidas");
        tc = Teclado.nextInt();
        
        if (tc == 1) {
            System.out.println("Usted ha seleccionado comida vegetariana");
            System.out.println("Selecciona 1 para sopas de vegetales, 2 para ensaladas y 3 para jugos");
            tveg = Teclado.nextInt();
            desc = 0.80;
            if (tveg == 1) {
               System.out.println("Usted ha seleccionado sopas de vegetales");
               System.out.println("Cuantos platos desea comer");
               cp = Teclado.nextInt();
               subt = cp*sv;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 20% = " + tot*0.20 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
            } else if (tveg == 2) {
               System.out.println("Usted ha seleccionado ensaladas");
               System.out.println("Cuantos platos desea comer");
               cp = Teclado.nextInt();
               subt = cp*ens;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 20% = " + tot*0.20 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
            } else if (tveg == 3) {
               System.out.println("Usted ha seleccionado jugos");
               System.out.println("Cuantos jugos desea tomar");
               cp = Teclado.nextInt();
               subt = cp*jug;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 20% = " + tot*0.20 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
            } else {
               System.out.println("No tenemos ese plato");
            }
        } 
        
        if (tc == 2) {
            System.out.println("Usted ha seleccionado comida no vegetariana");
            System.out.println("Selecciona 1 para bandeja de carne y 2 para bandeja de pollo");
            tnoveg = Teclado.nextInt();
            desc = 0.90;
            if (tnoveg == 1) {
               System.out.println("Usted ha seleccionado bandeja de carne");
               System.out.println("Cuantos platos desea comer");
               cp = Teclado.nextInt();
               subt = cp*bc;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 10% = " + tot*0.10 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
            } else if (tnoveg == 2) {
               System.out.println("Usted ha seleccionado bandeja de pollo");
               System.out.println("Cuantos platos desea comer");
               cp = Teclado.nextInt();
               subt = cp*bp;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 10% = " + tot*0.10 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
            } else {
               System.out.println("No tenemos ese plato");
            }
        } 
        
        if (tc == 3) {
            System.out.println("Usted ha seleccionado comida rápidas");
            System.out.println("Selecciona 1 para  perros calientes y 2 para hamburguesas");
            trap = Teclado.nextInt();
            desc = 1;
            if (trap == 1) {
               System.out.println("Usted ha seleccionado perros calientes");
               System.out.println("Cuantos platos desea comer");
               cp = Teclado.nextInt();
               subt = cp*pc;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 0% = " + tot*1 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
               System.out.println("No tienes descuento, comete una ensalada");
            } else if (trap == 2) {
               System.out.println("Usted ha seleccionado bandeja de pollo");
               System.out.println("Cuantos platos desea comer");
               cp = Teclado.nextInt();
               subt = cp*hb;
               imp = subt*iva;
               tot = subt+imp;
               net = tot*desc;
               
               System.out.println("Su cuenta es:");
               System.out.println("Subtotal = " + subt + " CoP");
               System.out.println("Iva (19%) = " + imp + " CoP");
               System.out.println("Precio total = " + tot + " CoP");
               System.out.println("Su descuento es 0% = " + tot*1 + " CoP");
               System.out.println("El valor neto a pagar es = " + net + " CoP");
               System.out.println("No tienes descuento, comete una ensalada");
            } else {
               System.out.println("No tenemos ese plato");
            }
        }               
    }
}
