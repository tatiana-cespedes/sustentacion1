
package sustentación1;

import java.util.Scanner;


public class Sustentación1 {
    

    static Scanner leer;
   
    static Deportistas persona[] = new Deportistas[100];
    static Inscripcion inscritos = new Inscripcion();
    
    static int total=0, lib=0, mari=0, espal=0, pech=0;
    
    public static void main(String[] args) {
        
       Scanner leer =new Scanner(System.in);
        int opc;
        do{
            System.out.println("  1) Salir \n  2) Deportistas  \n  3) Pruebas");
            opc=leer.nextInt();
            switch(opc){
                case 2:
                    menu1();
                    break;
                case 3:
                    MenuInscribir();
                    break;
                default:
                    break;
            }
            
        }while(opc!=1);
       
    }
    static public void menu1(){
        int opc1, busc;
        leer= new Scanner(System.in);
        persona[0]= new Deportistas();
        System.out.println("Opciónes: \n   1) Ingresar deportista \n   2) Actualizar Deportista \n   3) Buscar Deportista \n   4) Eliminar Deportista  ");
        opc1=leer.nextInt();
        switch(opc1){
            case 1:
                total++;
                persona[total]= new Deportistas();
                persona[total]=persona[total].CargarDatos(persona[total]);
                busc=buscar(persona, total);
                if(busc!=0){
                    System.out.println("\n ERROR      Cédula ya existente, NO se guardó el deportista");
                    persona=persona[total].Eliminar(persona, total);
                }
                break;
            case 2:
                busc=buscar();
                if(busc!=0){
                    persona[busc]=persona[busc].ActualizarDatos(persona[busc]);
                }else{
                    System.out.println("\n persona no encontrada");
                }
                break;
            case 3:
                busc=buscar();
                if(busc!=0){
                    persona[busc].MostrarDatos(persona[busc]);}
                else{
                    System.out.println("\n persona no encontrada");
                }
                break;
            case 4:
                busc=buscar();
                persona=persona[busc].Eliminar(persona, total, busc);
                
                break;
            default:
                System.out.println("\n Opción no válida");
                break;
        }
        
    }
   
    static public int buscar(){
        int i=1, ced, buscar=0;
        System.out.println("\n Ingrese la cédula de la persona a buscar");
        ced=leer.nextInt();
        while(i<=total){
            if(persona[i].cedula==ced){
                buscar=i;
                i=total+1;
            }else{
                i++;
            }
        }
        return buscar;
    }
    
    static public int buscar(Deportistas persona1[], int cedu){
    int i=1, buscar=0;
        while(i<cedu){
            if(persona1[i].cedula==persona1[cedu].cedula){
                buscar=i;
                i=cedu+1;
            }else{
                i++;
            }
        }
        return buscar;
    
    }
    
    static public void MenuInscribir(){
        int opc1=0, busc, opc2=0;
        leer= new Scanner(System.in);
        System.out.println("Opciónes: \n   1) Inscribir Nadador \n   2) Eliminar Nadador \n   3) Mostrar Prueba");
        opc1=leer.nextInt();
        switch(opc1){
            case 1:
                inscritos= new Inscripcion();
                busc=buscar();
                if(busc!=0){
                    persona[busc].MostrarDatos(persona[busc]);
                    inscritos= inscritos.Inscribir(persona[busc], lib, mari, pech, espal);
                    switch(inscritos.prueba){
                        case 1:
                            lib++;
                            break;
                        case 2:
                            mari++;
                            break;
                        case 3:
                            pech++;
                            break;
                        case 4:
                            espal++;
                            break;
                    }
                          
                }else{
                    System.out.println("Usuario no encontrado");
                }
                break;
            case 2:
                inscritos=buscarInscripcion(inscritos);
                break;
            case 3:
                System.out.println("Opciónes: \n   1) Libre \n   2) Mariposa \n  3) Pecho \n  4) Espalda \n    ");
                opc2=leer.nextInt();
                switch(opc2){
                    case 1:
                        inscritos.mostrarInscritos(inscritos, 1, lib, mari, pech, espal);
                        break;
                    case 2:
                        inscritos.mostrarInscritos(inscritos, 2, lib, mari, pech, espal);
                        break;
                    case 3:
                        inscritos.mostrarInscritos(inscritos, 3, lib, mari, pech, espal);
                        break;
                    case 4:
                        inscritos.mostrarInscritos(inscritos, 4, lib, mari, pech, espal);
                        break;
                    default:
                        System.out.println("Opciónes: \n   1) Libre \n   2) Mariposa \n  3) Pecho \n  4) Espalda \n    ");
                        break;
                }
            
            default:
                break;
        }
    }
 
    
    static public Inscripcion buscarInscripcion(Inscripcion inscritos1){
        int i=0, ced, buscarlib=0, buscarmari=0, buscarpech=0,buscarespal=0, opc, opc1=0, opc2=0, opc3=0, opc4=0;
        System.out.println("\n Ingrese la cédula de la persona a buscar");
        ced=leer.nextInt();
        while(i<lib){
            if(inscritos1.libre1[i].cedula==ced){
                buscarlib=i;
                System.out.println("\n Deportista inscrito en:   1) Libre        "+i);
                opc1=1;
                i=lib;
            }else{
                i++;
            }
        }
        i=0;
        while(i<mari){
            if(inscritos1.mariposa1[i].cedula==ced){
                buscarmari=i;
                System.out.println("\n Deportista inscrito en    2) Mariposa");
                opc2=2;
                
                i=mari;
            }else{
                i++;
            }
        }
        i=0;
        while(i<pech){
            if(inscritos1.pecho1[i].cedula==ced){
                buscarpech=i;
                System.out.println("\n Deportista inscrito en    3) Pecho");
                opc3=3;
                
                i=pech;
            }else{
                i++;
            }
        }
        i=0;
        while(i<espal){
            if(inscritos1.espalda1[i].cedula==ced){
                buscarespal=i;
                System.out.println("\n Deportista inscrito en    2) Espada");
                opc4=4;
                
                i=espal;
            }else{
                i++;
            }
        }
        System.out.println("\n Desea Eliminar una categoría?   \n"+opc1+") Libre  \n"+opc2+") Mariposa\n"+opc3+") Pecho\n"+opc4+") Espalda");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                if(opc1==1){
                    inscritos1= inscritos1.EliminarPrueba(inscritos1, lib, buscarlib,1);
                }else{
                    System.out.println("No valido");
 
                }
                break;
            case 2:
                if(opc2==2){
                    inscritos1= inscritos1.EliminarPrueba(inscritos1, mari, buscarmari,2);
                }else{
                    System.out.println("No valido");
 
                }
                break;
            case 3:
                if(opc3==3){
                    inscritos1= inscritos1.EliminarPrueba(inscritos1, pech, buscarpech,3);
                }else{
                    System.out.println("No valido");
 
                }
                break;
            case 4:
                if(opc4==4){
                    inscritos1= inscritos1.EliminarPrueba(inscritos1, espal, buscarespal,4);
                }else{
                    System.out.println("No valido");
 
                }
                break;
            default:
                System.out.println("No valido");
                break;
        }
        switch(inscritos1.prueba){
            case 1:
                lib--;
                break;
            case 2:
                mari--;
                break;
            case 3:
                pech--;
                break;
            case 4:
                espal--;
                break;
            default:
                break;

        }
                        
        return inscritos1;
    }
    
}
