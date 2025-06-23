import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu extends Maneger {
        
        static Scanner teclado = new Scanner(System.in);

        static void MenuPrincipal() throws IdInvalidoException {
            int opcao= 0;
            do{
            System.out.println("\t---------------------------------------------------------------------");
            System.out.println("\t---               1-Gestao De Proprietarioss                      ---");
            System.out.println("\t---               2-Gestao De Animais                             ---");
            System.out.println("\t---               3-Gestao De Visitas                             ---");
            System.out.println("\t---               4-Sair Do Sistema                               ---");
            System.out.println("\t---------------------------------------------------------------------");
            System.out.print("\tENTER:");
            try{
            opcao =teclado.nextInt();           
            switch (opcao) {
                case 1: 
                MenuGestaoDePropretarios();   
                break;
                case 2:
                MenuGestaoDeAnimais();
                break;
                case 3:
                MenuGestaoDeVisitas();
                break;
                case 4:
                System.out.println("\tSaindo Do Sistema...");
                break;
            
                default:
                    break;
            }
        }catch(InputMismatchException e) {
            System.err.println("\tTipo de entrada invalida,escolha uma opcao inteira de 1 a 4");
                
            }
        }while (opcao != 4) ;
        }

        static void MenuGestaoDePropretarios() throws IdInvalidoException{
            int opcao = 0;
            do{
            System.out.println("\t---------------------------------------------------------------------");
            System.out.println("\t---               1-Registrar proprietario                        ---");
            System.out.println("\t---               2-listar Proprietarios registados               ---");
            System.out.println("\t---               3-Listar Animais De Um Proprietario             ---");
            System.out.println("\t---               4-Voltar                                        ---");
            System.out.println("\t---------------------------------------------------------------------");
            System.out.print("\tENTER:");
            try{
            opcao =teclado.nextInt();           
            switch (opcao) {
                case 1:    
                registarProprietario();
                break;
                case 2:
                listarProprietarios();
                break;
                case 3:
                System.out.println("\tDigite o ID do proprietario");
                String id = teclado.next();
                listarAnimalPorProprietario(id);
                break;
                case 4:
                System.out.println("\tVoltando...");
                break;
            
                default:
                    break;
            }
        }catch(InputMismatchException e) {
            System.err.println("\tTipo de entrada invalida,escolha uma opcao inteira de 1 a 4");
                
            }
        }while (opcao != 4);
        }

        static void MenuGestaoDeAnimais() throws IdInvalidoException {
            int opcao = 0;
            do{
            System.out.println("\t---------------------------------------------------------------------");
            System.out.println("\t---               1-Registar Um Animal Por Proprietario           ---");
            System.out.println("\t---               2-Listar Animais Registados No Sistemas         ---");
            System.out.println("\t---               3-LISTAR ANIMAIS DE UM PROPRIETARIO             ---");
            System.out.println("\t---               4-VOLTAR                                        ---");
            System.out.println("\t---------------------------------------------------------------------");
            System.out.print("\tENTER:");
            try{
            opcao =teclado.nextInt();           
            switch (opcao) {
                case 1:    
                registarAnimal();
                break;
                case 2:
                listarAnimais();
                break;
                case 3:
                System.out.println("\tDIGITE O ID DO PROPRIETARIO");
                String id = teclado.next();
                listarAnimalPorProprietario(id);
                break;
                case 4:
                System.out.println("\tVOLTANDO...");
                break;
            
                default:
                    break;
            }
        }catch(InputMismatchException e) {
            System.err.println("\tTipo de entrada invalida,escolha uma opcao inteira de 1 a 4");
                
            } catch (InvalidDateException e) {
                       System.err.println("\tData invalida");
                    }
        }while (opcao != 4);
        }

        static void MenuGestaoDeVisitas(){
            int opcao=0;
            do{
            System.out.println("\t---------------------------------------------------------------------");
            System.out.println("\t---               1-Registrar Visitas                             ---");
            System.out.println("\t---               2-LISTAR TODAS AS VISITAS                       ---");
            System.out.println("\t---               3-LISTAR AS VISITAS DO ANIMAL                   ---");
            System.out.println("\t---               4-QUANTAS VEZES O ANIMAL VISITOU PARA HIGENE    ---");
            System.out.println("\t---               5-VOLTAR                                        ---");
            System.out.println("\t---------------------------------------------------------------------");
            System.out.print("\tENTER:");
            try{
            opcao =teclado.nextInt();           
            switch (opcao) {
                case 1:   
                registrarVisita(); 
                break;
                case 2:
                listarTiposDeVisitas();
                break;
                case 3:
                System.out.println("Digite o ID do animal");
                String id = teclado.next();
                listarVisitasDoAnimal(id);
                break;
                case 4:
                System.out.println("\tDigite O ID Do Animal");
                String animal = teclado.next();
                quantidadeDeVisitasDeUmAnimalParaHigiene(animal);
                break;
                case 5:
                System.out.println("VOLTANDO...");
                break;
            
                default:
                    break;
            }
        }catch(InputMismatchException e) {
            System.err.println("\tTipo de entrada invalida,escolha uma opcao inteira de 1 a 4");
                
            }
        }while (opcao != 4);
        }

       
}
