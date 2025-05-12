import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] vetorH = new String[5];
        String [] vetorM = new String[5];
        System.out.println("Perguntas:\r\n"+ //
                        "Gosta de música sertaneja?\r\n" + //
                        "Gosta de futebol?\r\n" + //
                        "Gosta de seriados?\r\n" + //
                        "Gosta de redes sociais?\r\n" + //
                        "Gosta da Oktoberfest?");

        for(int i = 0; i < vetorH.length; i++){
            System.out.println("Digite a resposta da questão "+ i);
            vetorH[i] = input.next();
        }

        for(int i = 0; i < vetorM.length; i++){
            System.out.println("Digite a resposta da questão "+ i);
            vetorM[i] = input.next();
        }
        input.close();
        int indice = 0;
        for(int i = 0; i < 5;i++){
            if(vetorH[i].equals(vetorM[i])){
                indice+=3;
            } else if( vetorH[i].equals("IND") && (vetorM[i].equals("SIM") || vetorM[i].equals("NÃO"))){
                indice++;
            }
            else if( vetorM[i].equals("IND") && (vetorH[i].equals("SIM") || vetorH[i].equals("NÃO"))){
                indice++;
            } else{
                indice-=2;
            }
        }
        if(indice == 15){
            System.out.println("Casem!");
        } else if( indice >=10 && indice <=14){
            System.out.println("Vocês têm muita coisa em comum!");
        } else if( indice >=5 && indice <=9){
            System.out.println("Talvez não dê certo :(");
        } else if( indice >=0 && indice <=4){
            System.out.println("Vale um encontro");
        } else if( indice >=-1 && indice <=-9){
            System.out.println("Melhor não perder tempo");
        } else{
            System.out.println("Vocês se odeiam!");
        }
    }
}