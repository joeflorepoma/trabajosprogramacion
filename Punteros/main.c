#include <stdio.h>
#include <stdlib.h>
#define TAM 5

void mostrarVector(int*, int);
void cargarVector(int*, int);
int ordenarYSumar(int*, int);



void swap(int*, int*);
int main()
{
    int vector[TAM];
    int suma;
    cargarVector(vector, TAM);

    suma=ordenarYSumar(vector, TAM);
    printf("La suma es: %d\n", suma);
    mostrarVector(vector,TAM);

    return 0;
}

void mostrarVector(int* miVector, int t)
{
    int i;
    for(i=0; i<t; i++)
    {
        printf("%d\n", *(miVector+i));

    }
}

void cargarVector(int* miVector, int t)
{
    int i;
    for(i=0; i<t; i++)
    {
        printf("Ingrese un numero: ");
        scanf("%d", miVector+i);
    }
}

int ordenarYSumar(int* miVector, int t)
{
    int i, j;
    int suma = 0;

    for(i=0; i<t-1; i++)
    {
        for(j=i+1; j<t; j++)
        {
            if(*(miVector+i)>*(miVector+j))
            {
                swap(miVector+i, miVector+j);
            }
        }
    }

    for(i=0; i<t; i++)
    {
        suma+=*(miVector+i);
    }

    return suma;

}
void swap(int* numero1, int* numero2)
{
    int aux;

    aux = *numero1;
    *numero1 = *numero2;
    *numero2 = aux;
}
