#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

/*typedef struct
{
    int director;
    char nombre[20];
    char nacionalidad[20];
}eDirector;*/

typedef struct
{
    int idSerie;
    char titulo[20];
    int duracion;
    int temporadas;
} eSerie;
typedef struct
{
    int idCliente;
    char nombre[20];
    int serie;
}eCliente;

void cargarSeries(eSerie serie[], int);
void cargarClientes(eCliente cliente[], int);
void mostrarSeries(eSerie serie[], int);
void mostrarClientes(eCliente cliente[], int);
void mostrarClienteYSerie(eCliente cliente[],eSerie serie[], int, int);
