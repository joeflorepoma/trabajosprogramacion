#include<stdio.h>
#include<conio.h>
#include<string.h>

#define T 5
int main()
{

    float precio[T]= {2.5,8,1,1,3}, auxP;
    int i,j,aux, opcion;
    char nombre[T][20], auxN[20], seguir='s';

    strcpy(nombre[0],"Sugus");
    strcpy(nombre[1],"Jorgito");
    strcpy(nombre[2],"Jorgito");
    strcpy(nombre[3],"Paso de los toros");
    strcpy(nombre[4],"Jorgito");

    for(i=0; i<T-1; i++)
    {
        for(j=i+1; j<T; j++)
        {
            if(strcmp(nombre[i], nombre[j])>0)
            {

                strcpy(auxN, nombre[i]);
                strcpy(nombre[i], nombre[j]);
                strcpy(nombre[j], auxN);


                auxP = precio[i];
                precio[i] = precio[j];
                precio[j] = auxP;

            }
            else
            {
                if(strcmp(nombre[i], nombre[j])==0)
                {
                    if(precio[i]>precio[j])
                    {
                        auxP = precio[i];
                        precio[i] = precio[j];
                        precio[j] = auxP;
                    }

                }
            }
        }
    }

    for(i=0; i<T; i++)
    {
        printf("%s\t\t\t%f\n", nombre[i], precio[i]);
    }
    return 0;
}
