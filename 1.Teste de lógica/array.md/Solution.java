package array.md;

/**
 *
 * @author Mateus Guimarães Belizario
 */
public class Solution {
    
    public int solution(int[] A){               
        boolean find;                                   //Boolean para indicar se o par foi achada
        int unpaired = 0;                               //Indica o número sem par
        
        for(int i = 0; i < A.length; ++i){              //Para cada posição do vetor...
            if(A[i] != 0){                              //Se aquela posição não for 0
                find = false;                           //Indica que por enquanto o par não foi achado
            
                for(int j = i+1; j < A.length; ++j){    //Para cada posição do vetor após A[i]...
                    if(A[i] == A[j]){                   //Se existe uma posição de mesmo valor...
                        find = true;                    //O par foi achado
                        A[j] = 0;                       //A posição par é zerada para não ser computada futuramente
                    }
                }
                if(!find){                              //Se um par não foi achado para a posição atual
                    unpaired = i;                       //O indice do número sem par é [i]
                    break;
                }
            }
        }
        return A[unpaired];                             //Retorna índice sem Par.
    }
}
