#include "string.h"

typedef struct
{
    int idSerie;
    char titulo[20];
    int temporadas;
    char genero[15];
    int estado;
} eSerie;

typedef struct
{
    int idCliente;
    char nombre[20];
    int estado;
    int idSerie;
} eCliente;

typedef struct
{
    int idSerie;
    int idCliente;
    int contador;
}eContador;

typedef struct
{
    int idSerie;
    int idCliente;
}eSerCli;

void cargarSerie(eSerie Series[]);
void cargarClientes(eCliente x[]);

void mostrarSerie(eSerie[], int);
void mostrarClientes(eCliente[], int);
void mostraSercli(eSerCli[], int);

void mostraCyS(eCliente[], eSerie[], int, int);
void mostraSyC(eSerie[], eCliente[], int, int);

int contarSeries(eCliente[], int, int);

void cargarconser(eContador[],eCliente[],eSerie[],int)



