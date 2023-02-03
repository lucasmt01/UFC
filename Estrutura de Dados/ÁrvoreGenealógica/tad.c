#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "tad.h"

Arvg* adicionar(Arvg* pessoa, char* nome, char genero){
    if(pessoa == NULL){
        Arvg* novo = (Arvg*) malloc(sizeof(Arvg));
        strcpy(novo->nome,nome);
        novo->genero = genero;
        novo->mae = NULL;
        novo->pai = NULL;
        return novo;
    }
    else{
        if(genero == 'F' || genero == 'f'){
            pessoa->mae = adicionar(pessoa->mae, nome, 'f'); // esquerda
        }
        else if(genero == 'M' || genero == 'm'){
            pessoa->pai = adicionar(pessoa->pai, nome, 'm'); // direita
        }
        return pessoa;
    }
}
void listarTudo(Arvg* pessoa){
    if(pessoa){
        printf("%s ", pessoa->nome);
        listarTudo(pessoa->mae);
        listarTudo(pessoa->pai);
    }
}

int altura(Arvg* pessoa){
    if(pessoa == NULL){
        return -1;
    }
    else{
        int esquerda = altura(pessoa->mae);
        int direita = altura(pessoa->pai);
        if(esquerda > direita){
            return esquerda+1;
        }
        else{
            return direita+1;
        }
    }
}

int contaPessoas(Arvg* pessoa){
    if(pessoa == NULL){
        return 0;
    }
    else{
        return 1 + contaPessoas(pessoa->mae) + contaPessoas(pessoa->pai);
    }
}

void apagarArvore(Arvg* pessoa)
{
    if (pessoa!=NULL)
    {
        apagarArvore(pessoa->mae);
        apagarArvore(pessoa->pai);
        pessoa->nome[0] = '\0';
        pessoa->genero = '\0';
        pessoa->mae = NULL;
        pessoa->pai = NULL;
        free(pessoa);
    }
}

Arvg* buscarPessoa(Arvg* pessoa, char* nome, char genero){
    while(pessoa){
        if(strcasecmp(pessoa->nome,nome) != 0 && genero == 'F'){
            pessoa = pessoa->mae;
        }
        else if(strcasecmp(pessoa->nome,nome) != 0 && genero == 'M'){
            pessoa = pessoa->pai;
        }
        else{
            return pessoa;
        }
    }
    return NULL;
}

void listarAncestrais(Arvg* pessoa, char* nome, char genero){
    Arvg* busca = buscarPessoa(pessoa,nome,genero);

    if(busca){
        listarTudo(busca);
    }
    else{
        printf("Pessoa fora da árvore genealógica");
    }
}

Arvg* removerPessoa(Arvg* pessoa, char* nome, char genero){
    if(pessoa == NULL){
        printf("Pessoa não encontrada");
        return NULL;
    }
    else{
        if(strcasecmp(pessoa->nome,nome) == 0){
                //Remove uma pessoa sem pai e mãe
            if(pessoa->mae == NULL && pessoa->pai == NULL){
                free(pessoa);
                return NULL;
            }
            else{
                //Remove uma pessoa que possui somente 1 pai ou mãe
                if(pessoa->mae == NULL || pessoa->pai == NULL){
                    Arvg* aux;
                    if(pessoa->mae != NULL){
                        aux = pessoa->mae;
                    }
                    else{
                        aux = pessoa->pai;
                    }
                    free(pessoa);
                    return aux;
                }
                else{
                    printf("Remover o indivíduo principal da árvore genealógica desconfigura a lógica pai e mãe...");
                    return pessoa;
                }
            }
        }
        else{
            if(genero == 'F'){
                pessoa->mae = removerPessoa(pessoa->mae, nome, 'F');
            }
            else{
                pessoa->pai = removerPessoa(pessoa->pai, nome, 'M');
            }
            return pessoa;
        }
    }
}






