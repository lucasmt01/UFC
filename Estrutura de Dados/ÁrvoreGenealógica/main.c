#include <stdio.h>
#include <stdlib.h>
#include "tad.h"

int main()
{


    Arvg *pessoa = NULL;

    pessoa = adicionar(pessoa, "Lucas", 'M');
    pessoa = adicionar(pessoa, "Eduardo", 'M');
    pessoa = adicionar(pessoa, "Maria", 'F');
    pessoa = adicionar(pessoa, "Greta", 'F');
    pessoa = adicionar(pessoa, "Antonio ", 'M');
    pessoa = adicionar(pessoa, "Raimundo", 'M');
    pessoa = adicionar(pessoa, "Nilta", 'F');
    pessoa = adicionar(pessoa, "Josef", 'M');

    listarTudo(pessoa);

    printf("%d ",altura(pessoa));

    printf("%d ",contaPessoas(pessoa));

    buscarPessoa(pessoa,"Greta",'F');

    listarAncestrais(pessoa, "Maria", 'F');

    removerPessoa(pessoa, "Greta", 'F');


    return 0;
}
