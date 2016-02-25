
package sustentación1;

import java.util.Scanner;


public class Inscripcion {
    int prueba;
    Scanner leer =new Scanner(System.in);
    static  Deportistas libre1[] = new Deportistas[100];
    static  Deportistas mariposa1[] = new Deportistas[100];
    static  Deportistas pecho1[] = new Deportistas[100];
    static  Deportistas espalda1[] = new Deportistas[100];
    

    public Inscripcion Inscribir(Deportistas persona2, int lib, int mari, int pech, int espal){
        Inscripcion inscrito = new Inscripcion();
        int opc1;
        leer= new Scanner(System.in);
        System.out.println("Inscribir: \n   1) libre \n   2) Mariposa \n   3) pecho \n   4) espalda  ");
        opc1=leer.nextInt();
        switch(opc1){
            case 1:
                inscrito.libre1[lib]= new Deportistas();
                inscrito.libre1[lib]= persona2; 
                inscrito.prueba=1;
                break;
            case 2:
                inscrito.mariposa1[mari]= new Deportistas();
                inscrito.mariposa1[mari]= persona2; 
                inscrito.prueba=2;
                break;
            case 3:
                inscrito.pecho1[pech]= new Deportistas();
                inscrito.pecho1[pech]= persona2; 
                inscrito.prueba=3;
                break;
            case 4:
                inscrito.espalda1[espal]= new Deportistas();
                inscrito.espalda1[espal]= persona2; 
                inscrito.prueba=4;
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("Inscrito con exito ");
        return inscrito;
    }
    
    
    public void mostrarInscritos(Inscripcion inscritos, int curso, int lib, int mari, int pech, int espal){
        int i=0;
       
           switch(curso){
                    case 1:
                        while(i<lib){
                            System.out.println("\nInscrito "+i+"\n");
                            inscritos.libre1[i].MostrarDatos(inscritos.libre1[i]);
                            i++;
                            
                        }
                        break;
                    case 2:
                        while(i<mari){
                             System.out.println("\nInscrito "+i+"\n");
                            inscritos.mariposa1[i].MostrarDatos(inscritos.mariposa1[i]);
                            i++;
                           
                        }
                        break;
                    case 3:
                        while(i<pech){
                            System.out.println("\nInscrito "+i+"\n");
                            inscritos.pecho1[i].MostrarDatos(inscritos.pecho1[i]);
                            i++;
                            
                        }
                        break;
                    case 4:
                        while(i<espal){
                            System.out.println("\nInscrito "+i+"\n");
                            inscritos.espalda1[i].MostrarDatos(inscritos.espalda1[i]);
                            i++;
                            
                        }
                        break;
                    default:
                        System.out.println("Esa no era una opción ");
                        break;
            }
       
    
    
    }
    
    
    public Inscripcion EliminarPrueba(Inscripcion inscritos, int total, int elim, int cat){
        int opc;
        total--;
        leer= new Scanner(System.in);
        switch(cat){
                    case 1:
                        if(inscritos.libre1[elim].cedula!=0){
                            System.out.println("Seguro que quiere eliminar a : "+inscritos.libre1[elim].nombre +" 1) si   2) no      "+total);
                            opc=leer.nextInt();
                            if(opc==1){
                                System.out.println(inscritos.libre1[elim].nombre +"  Fue eliminado de la prueba libre");
                                while(elim<total){
                                    inscritos.libre1[elim].nombre=inscritos.libre1[elim+1].nombre;
                                    inscritos.libre1[elim].nac=inscritos.libre1[elim+1].nac;
                                    inscritos.libre1[elim].cedula=inscritos.libre1[elim+1].cedula;
                                    inscritos.libre1[elim].rama=inscritos.libre1[elim+1].rama;
                                    inscritos.libre1[elim].categoria=inscritos.libre1[elim+1].categoria;
                                    inscritos.libre1[elim].edad=inscritos.libre1[elim+1].edad;
                                    elim++;
                                }
                                
                            }else{
                                System.out.println(inscritos.libre1[elim].nombre +" No ha sido eliminada");
                                inscritos.prueba=0;
                            }
                            inscritos.prueba=1;
                        }
                        break;
                    case 2:
                        if(inscritos.mariposa1[elim].cedula!=0){
                            System.out.println("Seguro que quiere eliminar a : "+inscritos.mariposa1[elim].nombre +" 1) si   2) no");
                            opc=leer.nextInt();
                            if(opc==1){
                                System.out.println(inscritos.mariposa1[elim].nombre +"\n Fue eliminada de la base de datos");
                                while(elim<total){
                                    inscritos.mariposa1[elim].nombre=inscritos.mariposa1[elim+1].nombre;
                                    inscritos.mariposa1[elim].nac=inscritos.mariposa1[elim+1].nac;
                                    inscritos.mariposa1[elim].cedula=inscritos.mariposa1[elim+1].cedula;
                                    inscritos.mariposa1[elim].rama=inscritos.mariposa1[elim+1].rama;
                                    inscritos.mariposa1[elim].categoria=inscritos.mariposa1[elim+1].categoria;
                                    inscritos.mariposa1[elim].edad=inscritos.mariposa1[elim+1].edad;
                                    elim++;
                                }
                            }else{
                                System.out.println(inscritos.mariposa1[elim].nombre +" No ha sido eliminada");
                                inscritos.prueba=0;
                            }
                            inscritos.prueba=2;
                        }
                        break;
                    case 3:
                        if(inscritos.pecho1[elim].cedula!=0){
                            System.out.println("Seguro que quiere eliminar a : "+inscritos.pecho1[elim].nombre +" 1) si   2) no");
                            opc=leer.nextInt();
                            if(opc==1){
                                System.out.println(inscritos.pecho1[elim].nombre +"\n Fue eliminada de la base de datos");
                                while(elim<total){
                                    inscritos.pecho1[elim].nombre=inscritos.pecho1[elim+1].nombre;
                                    inscritos.pecho1[elim].nac=inscritos.pecho1[elim+1].nac;
                                    inscritos.pecho1[elim].cedula=inscritos.pecho1[elim+1].cedula;
                                    inscritos.pecho1[elim].rama=inscritos.pecho1[elim+1].rama;
                                    inscritos.pecho1[elim].categoria=inscritos.pecho1[elim+1].categoria;
                                    inscritos.pecho1[elim].edad=inscritos.pecho1[elim+1].edad;
                                    elim++;
                                }
                            }else{
                                System.out.println(inscritos.pecho1[elim].nombre +" No ha sido eliminada");
                                inscritos.prueba=0;
                            }
                            inscritos.prueba=3;
                        }
                        break;
                    case 4:
                        if(inscritos.espalda1[elim].cedula!=0){
                            System.out.println("Seguro que quiere eliminar a : "+inscritos.espalda1[elim].nombre +" 1) si   2) no");
                            opc=leer.nextInt();
                            if(opc==1){
                                System.out.println(inscritos.espalda1[elim].nombre +"\n Fue eliminada de la base de datos");
                                while(elim<total){
                                    inscritos.espalda1[elim].nombre=inscritos.espalda1[elim+1].nombre;
                                    inscritos.espalda1[elim].nac=inscritos.espalda1[elim+1].nac;
                                    inscritos.espalda1[elim].cedula=inscritos.espalda1[elim+1].cedula;
                                    inscritos.espalda1[elim].rama=inscritos.espalda1[elim+1].rama;
                                    inscritos.espalda1[elim].categoria=inscritos.espalda1[elim+1].categoria;
                                    inscritos.espalda1[elim].edad=inscritos.espalda1[elim+1].edad;
                                    elim++;
                                }
                            }else{
                                System.out.println(inscritos.espalda1[elim].nombre +" No ha sido eliminada");
                                inscritos.prueba=0;
                            }
                            inscritos.prueba=4;
                        }
                        break;    
                    default:
                        System.out.println("ERROR ");
                        inscritos.prueba=0;
                        break;
        }
                        
        
        
        
        return inscritos;
    
    }
}
