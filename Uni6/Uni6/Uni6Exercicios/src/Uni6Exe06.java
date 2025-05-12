import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamVetor = input.nextInt();

        double[] vetor = new double[tamVetor];

        for(int i = 0;i < vetor.length; i++){
            System.out.println("Digite um valor real para preencher a posição " + i + " do vetor");
            vetor[i] = input.nextDouble();
        }
        System.out.println("DIgite outro valor:");
        double numero = input.nextDouble();

        input.close();

        boolean contem = false;

        for(int i = 0; i < vetor.length; i++){
            if(numero == vetor[i]){
                contem = true;
            }
        }
        if(contem){
            System.out.println("Esse numero está dentro do vetor");
        } else{
            System.out.println("Valor não está dentro do vetor");
        }
    }
}