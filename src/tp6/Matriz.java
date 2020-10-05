/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author agustin
 */
public class Matriz {
    
    public void armar(){
       
    int num = 3;
    
    int matriz [][] = new int [4][];
    
    matriz[0] = new int[4];
    matriz[1] = new int [3];
    matriz[2] = new int [5];
    matriz[3] = new int [2];
    
    for(int f=0;f<matriz.length;f++){
        
                for(int c=0;c<matriz[f].length;c++){
                    
                        matriz[f][c]= num;
                        num += 3;
                        System.out.print(matriz[f][c]+" ");  
                    }
                System.out.println();
        }
    
     System.out.println("Los numeros pares son: ");
     int numPar = 0;
     
         for(int x=0;x<matriz.length;x++){
        
                for(int y=0;y<matriz[x].length;y++){
                    
                        if(matriz[x][y]%2==0){
                            System.out.print(matriz[x][y]+" ");
                        }
                    }
                System.out.println();
        }
    } 
   
 


} 


