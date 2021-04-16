/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jonathan ibarra
 */
public class Ejercicios {
    
    public Ejercicios(){}
    
    //ejercicio 1
    
    public ArrayList<Integer> ejercicio1(ArrayList<Integer> pEnteros, int pPermutaciones){
        ArrayList<Integer> resultado=pEnteros;
        for(int i=0;i<pPermutaciones;i++){
           resultado = this.permutacion(resultado);
        }
        return resultado;
    }
    
    //metodo que permuta cada array
    public ArrayList<Integer> permutacion(ArrayList<Integer> pEnteros){
        ArrayList<Integer> resultado=new ArrayList<Integer>();
        for(int j=0;j<pEnteros.size();j++){
            int anterior=0;
            int siguiente=0;
            if(j!=0 && j!=(pEnteros.size()-1)){
                anterior=pEnteros.get(j-1);
                siguiente=pEnteros.get(j+1);
            }
            else if(j==0){siguiente=pEnteros.get(j+1);}
            else {anterior=pEnteros.get(j-1);}
            if(anterior==siguiente){resultado.add(0);}
            else{resultado.add(1);}
        }
        return resultado;
    }
    
    //ejercicio 2
    
    public void ejercicio2(int num1, int num2,int num3){
        int res=0;
        if(num1>num2){
            res=num1;}
        else{
            res=num2;}
        if(res>num3){
            System.out.println("El numero mayor es: "+res);}
        else{
           System.out.println("El numero mayor es: "+num3);}
    }
    
    //ejercicio 3
    public void ejercicio3(int[] vector){
        ArrayList pares = new ArrayList();
        ArrayList impares = new ArrayList();
        for(int i=0;i<vector.length;i++){
            if(vector[i]%2==0){pares.add(vector[i]);}
            else{impares.add(vector[i]);}
        }
        pares=this.ordenamiento(pares);
        impares=this.ordenamiento(impares);
        System.out.print("\nResultado: ");
        for(int i=0; i<pares.size();i++){
              System.out.print(pares.get(i)+", ");
        }
        for(int i=0; i<impares.size();i++){
              System.out.print(impares.get(i)+", ");
        }
    }
    
    //metodo de ordenamiento
    public ArrayList ordenamiento(ArrayList vector){
        int i, j;
        int aux;
        for (i = 1; i < vector.size(); i++){
            j = i;
            aux = (int) vector.get(i);
            while (j > 0 && aux < (int)vector.get(j-1)){
                vector.set(j, vector.get(j-1));
                j--;
            }
            vector.set(j, aux);
        }
        return vector;
    }
    
    //ejercicio 4
    public void ejercicio4(String cadena){
        String res="";
        String sub = "soh";
        int ax=0;
        for(int i=0; i<cadena.length();i++){
            if(ax==sub.length()){
                break;
            }
            if(cadena.charAt(i)==sub.charAt(ax)){
                res=res+cadena.charAt(i);
                ax=ax+1;
            }
        }
        if(res.equals(sub)){
            System.out.println("Se extrajo con exito la palabra: "+res);
        }
        else{
            System.out.println("ocurrio un error, la palabra extraida fue: "+res);
        }
    }
}
