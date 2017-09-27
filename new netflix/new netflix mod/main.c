#include <stdio.h>
#include <stdlib.h>

// averiguar que es ABM = Alta Baja y Modificacion
 //  series con clientes
 // clientes con series

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

void mostraCyS(eCliente clientes[],eSeries series[]);
void mostraSyC(eSeries series[], eCliente clientes[]);

int contarSeries(eCliente clientes[]);


int main()
{
    int contaTbt = 0;

    eCliente clientes[10];//variables
    eSeries series[5];//variables

    cargarClientes(clientes);
    cargarSeries(series);

    mostrarClientes(clientes);
    mostrarSeries(series);
    mostraCyS(clientes, series);
    mostraSyC(series, clientes);

    contaTbt= contarSeries(clientes);//3
    printf("\n\nLa cantidad de clientes que ven The big bang theory es: %d\n", contaTbt);


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

void mostraCyS(eCliente clientes[],eSeries series[])
{
    int i, j;
    printf("\n**********************\nclientes con serie \n**********************\n");
    for(i=0; i<10; i++)
    {
        printf("%d\t%s\t", clientes[i].idCliente, clientes[i].nombre);
        for(j=0; j<5; j++)
        {
            if(clientes[i].idSerie== series[j].idSerie)
            {
                printf("\t%s\n", series[j].titulo);
                break;
            }
        }
    }
}
void mostraSyC(eSeries series[], eCliente clientes[])
{
    int i, j;
    printf("\n**********************\nseries con clientes \n**********************");
    for(i=0; i<5; i++)
    {
        printf("\n%s\t", series[i].titulo);
        for(j=0; j<10; j++)
        {
            if(series[i].idSerie==clientes[j].idSerie)
            {
                printf("%s\t", clientes[j].nombre);
            }
        }
    }
}

int contarSeries(eCliente clientes[])
{
    int i, contaser=0;
    for(i=0; i<10; i++)
    {
        if(clientes[i].idSerie==15 )
        {
            contaser++;
        }
    }
    return contaser;
}

void serieMenos(eSeries series[]))
{

}



