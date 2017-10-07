#include <stdio.h>
#include <stdlib.h>
#include "conio.h"

int main()
{
    char letra;
    char*pChar;
    pChar=&letra;

    printf("Ingrese letras: \n");
    *pChar = getche();

    printf("%c", *pChar);
    return 0;
}
