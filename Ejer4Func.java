import java.util.Scanner;

public class Ejer4Func {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// calcula el factorial entre los n numeros que hay entre 2 variables digitadas
		int n1,n2,respuesta;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		n1=sc.nextInt();
		System.out.println("Ingrese el segundo");
		n2=sc.nextInt();
		respuesta=factorial(n1,n2);     //invoco funcion
		System.out.println("El factorial de los numeros entre "+n1+" y "+n2+" es "+respuesta);

	}
	static int factorial (int x, int y){
		int res,aux2,min;
		if (x>y){    //si x es mayor
			res=(x-y);  //se saca la diferencia
			min=y;       //y el minimo
		}else{     //si y es mayor se hace lo mismo pero con y en vez de x
			res=(y-x);   
			min=x;        
		}
		aux2=min+1;      //aux2 es el numero que sigue al minimo ej si min es 2 aux2 sera 3
		for(int i =2;i<res;i++){    //se va multiplicando desde el numero siguiente al min hasta el anterior al maximo
			aux2=aux2*(min+i);        
		}return aux2;
	}

}
