/* Código inteiramente feito sem chatgpt, mas foi necessário pesquisar como utilizar as variável em string, como finalizava o código (While True ja havia aprendido em python, e é da mesma forma.)
 * Deixarei o código orientando como foi feito.
 * Equipe: Cristian, Luís Carlos, Erick Barreto, João Paulo, Evellyn, Marcos Paulo de Athaydes
 */

import java.util.Scanner; // Importar scanner para o usuário inserir valores.

public class Banco {
    public static void main(String[] args) {
        String usuario;
        int senha, tentativas, novamente;
        tentativas = 2;

        Scanner ler = new Scanner(System.in);
        // Inicialmente apenas criando o login, dando um máximo de 3 tentativas e criando mais um para caso queire tentar novamente..
        while (true){    
                System.out.println("\nDigite o usuário");
                usuario = ler.next(); // Pesquisado para saber como utilizar scanner em string

                System.out.println("\nDigite a senha");
                senha = ler.nextInt();

                if(tentativas <= 0){
                    System.out.println("Acabou as tentativas, encerrando...");
                    System.exit(0);
                } // Observei que, caso ele fique depois da verificação do login, precisaria colocar uma resposta novamente, dessa forma ele acabaria assim que acabasse as tentativas.

                if("admin".equals(usuario) && senha == 1234){ // Pesquisado para saber como utilizar variável string em if
                    System.out.println("Acesso Liberado\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;

                } else{
                    System.out.println("Acesso Negado");
                    System.out.println("\nGostaria de tentar novamente? possui mais "+tentativas+" tentativas.\nDigite 1 para tentar novamente, 2 para cancelar");
                    novamente = ler.nextInt();

                    if(novamente == 1 && tentativas >= 1){
                        tentativas -= 1;

                    } else if(novamente == 2){
                        System.out.println("Encerrando...");
                        tentativas = 0;
                        System.exit(0);

                    } else{
                        System.out.println("Erro, encerrando.");
                        System.exit(0);
                    } // Loop para que possa tentar realizar o login novamente.
                }
                
            }

        float saldo = 1000.00f; // Valor inicial de R$1000.00

        // If fazendo com que caso o usuario e senha esteja correto, ele libere e continue o código, se não, ele nega e para de rodar
        while (true){
            float  menu, saque, deposito, transferencia;

            System.out.println("\nConsultar Saldo 1\nRealizar Saque 2\nRealizar Depósito 3\nRealizar Transferência 4\nSair 5");
            menu = ler.nextFloat();

            if(menu == 1){
                System.out.println("\n\n\n\n\n\n\nSaldo atual: R$"+ saldo);

                // 1. Função: Visualizar Saldo

            } else if(menu == 2){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\nInsira o valor para o saque, sendo menor do que o que possui na conta\nSaldo atual: R$"+ saldo);
                saque = ler.nextFloat();
                if(saldo >= saque){
                    saldo -= saque;
                    System.out.println("\nSaque realizado com sucesso\nsaldo atual: R$"+saldo);
                } else{
                    System.out.println("\n\n\n\n\n\n\nErro, saque maior do que saldo atual");
                }

                // 2. Função: Realizar Saque

            } else if(menu == 3){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nInsira o valor do deposito");
                deposito = ler.nextFloat();
                if(deposito > 0){
                    saldo+=deposito;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nO deposito foi realizado com sucesso\nsaldo atual: R$"+saldo);
                } else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nErro, valor invalido");
                }

                // 3. Função: Realizar Deposito

            } else if(menu == 4){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nInsira o valor da transferência");
                transferencia = ler.nextFloat();
                if(saldo >= transferencia){
                    saldo -= transferencia;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nTransferência realizado com sucesso no valor de: R$"+transferencia+"\nSaldo atual: R$"+saldo);
                }

                // 4. Função: Realizar Transferência
                
            } else if(menu == 5){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nSaindo...");
                break;
            }
        }

        // 5. Função: Sair.

    }
}
