/*
 Suma de filas y de columnas de una matriz.
 */
package sumadefilasycolumnasdeunamatriz;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class SumadeFilasyColumnasdeunamatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

int matriz[][]= new int[50][50];
int i,j,sumfila=0,sumcolumna=0,fila,columna;
int numaleatorio;


for(i=0;i<5;i++){
for(j=0;j<5;j++){
matriz[i][j]=numaleatorio=(int)Math.floor(Math.random()*(9-1+1)+1);
}
}
System.out.println("La matriz ingresada es ");
for(i=0;i<5;i++){
for(j=0;j<5;j++){
System.out.print("["+matriz[i][j]+"]");
}
System.out.println();
}

System.out.println("Que fila desea sumar: ");
fila=lector.nextInt();
for(i=0;i<5;i++){
sumfila=sumfila+matriz[fila-1][i];
}
System.out.println("La suma de la fila "+fila+" es = "+sumfila);

System.out.println("\nQue columna desea sumar: ");
columna=lector.nextInt();
for(i=0;i<5;i++){
sumcolumna=sumcolumna+matriz[i][columna-1];
}
System.out.println("La suma de la columna "+columna+" es = "+sumcolumna);
}
}
