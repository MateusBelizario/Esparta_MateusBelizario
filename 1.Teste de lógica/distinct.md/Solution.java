package distinct.md;
import java.util.Arrays;

/**
 *
 * @author Mateus Guimarães Belizario
 */
public class Solution {
    public int solution(int[] A){ 
        if(A.length==1){                    //Se o tamanho do vetor for 1...
            return 1;                       //Retorna 1
        }
        
        Arrays.sort(A);                     //Ordena o vetor, utilizando quick sort O(n log(n))
        
        int distinct = 1;                   //Inicialmente existe 1 número distinto
        int last_number = A[0];             //Último número avaliado foi a primeira posição do vetor.
        
        for(int i=1; i<A.length; i++){      //Para cada posição do vetor, após a primeira posição...
            if(A[i]!= last_number){         //Se a posição atual não for igual à posição anterior...
                distinct++;                 //O número de número distintos é incrementado.
                last_number = A[i];         //O último número avaliado é alterado.
            }
        }
        return distinct;                    //Retorna o valor de números distintos.
    }
}
