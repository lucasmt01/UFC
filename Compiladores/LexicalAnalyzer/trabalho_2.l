%{
#include<stdio.h>
int d_count = 0;
int o_count = 0;
int h_count = 0;
int f_count = 0;
int b_count = 0;
%}

%option noyywrap

%%

0[0-7]*    { o_count++; }
0[xX][0-9a-fA-F]+  { h_count++; }
[0-9]+\.[0-9]*     { f_count++; }
\.[0-9]+     { f_count++; }
[0-9]+     { d_count++; }

. ;


%%

int main() {
    yylex();
    printf("%d valores decimais\n", d_count);
    printf("%d valores octais\n", o_count);
    printf("%d valores hexadecimais\n", h_count);
    printf("%d valores reais\n", f_count);
    return 0;
}