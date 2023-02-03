#include <stdio.h>
#include <stdlib.h>

int main()
{
int *D = calloc(61,sizeof(int));
int *E = calloc(61,sizeof(int));
int N,M,cont=0;
char L;

//Recebe a quantidade de Botas
scanf("%d", &N);

     //Se o número de Botas não seguir os requisitos, encerre o código
     if(N%2!=0 || N<=2 || N>=10000)
        {
          printf("Quantidade de botas não condizentes com as restrições propostas!");
          exit(0);
        }

//enquanto tiver Botas (N > 0) faça
while(N--)
{
     scanf("%d%c", &M, &L);

     if(M<30 || M>60 || (L!='E' && L!='D'))
         {
         printf("\nNumeração ou lado da bota invalido. Insira novamente!\n");
         N++;
         }

     if(L=='E')
     {
        E[M]++;
     }

     else if(L=='D')
     {
        D[M]++;
     }

     if(E[M] && D[M])
     {
        E[M]--;
        D[M]--;
        cont++;
     }
}
printf("\n%d\n", cont);
return 0;
}
