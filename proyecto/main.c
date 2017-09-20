#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct
{
    int idCliente;
    char nombre[30];
    int serie;



} eCliente;

typedef struct
{
    int id;
    char titulo[20];
    int duracion;
    int temporadas;
    int director;


} eSeries;

void inicializar(eCliente[]);
void mostrarDatos(eCliente[]);

int main()
{
    int opcion;
    eCliente clientes[5];

    do
    {
        printf("1.Cargar\n2.Mostrar datos\n8.Salir\nElija una Opcion: ");
        scanf("%d", &opcion);

        switch(opcion)
        {
        case 1:
            inicializar(clientes);
            break;
        case 2:
            mostrarDatos(clientes);
            break;
        }
    }
    while(opcion!=8);

    return 0;

}

void inicializar(eCliente clientes[])
{
    int idClienteHc[] = {100, 101, 102, 103};
    char nombresHc[][50] = {"juan", "diego", "joe", "luis","jorge"};
    int seriesHc[]= {1, 1, 2, 3, 4};
    int i;

    for(i=0; i<5; i++)
    {
        clientes[i].idCliente=idClienteHc[i];
        strcpy(clientes[i].nombre,nombresHc[i]);
        clientes[i].serie=seriesHc[i];
    }

}

void mostrarDatos(eCliente clientes[])
{
    int i;

    for(i=0; i<5; i++)
    {
        printf("%d--%s--%d\n", clientes[i].idCliente, clientes[i].nombre, clientes[i].serie);
    }

}


