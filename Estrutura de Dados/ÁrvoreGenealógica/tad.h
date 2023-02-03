#ifndef TAD_H_INCLUDED
#define TAD_H_INCLUDED

typedef struct arvore_genealogica {
    char nome[50];
    char genero;
    struct arvore_genealogica *pai, *mae;
}Arvg;

Arvg* adicionar(Arvg* pessoa, char* nome, char genero);
void listarTudo(Arvg* pessoa);
int altura(Arvg* pessoa);
int contaPessoas(Arvg* pessoa);
void apagarArvore(Arvg* pessoa);
Arvg* buscarPessoa(Arvg* pessoa, char* nome, char genero);
void listarAncestrais(Arvg* pessoa, char* nome, char genero);
Arvg* removerPessoa(Arvg* pessoa, char* nome, char genero);


#endif // TAD_H_INCLUDED
