/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_emilianoagurcia_12211003;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Main {
static Scanner lea = new Scanner(System.in);
static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Cohete> Cohetes = new ArrayList();
        ArrayList <Planeta> Planetas = new ArrayList();
        
        ArrayList <String> NombresCohetes = new ArrayList();
        ArrayList <String> NombresPlanetas = new ArrayList();
        ArrayList <String> NombresPersonas = new ArrayList();
        ArrayList <String> NombresLunas = new ArrayList();
        
//Cohetes Predeterminados
Cohetes.add(new C_Combustible_Liquido( 39,  20,  "Cohete0",  "E9P38",  1,  ( 5000 + (15001 - 5000) * random.nextDouble() ) * 2));
Cohetes.add(new C_De_Fases( 5,  10,  40,  300,  "Almat",  "12SkOp",  6,   ( 5000 + (15001 - 5000) * random.nextDouble() ) * 6));
//Cohetes.add(new C_Combustible_Solido( Combustible,  Material,  PesoSop,  NombreC,  NumSerie,  Potencia,  Velocidad));


//Planetas Predeterminados
Planetas.add(new Planeta_Gaseoso( 90,  2,  "Corno",  10020102,  20300000,  30,  VelocidadEscape(20300000, 10020102))); 
//Planetas.add(new Planeta_Rocoso(Densidad, IndicadorVida, NombreP, Masa, Radio, TempProm, VelEscape));
        

        
        boolean centinela = true;
        while(centinela == true){
            System.out.println();
            System.out.println("====================MENU PRINCIPAL====================");
            System.out.println("0) Salir");
            System.out.println("1) Crear Cohete");
            System.out.println("2) Crear Planeta");
            System.out.println("3) Editar Cohete");
            System.out.println("4) Editar Planeta");
            System.out.println("5) Listar Cohetes");
            System.out.println("6) Listar Planetas");
            System.out.println("7) Probar Cohete");
            System.out.println("======================================================");
            System.out.print("ELija la opcion: ");
            int opcionMenu = lea.nextInt();
            System.out.println();
            
            switch(opcionMenu){
                case 0:{
                    centinela = false;
                }break;
//Crear Cohete                
                case 1:{
                    System.out.println("A continuación, Ingrese los datos del Cohete\n");
                    System.out.print("Nombre: ");
                    lea.nextLine();
                    String NombreC = lea.nextLine();
                    
                    while(NombresCohetes.contains(NombreC)){
                        System.out.println("El nombre ya ha sido tomado, ingrese otro nuevamente: ");
                        lea.nextLine();
                        NombreC = lea.nextLine();
                    }
                    NombresCohetes.add(NombreC);
                    
                    System.out.print("Peso soportado(en Kg): ");
                    double PesoSop = lea.nextDouble();
                    
                    System.out.print("Numero de Serie: ");
                    lea.nextLine();
                    String NumSerie = lea.nextLine();
                    
                    System.out.print("Potencia (1-9): ");
                    int Potencia = lea.nextInt();
                    while(Potencia<1 || Potencia>9){
                        System.out.print("Por favor, ingrese una Potencia del 1 al 9: ");
                        Potencia = lea.nextInt();
                    }
                    double Velocidad = ( 5000 + (15001 - 5000) * random.nextDouble() ) * Potencia;
                    
                    System.out.println("\n---------Tipos---------");
                    System.out.println("1) Liquido");
                    System.out.println("2) De fases");
                    System.out.println("3) Solido");
                    System.out.println("-----------------------");
                    System.out.print("Elija el Tipo: ");
                    int Tipo = lea.nextInt();
                    System.out.println();
                    
                    switch(Tipo){
                        case 1:{
                            System.out.print("Gas(en Litros): ");
                            double Gas = lea.nextDouble();
                            
                            Cohetes.add(new C_Combustible_Liquido( Gas,  PesoSop,  NombreC,  NumSerie,  Potencia,  Velocidad));
                        }break;
                        
                        case 2:{
                            System.out.print("Cantidad de Fases: ");
                            int cFases = lea.nextInt();
                            System.out.print("Cantidad de Motores: ");
                            int cMotores = lea.nextInt();
                            System.out.print("Altura del Cohete: ");
                            double Altura = lea.nextInt();
                            
                            Cohetes.add(new C_De_Fases( cFases,  cMotores,  Altura,  PesoSop,  NombreC,  NumSerie,  Potencia,  Velocidad));
                        }break;
                        
                        case 3:{
                            System.out.print("Combustible(en Kilos): ");
                            double Combustible = lea.nextDouble();
                            
                            System.out.print("Material: ");
                            lea.nextLine();
                            String Material = lea.nextLine();
                            
                            Cohetes.add(new C_Combustible_Solido( Combustible,  Material,  PesoSop,  NombreC,  NumSerie,  Potencia,  Velocidad));
                        }break;
                        
                        default: System.out.println("Opcion Incorrecta");
                    }
                }break;
                
//Crear Planeta
                case 2:{
                    System.out.println("A continuación, Ingrese los datos del Planeta\n");
                    System.out.print("Nombre: ");
                    lea.nextLine();
                    String NombreP= lea.nextLine();
                    while(NombresPlanetas.contains(NombreP)){
                        System.out.println("El nombre ya ha sido tomado, ingrese otro nuevamente: ");
                        lea.nextLine();
                        NombreP = lea.nextLine();
                    }
                    NombresPlanetas.add(NombreP);
                    
                    System.out.print("Masa: ");
                    double Masa= lea.nextDouble();
                    System.out.print("Radio: ");
                    double Radio= lea.nextDouble();
                    System.out.print("Temperatura Promedio: ");
                    double TempProm= lea.nextDouble();
                    
                    double VelEscape = VelocidadEscape(Radio, Masa);
                    
                    System.out.println("\n---------Tipos---------");
                    System.out.println("1) Gaseoso");
                    System.out.println("2) Rocoso");
                    System.out.println("-----------------------");
                    System.out.print("Elija el Tipo: ");
                    int Tipo = lea.nextInt();
                    System.out.println();
                    
                    switch(Tipo){
                        case 1:{
                            System.out.print("Presion: ");
                            double Presion = lea.nextDouble();
                            
                            System.out.print("Cantidad de Anillos: ");
                            int cAnillos = lea.nextInt();
                            
                            Planetas.add(new Planeta_Gaseoso( Presion,  cAnillos,  NombreP,  Masa,  Radio,  TempProm,  VelEscape));
                        }break;
                        
                        case 2:{
                            System.out.print("Densidad: ");
                            double Densidad = lea.nextDouble();
                            
                            boolean IndicadorVida = false;
                            System.out.print("Hay Vida(Si/No): ");
                            char resp = lea.next().charAt(0);
                            
                            if(resp == 's' || resp == 'S'){
                                IndicadorVida = true;
                            }else{
                                IndicadorVida = false;
                            }
                            Planetas.add(new Planeta_Rocoso(Densidad, IndicadorVida, NombreP, Masa, Radio, TempProm, VelEscape));
                        }break;
                        
                        default: System.out.println("Opcion Incorrecta");
                    }
                    
                }break;
                
//Editar Cohete                
                case 3:{
                    if(Cohetes.isEmpty()){
                        System.out.println("Aun no hay Cohetes en el Sistema");
                    }else{
                    boolean centinela2 = true;
                    while(centinela2 == true){
                        System.out.println("--------------------COHETES--------------------");
                        for (int i = 0; i < Cohetes.size(); i++) {
                            System.out.println("Cohete #"+i);
                            System.out.println(Cohetes.get(i));
                            System.out.println();
                        }
                        System.out.println("-----------------------------------------------");
                        System.out.println("Ingrese el indice del Cohete que desea modificar: ");
                        int index = lea.nextInt();
                        
                        if(index >= Cohetes.size()){
                            System.out.println("Indice Invalido");
                        }else{
                            
                            
                            while(centinela2 == true){
                            System.out.println("+++++++++++++++Atributos+++++++++++++++");
                            System.out.println("0) Salir");
                            System.out.println("1) Agregar Persona");
                            System.out.println("2) Eliminar Persona");
                            System.out.println("3) Listar Personas");
                            System.out.println("+++++++++++++++++++++++++++++++++++++++");
                            System.out.print("Elija la opcion: ");
                            int nMod = lea.nextInt();

                            switch(nMod){
                                case 0:{
                                    centinela2 = false;
                                }break;

                                case 1:{
                                    char resp = 's';
                                    while(resp == 's' || resp == 'S'){
                                        System.out.println("A continuación, Ingrese los datos de la persona\n");
                                        System.out.print("Nombre: ");
                                        lea.nextLine();
                                        String NombrePers = lea.nextLine();
                                        while(NombresPersonas.contains(NombrePers)){
                                            System.out.println("El nombre ya ha sido tomado, ingrese otro nuevamente: ");
                                            lea.nextLine();
                                            NombrePers = lea.nextLine();
                                        }
                                        NombresPersonas.add(NombrePers);
                                        
                                        System.out.print("Edad: ");
                                        int Edad = lea.nextInt();
                                        System.out.print("Peso: ");
                                        double Peso = lea.nextDouble();

                                        Cohetes.get(index).getPersonas().add(new Personas(NombrePers, Edad, Peso)); 
                                        System.out.println("Desea agregar otra persona al cohete "+Cohetes.get(index).getNombreC()+"? (Si, No): ");
                                        resp = lea.next().charAt(0);
                                    }
                                }break;

                                case 2:{
                                    System.out.println("--------------------PERSONAS--------------------");
                                    for (int i = 0; i < Cohetes.size(); i++) {
                                        System.out.println(Cohetes.get(index).getPersonas().get(i));
                                        System.out.println();
                                    }
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Ingrese el nombre de la persona que desea echar del cohete: ");
                                    lea.nextLine();
                                    String nombreMod = lea.nextLine();

                                    if(NombresPersonas.contains(nombreMod)){
                                        int indexPersona = -1;
                                        
                                        for (int i = 0; i < Cohetes.size(); i++) {
                                            if(Cohetes.get(index).getPersonas().get(i).getNombrePers().equals(nombreMod)){
                                                indexPersona = i;
                                            }
                                        }
                                        
                                        System.out.println("Esta Seguro de que desea eliminar a "+nombreMod+"? (Si, No): ");
                                        char resp = lea.next().charAt(0);
                                        
                                        if(resp == 's' || resp == 'S'){
                                            Cohetes.get(index).getPersonas().remove(indexPersona);
                                        }else{
                                            System.out.println("Accion Cancelada");
                                        }
                                    }else{
                                        System.out.println("La persona que ingreso no se encuentra en el sistema");
                                    }
                                }break;
                                
                                case 3:{
                                    System.out.println("--------------------PERSONAS--------------------");
                                    for (int i = 0; i < Cohetes.size(); i++) {
                                        System.out.println(Cohetes.get(index).getPersonas().get(i));
                                        System.out.println();
                                    }
                                    System.out.println("------------------------------------------------");
                                }break;

                                default: System.out.println("Opcion Incorrecta");    
                            }
                            
                            }
                            
                        }
                    }//Fin Centinela2
                }
                }break;
                
                
//Editar Planeta                
                case 4:{
                    if(Planetas.isEmpty()){
                        System.out.println("Aun no hay Planetas en el Sistema");
                    }else{
                        System.out.println("--------------------PLANETAS--------------------");
                        for (int i = 0; i < Planetas.size(); i++) {
                            System.out.println("Planeta #"+i);
                            System.out.println(Planetas.get(i));
                            System.out.println();
                        }
                        System.out.println("------------------------------------------------");
                        System.out.println("Ingrese el indice del planeta que desea modificar: ");
                        int index = lea.nextInt();
                        
                        if(index >= Cohetes.size()){
                            System.out.println("Indice Invalido");
                        }else{
                            boolean centinela3 = true;
                            while(centinela3 == true){
                                        System.out.println("+++++++++++++++Atributos+++++++++++++++");
                                    System.out.println("0) Salir");
                                    System.out.println("1) Agregar Luna");
                                    System.out.println("2) Eliminar Luna");
                                    System.out.println("3) Listar Lunas");
                                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                                    System.out.print("Elija la opcion: ");
                                    int nMod = lea.nextInt();

                                    switch(nMod){
                                        case 0:{
                                            centinela3 = false;
                                        }break;

                                        case 1:{
                                            char resp = 's';
                                                while(resp == 's' || resp == 'S'){
                                                    System.out.println("A continuación, Ingrese los datos de la Luna\n");
                                                    System.out.print("Nombre: ");
                                                    lea.nextLine();
                                                    String NombreL = lea.nextLine();

                                                    while(NombresLunas.contains(NombreL)){
                                                        System.out.println("El nombre ya ha sido tomado, ingrese otro nuevamente: ");
                                                        lea.nextLine();
                                                        NombreL = lea.nextLine();
                                                    }
                                                    NombresLunas.add(NombreL);

                                                    System.out.print("Numero de Crateres: ");
                                                    int Edad = lea.nextInt();

                                                    Planetas.get(index).getLunas().add(new Lunas(NombreL, Edad));
                                                    System.out.println("Desea agregar otra Luna al planeta "+ Planetas.get(index).getNombreP() +"? (Si, No): ");
                                                    resp = lea.next().charAt(0);
                                                }
                                        }break;

                                        case 2:{
                                            System.out.println("--------------------LUNAS--------------------");
                                            for (int i = 0; i < Planetas.size(); i++) {
                                                System.out.println(Planetas.get(i));
                                                System.out.println();
                                            }
                                            System.out.println("-----------------------------------------------");
                                            System.out.println("Ingrese el nombre del planeta al que desea eliminarle la Luna: ");
                                            lea.nextLine();
                                            String nombreMod = lea.nextLine();

                                            if(NombresPlanetas.contains(nombreMod)){
                                                int indexLuna = -1;

                                                for (int i = 0; i < Cohetes.size(); i++) {
                                                    if(Planetas.get(index).getLunas().get(i).equals(nombreMod)){
                                                        indexLuna = i;
                                                    }
                                                }

                                                System.out.println("Esta Seguro de que desea eliminar la Luna "+nombreMod+"? (Si, No): ");
                                                char resp = lea.next().charAt(0);

                                                if(resp == 's' || resp == 'S'){
                                                    Planetas.get(index).getLunas().remove(indexLuna);
                                                }else{
                                                    System.out.println("Accion Cancelada");
                                                }
                                            }else{
                                                System.out.println("La Luna que ingreso no se encuentra en el sistema");
                                            }
                                        }break;

                                        case 3:{
                                            System.out.println("--------------------LUNAS--------------------");
                                            for (int i = 0; i < Planetas.size(); i++) {
                                                System.out.println(Planetas.get(index).getLunas().get(i));
                                                System.out.println();
                                            }
                                            System.out.println("------------------------------------------------");
                                        }break;

                                        default: System.out.println("Opcion Incorrecta");
                                    }
                                }    
                            }
                        
                    }
                }break;
                
                
                
//Listar Cohetes                
                case 5:{
                    System.out.println("--------------------COHETES--------------------");
                    for (int i = 0; i < Cohetes.size(); i++) {
                        System.out.println("Cohete #"+i);
                        System.out.println(Cohetes.get(i));
                        System.out.println();
                    }
                    System.out.println("------------------------------------------------");
                }break;
                
//Listar Planetas                
                case 6:{
                    System.out.println("--------------------PLANETAS--------------------");
                    for (int i = 0; i < Planetas.size(); i++) {
                        System.out.println("Planeta #"+i);
                        System.out.println(Planetas.get(i));
                        System.out.println();
                    }
                    System.out.println("------------------------------------------------");
                }break;

//Probar Cohetes                
                case 7:{
                    if(Planetas.isEmpty()){
                        System.out.println("No hay Planetas en el Sistema");
                    }else if(Cohetes.isEmpty()){
                        System.out.println("No hay Cohetes en el Sistema");
                    }else{
                        System.out.println("--------------------PLANETAS--------------------");
                        for (int i = 0; i < Planetas.size(); i++) {
                            System.out.println("Planeta #"+i);
                            System.out.println(Planetas.get(i));
                            System.out.println();
                        }
                        System.out.println("------------------------------------------------");
                        System.out.print("Ingrese el indice del planeta: ");
                        int indexPlaneta = lea.nextInt();
                        
                        if(indexPlaneta >= Planetas.size()){
                            System.out.println("Indice Invalido");
                        }else{
                            int lExitoso = 0;
                            int lFallido = 0;
                            System.out.println("--------------------Lanzamiento--------------------");
                            System.out.println("1) 1 Cohete");
                            System.out.println("2) Todos los Cohetes");
                            System.out.println("---------------------------------------------------");
                            System.out.print("Ingrese la opcion: ");
                            int opcionLanz = lea.nextInt();
                            
                            switch(opcionLanz){
                                case 1:{
                                    System.out.println("--------------------COHETES--------------------");
                                    for (int i = 0; i < Cohetes.size(); i++) {
                                        System.out.println("Cohete #"+i);
                                        System.out.println(Cohetes.get(i));
                                        System.out.println();
                                    }
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Ingrese el indice del cohete: ");
                                    int indexCohete = lea.nextInt();   
                                    
                                    if(Planetas.get(indexPlaneta).getVelEscape() < Cohetes.get(indexCohete).getVelocidad()){
                                        System.out.print("El cohete "+Cohetes.get(indexCohete).getNombreC()+" ha alcanzado una velocidad de "+Cohetes.get(indexCohete).getVelocidad());
                                        System.out.print(" y NO logro salir del planeta "+Planetas.get(indexPlaneta).getNombreP());
                                        lFallido++;
                                    }else{
                                        System.out.print("El cohete "+Cohetes.get(indexCohete).getNombreC()+" ha alcanzado una velocidad de "+Cohetes.get(indexCohete).getVelocidad());
                                        System.out.print(" y logro salir del planeta "+Planetas.get(indexPlaneta).getNombreP());
                                        lExitoso++;
                                    }
                                }break;
                                
                                case 2:{
                                    for (int i = 0; i < Cohetes.size(); i++) {
                                        if(Planetas.get(indexPlaneta).getVelEscape() < Cohetes.get(i).getVelocidad()){
                                            System.out.print("El cohete "+Cohetes.get(i).getNombreC()+" ha alcanzado una velocidad de "+Cohetes.get(i).getVelocidad());
                                            System.out.print(" y NO logro salir del planeta "+Planetas.get(indexPlaneta).getNombreP());
                                            lFallido++;
                                            System.out.println();
                                        }else{
                                            System.out.print("El cohete "+Cohetes.get(i).getNombreC()+" ha alcanzado una velocidad de "+Cohetes.get(i).getVelocidad());
                                            System.out.print(" y logro salir del planeta "+Planetas.get(indexPlaneta).getNombreP());
                                            lExitoso++;
                                            System.out.println();
                                        }
                                    }
                                }break;
                                
                                default: System.out.println("Opcion Incorrecta");
                            }
                            
                        }
                    }
                }break;
                
                default: System.out.println("Opcion Incorrecta");
            }
        }
        
    }//Fin Main
    
    public static double VelocidadEscape(double radio, double Masa){
        double VelEsc = 0;
        
        double G = 6.67 * Math.pow(10, -11);
        
        VelEsc = Math.sqrt((2*G*Masa)/radio);
        
        return VelEsc;
    }
    
}
