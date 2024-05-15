public class CalculadoraProfessor {
    public static void main (String[]args){
       
        // Definindo a constante PI
        final double PI = 3.14;

        //Criando um objeto Scanner para receber a entrada do usuario
        Scanner scanner = new
        Scanner (System.in);

        //Solicitando o valor do raio ao usuario

        System.out.print ("Digite o valor de raio");

        double raio = scanner.nexDouble();

        // Calculando a área do círculo  double area = PI * Math.pow (raio,2);

        // Imprimindo o resultado 
        System.out.printf("A área do circulo com raio %.2f é: %.2f\n",raio,area);

        // Fechando o scanner
        scanner.close();
         

    


    
    

