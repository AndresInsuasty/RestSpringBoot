public class operaciones{
	public static void main(String[] args) {
		int a=20;
		int b=13;
		int variable=1;

		if (variable==1) {
			int suma=a+b;
			System.out.println("La suma es: "+suma);
			
		}
		else if(variable==2){
			int resta=a-b;
			System.out.println("La resta es: "+resta);			
		}
		else if (variable==3) {
			int multiplicacion=a*b;
			System.out.println("La multiplicacion es:" + multiplicacion);	
		}
		else if(variable=4){
			int division=a/b;
			System.out.println("La division es: "+ division);
		}
		else{
			System.out.println("La opcion no es valida");
		}

	}
}