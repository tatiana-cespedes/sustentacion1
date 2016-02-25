
package sustentación1;

import java.util.Scanner;

public class Deportistas {
    private Scanner leer;
    String nombre;
    int cedula, rama, categoria, nac, edad;
    
    public Deportistas CargarDatos(Deportistas persona){
        leer= new Scanner(System.in);
        System.out.println("Ingresar Datos de usuario");
        System.out.println("Ingrese Nombre");
        persona.nombre=leer.nextLine();
        System.out.println("Ingrese año de Nacimiento");
        persona.nac=leer.nextInt();
        System.out.println("Ingrese el documento de identidad");
        persona.cedula=leer.nextInt();
        System.out.println("Ingrese rama: \n   1)Femenino \n   2)Masculino ");
        persona.rama=leer.nextInt();
        System.out.println("Datos guardados exitosamente");
        persona.edad= 2016-nac;
        if(persona.edad<6){
            persona.categoria=0;
        }else
        if(persona.edad<11){
            persona.categoria=1;
        }else
        if(persona.edad<18){
            persona.categoria=2;
        }else
        if(persona.edad<26){
            persona.categoria=3;
        }else{
            persona.categoria=4;
        }
        MostrarDatos(persona);
        return persona;
    }
    
    public void MostrarDatos(Deportistas persona){
        
        System.out.println("Nombre:               "+persona.nombre);
        System.out.println("Año de nacimiento:    "+persona.nac);
        System.out.println("Edad:                 "+persona.edad);
        System.out.println("Cédula:               "+persona.cedula);
        if(rama==1){
            System.out.println("Rama:                 Fem");
        }else if(rama==2){
            System.out.println("Rama:                 Masc");
        }else{
            System.out.println("Rama:                 ");
        }
        switch(persona.categoria){
            case 0:
                System.out.println("Categoria:            ninguna");
                break;
            case 1:
                System.out.println("Categoria:            1");
                break;
            case 2:
                System.out.println("Categoria:            2");
                break;
            case 3:
                System.out.println("Categoria:            3");
                break;
            case 4:
                System.out.println("Categoria:            4");
                break;
        
        }
        
    }
    
     public Deportistas ActualizarDatos(Deportistas persona){
        int opc;
        Scanner leer =new Scanner(System.in);
        persona.MostrarDatos(persona);
        System.out.println("\n Qué parámetro desea cambiar: \n   1) Nombre \n   2) Documento de identidad ");
        System.out.println("3) Año de nacimiento \n   4) Rama");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                System.out.println("Ingrese Nombre");
                persona.nombre=leer.next();
                break;
            case 2:
                System.out.println("Ingrese Documento de identidad");
                persona.cedula=leer.nextInt();
                break;
            case 3:
                System.out.println("Ingrese Año de nacimiento");
                persona.nac=leer.nextInt();
                break;
            case 4:
                System.out.println("Ingrese Rama: \n 1) Femenino  \n 2)Masculino");
                persona.rama=leer.nextInt();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        persona.MostrarDatos(persona);
        return persona;
    }
     
    public Deportistas[] Eliminar(Deportistas persona[], int total, int elim){
        int opc;
        leer= new Scanner(System.in);
        if(persona[elim].cedula!=0){
            System.out.println("Seguro que quiere eliminar a : "+persona[elim].nombre +" 1) si   2) no");

            opc=leer.nextInt();
            if(opc==1){
                System.out.println(persona[elim].nombre +"\n Fue eliminada de la base de datos");
                while(elim<total){
                    persona[elim].nombre=persona[elim+1].nombre;
                    persona[elim].nac=persona[elim+1].nac;
                    persona[elim].cedula=persona[elim+1].cedula;
                    persona[elim].rama=persona[elim+1].rama;
                    persona[elim].categoria=persona[elim+1].categoria;
                    persona[elim].edad=persona[elim+1].edad;
                    elim++;
                }
            }else{
                System.out.println(persona[elim].nombre +" No ha sido eliminada");
            }
        }
        
        return persona;
    }
    
    public Deportistas[] Eliminar(Deportistas persona[], int total){
        leer= new Scanner(System.in);
        if(persona[total].cedula!=0){
                
                persona[total].nombre="";
                persona[total].nac=0;
                persona[total].cedula=0;
                persona[total].rama=0;
                persona[total].categoria=0;
                persona[total].edad=0;
        }
        return persona;
    }
}
