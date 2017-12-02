package euclidian.md;
/**
 *
 * @author Mateus Guimarães Belizario
 */
public class Solution {
    
    public int solution(int N, int M){               
        int chocolates = 1;                 //Chocolates comidos 
        int piece = 0;                      //Chocolate atual que está sendo comido

        while ((piece + M) % N != 0)        //Enquanto o próximo chocolate a ser comido não for o primeiro...
        {
            piece = (piece + M) % N;        //O próximo chocolate é dado por essa fórmula: (pedaço atual + M) % N
            chocolates++;                   //Número de chocolates comidos é incrementando.
        }
        return chocolates;                  //Retorna a solução.
    }
}
