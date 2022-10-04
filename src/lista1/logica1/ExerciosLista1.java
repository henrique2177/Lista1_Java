package lista1.logica1;

import java.util.Scanner;

public class ExerciosLista1 {

	public static void main(String[] args) {
		
		int opcao = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(opcao != 20) {
		System.out.println("============================== Escolha um exercicio de 1 a 26 =========================================");
		System.out.println("=================================== Digite -1 para sair ==============================================");
		opcao = sc.nextInt();
		if(opcao ==-1) {
			System.out.println("Obrigado volte sempre!");
			break;
		}
		
		switch(opcao) {
		case 1:
			System.out.println("É PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER.");
			break;
		case 2:
			System.out.println("Henrique da Silva");
			break;
		case 3:
			int num1 = 43;
			int num2 = 28;
			int produto = 0;
			
			produto = num1 * num2;
			
			System.out.println("O produto de 43x28: " +produto);
			break;
		case 4:
			int nume1 = 8;
			int nume2 = 7;
			int nume3 = 9;
			double media = 0;
			
			media = (nume1 + nume2 + nume3) /3;
			
			System.out.println("A média dos números 9,8 e 7 é: " +media);
			break;
		case 5:
			System.out.println("Digite um número inteiro:");
			int inteiro = sc.nextInt();
			System.out.println("Vc digitou: " +inteiro);
			break;
		case 6:
			System.out.println("Digite dois números inteiros:");
			int inteiro1 = sc.nextInt();
			int inteiro2 = sc.nextInt();
			System.out.println("Vc digitou: " +inteiro1 + " e "  +inteiro2);
			break;
		case 7:
			System.out.println("Digite um número inteirio");
			int numero = sc.nextInt();
			
			System.out.println("O sucessor de: " +numero + " é " + ++numero);
			System.out.println("O antecessor de: " +--numero + " é " + --numero);
			break;	
		case 8:
			String nome;
			String endereco;
			int telefone;
			
			System.out.println("Digite seu nome: " );
			nome = sc.next();
			System.out.println("Digite o endereço: ");
			endereco = sc.next();
			sc.nextLine();
			System.out.println("Digite seu telefone: ");
			telefone = sc.nextInt();
			
			System.out.println("Seu nome é: " +nome+ " Endereço: " +endereco+ " e telefone: " +telefone);
			break;
		case 9:
			int nu1;
			int nu2;
			int soma;
			
			System.out.println("Digite o primerio número: ");
			nu1 = sc.nextInt();
			
			System.out.println("Digite o segundo número: ");
			nu2 = sc.nextInt();
			
			soma = nu1 + nu2;
			
			System.out.println("Soma: " +soma);
			break;
		case 10:
			int digito1;
			int digito2;
			int produ;
			
			System.out.println("Digite o primerio número: ");
			digito1 = sc.nextInt();
			
			System.out.println("Digite o segundo número: ");
			digito2 = sc.nextInt();
			
			produ = digito1 + digito2;
			
			System.out.println(" O produto é: " +produ);
			break;
		case 11:
			double terco;
			
			System.out.println(" Digite um número real: ");
			 double real = sc.nextDouble();
			 
			 terco = real/3;
			 
			 System.out.printf("O terço desse valor é:  %.2f %n " ,terco);
				break;
		case 12:
			double nota1;
			double nota2;
			double med;
			
			System.out.println("Digite o primerio número: ");
			nota1 = sc.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			nota2 = sc.nextDouble();
			
			med = (nota1 + nota2)/2;
			
			System.out.println("A média é : " +med);
			break;
		case 13:
			
			int me;
			
			System.out.println("Digite o 1 número : ");
			int n1 = sc.nextInt();
			System.out.println("Digite o 2 número : ");
			int n2 = sc.nextInt();
			System.out.println("Digite o 3 número : ");
			int n3 = sc.nextInt();
			System.out.println("Digite o 4 número : ");
			int n4 = sc.nextInt();
			
			me = (n1*1 + n2*2 + n3*3 + n4*4) /4;
			System.out.println("A média poderada desses números são : " +me);
			break;
		case 14:
			double saldo;
			int reajuste = 0;
			
			System.out.println("Digite seu saldo: ");
			saldo = sc.nextDouble();
			
		
			saldo = (saldo +reajuste*1/100);
			
			System.out.println("Saldo com reajuste: " +saldo);
			break;
		case 15:
			break;
		case 16:
			String name;
			
			System.out.println("Digite um nome");
			name = sc.next();
			
			System.out.println("a primeira letra de: " +name + " é :"+ name.charAt(0));
			//name.substring(name.length()-1);
			System.out.println("a ultima letra de: " +name + " é :"+ name.substring(name.length()-1));
									
			System.out.println("Primeiro ao terceiro caractere de : " +name + " são :"+ name.substring(0,3));
			
			System.out.println("as 3 ultimas letras de: " +name + " são :"+ name.substring(name.length()-3));
			
			System.out.println("Quarta letra de: " +name + " é :"+ name.charAt(3));
			
			System.out.println("Todos os caracteres menos o primeiro de : " +name + " é :"+ name.substring(1,8));
		
			System.out.println("as duas ultimas letras de: " +name + " são :"+ name.substring(name.length()-2));
			
		case 17:
			int base;
			float altura;
			float area;
			float perimetro;
			float diagonal;
			
			System.out.println("Entre com a base do triangulo");
			base = sc.nextInt();
			
			System.out.println("Entre com a altura do triangulo");
			altura = sc.nextFloat();
			
			area = (base*altura);
			perimetro = base + altura;
			diagonal = (base*altura)/2;
			
			System.out.println("A área do triangulo é: " +area);
			System.out.println("O perimetro do triangulo é: " +perimetro);
			System.out.println("A diagonal do triangulo é: " +diagonal);
			
		case 18:
			double raio;
			double PI = 3.1416;
			double aarea;
			
			
			System.out.println("Digite o raio do circulo");
			raio = sc.nextDouble();
			
			aarea = PI *(raio*raio);
			
			System.out.println("O valor da area do circulo é " + aarea); 
			
		case 19:
			double lado;
			double a;
			double p;
			double d;
			
			System.out.println("Digite o lado do quadrado");
			lado=sc.nextDouble();
			
			a= lado*lado;
			p=lado*4;
			
			System.out.println("O lado do quadrado e: " +a);
			System.out.println("O perimetro do quadrado e: " +p);
			
		case 20:
			double aa;
			double b;
			double c;
			double diag;
			
			System.out.println("Entre com lado A,B,C: " );
			aa=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			
			diag = aa*2+b*2+c*2;
			
			System.out.println("Diagonal do paralelepipedo é : " +diag);
			
		case 21:
			int ba;
			float alt;
			float are;
			
			
			System.out.println("Entre com a base do triangulo");
			ba = sc.nextInt();
			
			System.out.println("Entre com a altura do triangulo");
			alt = sc.nextFloat();
			
			are = (ba*alt);
						
			System.out.println("A área do triangulo é: " +are);
			
		case 22:
			int diagonalMaior, diagonalMenor;
			double areea;
			
			System.out.println ("Insira o tamanho da diagonal Maior");
			diagonalMaior=sc.nextInt();
			
			System.out.println("Insira o tamanho da diagonal Menor");
			diagonalMenor=sc.nextInt();
			
			areea = (diagonalMaior * diagonalMenor) / 2;

			System.out.println("A área é: " + areea );
			
		case 23:
			
			String n;
			int i;
			
			System.out.println("Digite seu nome");
			n = sc.next();
			
			System.out.println("Digite sua idade");
			i = sc.nextInt();
			
			System.out.println("Seu nome é: " +n+ " idade: " +i);
			
		case 26:
			double valor;
			double taxa;
			double tempo;
			
			System.out.println("Digite o valor da parcela em atraso");
			valor=sc.nextDouble();
			
			System.out.println("Valor da taxa");
			taxa=sc.nextDouble();
			
			System.out.println("Tempo de atraso");
			tempo=sc.nextDouble();
			
			valor += (valor*(taxa/100)*tempo);
			
			System.out.println("O valor da prestação com atraso ficou: " +valor);
		}
		sc.close();

		}
		
	}
}

