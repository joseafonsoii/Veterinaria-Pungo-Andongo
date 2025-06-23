import java.util.*;
import java.io.*;


public class Maneger {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Animal> animais = new ArrayList<>();
    static ArrayList<Proprietario> proprietarios = new ArrayList<>();
    static ArrayList<Visita> listaVisitas = new ArrayList<>();
       
        static void registarProprietario() throws IdInvalidoException{
            System.out.print("\tDiga o nome do proprietario:");
            String nome = teclado.nextLine();           
            System.out.print("\tDigite o contacto do proprietario:");
            String contacto = teclado.nextLine();
            String id = String.format("d%03dao",proprietarios.size() + 1);
            if(proprietarios.size() == 999){
                throw new IdInvalidoException("Este ID e invalido");

            }
            Proprietario p = new Proprietario(nome,id,contacto);
            try(FileWriter  W = new FileWriter("Proprietarios.txt", true)){
                W.write("Nome: "+nome + "|"+ "ID:" + id + "|Contacto:"+ contacto + "|\n");
                System.out.println("\tInformacao adicionada ao arquivo");

            }catch(IOException e){
                System.out.println("\tFalha ao adicionar o proprietario ao arquivo");
            }
            proprietarios.add(p);
            System.out.println("\tProprietario adicionado com sucesso na lista do sistema!");

    }

    static void listarProprietarios(){
        for(Proprietario p : proprietarios){
            System.out.println("\tNome:"+p.getNomeP());
            System.out.println("\tID:"+p.getIDP());
            System.out.println("\tContacto:"+p.getContacto());
            System.out.println("\t______________________________________________________");
        }

    }

    static void registarAnimal() throws InvalidDateException, IdInvalidoException{
       
        
        System.out.println("\tDiga o nome do seu animal:");
        System.out.print("\tENTER:");
        String nome = teclado.next();
        System.out.println("\tDiga a sua raca");
        System.out.print("\tENTER:");
        String raca = teclado.next();
        System.out.println("\tDiga a especie do animal:");
        System.out.print("\tENTER:");
        String especie = teclado.next();
        System.out.println("\tDigite o dia em que ele/a nasceu(1-31):");
        System.out.print("\tENTER:");
        int dia= teclado.nextInt();
        System.out.println("\tDigite o mes em que ele/a nasceu(1-12):");
        System.out.print("\tENTER:");
        int mes= teclado.nextInt();
        System.out.println("\tDigite o ano em que ele/a nasceu(2020-2024):");
        System.out.print("\tENTER:");
        int ano= teclado.nextInt();
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 2020 || ano > 2024){
            throw new InvalidDateException("\tData De Nascimento Invalida");

        }
        System.out.println("\tDigite o ID do proprietario:");
        System.out.print("\tENTER:");
        String nomeP = teclado.next();   
        Proprietario p = buscarproPorId(nomeP);
                if(p == null){
                    System.out.println("\tEste proprietario nao esta registado no sistema");
                    return;
                }
                String ida = "cli"+animais.size() + 1 + "ao";
                if(animais.size() >= 999){
                    throw new IdInvalidoException("ID invalido");
                }
                Animal a = new Animal(nome,raca,especie,dia,mes,ano,p,ida);
                animais.add(a);
                System.out.println("\tAnimal registado com sucesso");
                try(FileWriter  W = new FileWriter("Animais.txt", true)){
                    W.write("Nome: "+nome + "|"+ "ID:" + ida + "Especie:"+ especie + "Raca:"+ "Proprietario" +p.getIDP()+ "Data de nascimento:"+a.getDataBirth()+"\n");
    
                }catch(IOException e){
                    System.out.println("\tFalha ao adicionar o animal ao arquivo");
                }
                
            
            }
        
            public static void listarAnimais(){
                for(Animal a: animais){
                 System.out.println("\tNome:"+a.getNome());
                 System.out.println("\tNome:"+a.getIDA());
                 System.out.println("\tRaca:"+a.getRaca());
                 System.out.println("\tEspecie:"+a.getEspecie());
                 System.out.println("\tData de nascimento:"+a.getDataBirth());
                 System.out.println("\tProprietario:"+a.getProprietario());
                 System.out.println("\t_________________________________________________________________");
        
                }
            }
        
            static String listarAnimalPorProprietario(String idP){
                Proprietario p = buscarproPorId(idP);
                if (p != null) {
                  for(Animal a : animais){
                    if(a.getProprietario().equals(a)){
                        System.out.println(a);
                    }
                  }  
                }else {
                    System.out.println("\tO proprietario "+ idP + "Nao esta registado ou nao tem nenhum animal emseu registro");
                }
                return null;
            }
        
            public static boolean verificarIdade(int dia, int mes,int ano){
                if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 2020 || ano > 2025){
                   return false;
                }
                return true;
               }
        
               private static Proprietario buscarproPorId(String idCliente) {
        for (Proprietario cliente :proprietarios) {
            if (cliente.getIDP().equals(idCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public static int quantidadeDeVisitasDeUmAnimalParaHigiene(String iddd){
        Animal a = buscarAnimalPorID(iddd);
        if(a != null){
            for(Visita v : listaVisitas){
                if (v.getAnimal().equals(a) && v instanceof Higiene) {
                    System.out.println("Quantidade de visitas para banho:"+v.getQtdVisitas());                                
                }
            }
        }else{
            System.out.println("Este animal nao foi registado");
        }
        return 0;
    }

    static Visita nomeEDataDaVacina(String id){
     Animal a = buscarAnimalPorID(id);
     if (a == null) {
        System.out.println("\t Este Animal Não Foi Registado");
        return null;       
     }else if(listaVisitas.size() == 0){
        System.out.print("\tNão ha nenhuma visita registada");
        return null;
     }
     for(Visita v: listaVisitas){
        if(v instanceof Vacina){
        if(v.getAnimal().equals(a)){
            System.out.println("\tNome da vacina:"+ ((Vacina) v).getNomeVacina());
            System.out.println("\tData que a vacina foi administrada da vacina:"+ v.getData());
        }
    }

     }
     return null;
    }
    

    public static void registrarVisita() {
        System.out.println("\tDigite o dia da visita:");
        System.out.print("\tENTER:");
        int dia=teclado.nextInt();
        System.out.println("\tDigite o mes da visita:");
        System.out.print("\tENTER:");
        int mes=teclado.nextInt();
        System.out.println("\tDigite o ano da visita:");
        System.out.print("\tENTER:");
        int ano=teclado.nextInt();
        System.out.println("\tDiga o tipo de visita que deseja fazer:");
        System.out.println("VACINA || CONSULTA || HIGIENE");
        System.out.print("\tENTER:");
        String tipo = teclado.next();
        switch (tipo.toLowerCase()) {
            case "vacina":
            System.out.println("\tDiga oo nome da vacina");
            String nomeVacina = teclado.next();
            System.out.println("\tDigite o ID do seu animal");
            String id1 = teclado.next();
            Animal animal1 = buscarAnimalPorID(id1);
            if(animal1 == null){
                System.out.println("\teste animal nao foi encontrado na nossa base de dados");
                return ;
            }
                listaVisitas.add(new Vacina(nomeVacina,dia,mes,ano,animal1));
                try(FileWriter  W = new FileWriter("Visitas.txt", true)){
                    W.write("Nome: "+animal1.getNome() + "|ID:" + animal1.getIDA() +"|Tipo De Visita:"+tipo+ "|Nome Da Vacina:"+ nomeVacina+"|Data:"+dia + "/"+mes+"/"+ano+"|"+"\n");
                    System.out.println("\tInformacao adicionada ao arquivo");
    
                }catch(IOException e){
                    System.out.println("\tFalha ao adicionar o proprietario ao arquivo");
                }
                
                break;

            case "consulta":
            System.out.println("\tDiga o motivo da consulta");
            String motivo = teclado.next();
            System.out.println("\tDigite o ID do seu animal");
            String id2= teclado.next();
            Animal animal2 = buscarAnimalPorID(id2);
            if(animal2 == null){
                System.out.println("\teste animal nao foi encontrado na nossa base de dados");
                return ;
            }
                listaVisitas.add(new Consulta(motivo,animal2,dia,mes,ano));
                try(FileWriter  W = new FileWriter("Visitas.txt", true)){
                    W.write("Nome: "+animal2.getNome() + "|ID:" + animal2.getIDA() +"|Tipo De Visita:"+tipo+ "|Motivo:"+ motivo+"Data:"+dia + "/"+mes+"/"+ano+"|" +"\n");
                    System.out.println("\tInformacao adicionada ao arquivo");
    
                }catch(IOException e){
                    System.out.println("\tFalha ao adicionar o proprietario ao arquivo");
                }
                break;

            case "higiene":
            System.out.println("\tDigite o ID do seu animal");
            String id3= teclado.next();
            Animal animal3 = buscarAnimalPorID(id3);
            if(animal3 == null){
                System.out.println("\teste animal nao foi encontrado na nossa base de dados");
                return ;
            }
                listaVisitas.add(new Higiene(dia,mes,ano,animal3));
                try(FileWriter  W = new FileWriter("Visitas.txt", true)){
                    W.write("Nome: "+animal3.getNome() + "|ID:" + animal3.getIDA() +"|Tipo De Visita:"+tipo+"Data:"+dia + "/"+mes+"/"+ano+"|" +"\n");
                    System.out.println("\tInformacao adicionada ao arquivo");
    
                }catch(IOException e){
                    System.out.println("\tFalha ao adicionar o proprietario ao arquivo");
                }
                
                System.out.println("\tHigiene registada");
                break;
            default:
                throw new IllegalArgumentException("\tTipo de visita inválido!");
                
        }
        
    }

    public static void listarVisitasDoAnimal(String id) {
        Animal a=buscarAnimalPorID(id);
        if (a == null) {
            System.out.println("\tEste animal nao foi registado");
            return ;        
        }
        System.out.println("\tLista de Visitas do "+a.getNome() + " Na veterinaria");
        for (Visita visita : listaVisitas) {
            if(visita.getAnimal().equals(a)){
                if(visita instanceof Consulta){
                    System.out.println("\t"+(Consulta)visita);
                }else if(visita instanceof Vacina){
                    System.out.println("\t"+(Vacina)visita);
                }else{
                    System.out.println("\t"+(Higiene)visita);
                }
            
            }
        }
    }

    public static void listarTiposDeVisitas() {
        System.out.println("\tVisitas realizadas:");
        for (Visita visita : listaVisitas) {
            if (visita instanceof Vacina) {
                System.out.println("\t"+(Vacina) visita);
            } else if (visita instanceof Consulta) {
                System.out.println("\t" + ((Consulta) visita));
            } else if (visita instanceof Higiene) {
                System.out.println("\t"+((Higiene) visita));
            }
        }

        
    }
    
    static Animal buscarAnimalPorID(String id){
        for(Animal a : animais){
            if(a.getIDA().equalsIgnoreCase(id)){
                return a;
            }        
        }
        return null;
    }  
   }
