#include <stdio.h>
#include <stdlib.h>

int pedirLetras(char*);

int main()
{
    char letras[10];

    if(pedirLetras(letras))
    {
        printf("%s", letras);

    }else{
        printf("no hay espacio de memoria");
    }

    return 0;
}

int pedirLetras(char* letra)
{
    int retorno = 0;

    if(letra!=NULL)
    {
        printf("Ingrese una palabra: ");
        fflush(stdin);
        scanf("%s", letra);

        retorno = 1;
    }

    return retorno;
}
