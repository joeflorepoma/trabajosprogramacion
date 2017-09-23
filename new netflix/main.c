#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int idCliente;
    char nombre[20];
    int idSerie;

} eCliente;

typedef struct
{
    int idSerie;
    char titulo[20];
    int temporadas;
    char genero[15];

} eSeries;


void cargarClientes(eCliente[]);
void cargarSeries(eSeries[]);

void mostrarClientes(eCliente[]);
void mostrarSeries(eSeries[]);


int main()
{
    eCliente clientes[10];
    eSeries series[5];

    cargarClientes(clientes);
    cargarSeries(series);
    mostrarClientes(clientes);
    mostrarSeries(series);


    return 0;
}

void cargarClientes(eCliente clientes[])
{
    int idCliente[10]= {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    char nombre[10][20]= {"Pedro Coco", "Juan Cruz", "Nahuel Raid", "Julio Cesar","Maria Nieves","Irma Om  ",
                            "Silvia Hertz", "Saul Raus", "Deby Bamio", "Ignacio Caron"};
    int idSerie[10]= {11, 11, 12, 12, 13, 13, 14, 15, 13, 15};

    int i;

    for(i=0; i<10; i++)
    {
        clientes[i].idCliente= idCliente[i];
        strcpy(clientes[i].nombre, nombre[i]);
        clientes[i].idSerie= idSerie[i];
    }

}

void cargarSeries(eSeries series[])
{
    int i;
    int idSerie[5]= {11, 12, 13, 14, 15};
    char titulo[5][20]= {"Game of Thrones", "friends   ", "Saenfield", "Prision Break", "The big bang t."};
    int temporadas[5]= {6, 10, 8, 4, 8};
    char genero[5][15]= {"Aventura", "Comedia ", "Comedia ", "Policial", "Comedia "};

    for(i=0; i<5; i++)
    {
        series[i].idSerie= idSerie[i];
        strcpy(series[i].titulo, titulo[i]);
        series[i].temporadas= temporadas[i];
        strcpy(series[i].genero, genero[i]);
    }


}

void mostrarSeries(eSeries series[])
{
    int i;
    printf("\n%s\n%s\n%s\n", "**********************","Mostrar series","**********************");
    for(i=0; i<5; i++)
    {
        printf("%d\t%s\t%d\t\n", series[i].idSerie, series[i].titulo, series[i].temporadas, series[i].genero);
    }
}

void mostrarClientes(eCliente clientes[])
{
    int i;
    printf("%s\n%s\n%s\n", "**********************","Mostrar clientes","**********************");
    for(i=0; i<10; i++)
    {
        printf("%d\t%s\t%d\t\n", clientes[i].idCliente, clientes[i].nombre, clientes[i].idSerie);
    }
}



