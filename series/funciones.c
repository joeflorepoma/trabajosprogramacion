#include "funciones.h"
#include "string.h"


void cargarClientes(eCliente clientes[])
{
    int idCliente[10]= {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    char nombre[10][20]= {"Pedro Coco", "Juan Cruz", "Nahuel Raid", "Julio Cesar","Maria Nieves","Irma Om  ", "Silvia Hertz", "Saul Raus", "Deby Bamio", "Ignacio Caron"};
    int estado[10]= {1, 1, 1, 0, 0, 1, 1, 0, 1, 1};
    int idSerie[10]= {11, 11, 12, 12, 13, 13, 14, 15, 13, 15};
    int i;


    for(i=0; i<10; i++)
    {
        clientes[i].idCliente= idCliente[i];
        strcpy(clientes[i].nombre, nombre[i]);
        clientes[i].estado= estado[i];
        clientes[i].idSerie= idSerie[i];
    }
};

void cargarSerie(eSerie series[])
{
    int i;
    int idSerie[5]= {11, 12, 13, 14, 15};
    char titulo[5][20]= {"Game of Thrones", "friends   ", "Saenfield", "Prision Break", "The big bang t."};
    int temporadas[5]= {6, 10, 8, 4, 8};
    char genero[5][15]= {"Aventura", "Comedia ", "Comedia ", "Policial", "Comedia "};
    int estado[5]= {1, 1, 0, 1, 1};


    for(i=0; i<5; i++)
    {
        series[i].idSerie= idSerie[i];
        strcpy(series[i].titulo, titulo[i]);
        series[i].temporadas= temporadas[i];
        strcpy(series[i].genero, genero[i]);
        series[i].estado= estado[i];
    };

}

void mostrarSerie(eSerie series[], int tam)
{
    int i;
    printf("Series\n");
    for(i=0; i<tam; i++)
    {
        printf("%s\t\t%d\t%s\t%d\n", series[i].titulo, series[i].temporadas, series[i].genero, series[i].estado);
    };
}

void mostrarClientes(eCliente clientes[], int tam)
{
    int i;
    printf("*************************************************************************************\nclientes\n");
    for(i=0; i<tam; i++)
    {
        printf("%d\t%s\t%d\t%d\n", clientes[i].idCliente, clientes[i].nombre, clientes[i].estado, clientes[i].idSerie);
    };
}

void mostraCyS(eCliente clientes[],eSerie series[], int tamc, int tams)
{
    int i, j, contaSaen;
    printf("*************************************************************************************\nclientes con serie \n");
    for(i=0; i<tams; i++)
    {
        printf("%d\t%s\t", clientes[i].idCliente, clientes[i].nombre);
        for(j=0; j<tamc; j++)
        {
            if(clientes[i].idSerie== series[j].idSerie)
            {
                printf("\t%s\n", series[j].titulo);
                break;
            }
        }
    };
}

void mostraSyC(eSerie series[], eCliente clientes[], int tams, int tamc)
{
    int i, j;
    printf("*************************************************************************************\nseries con clientes \n");
    for(i=0; i<tams; i++)
    {
        printf("\n%s\t", series[i].titulo);
        for(j=0; j<tamc; j++)
        {
            if(series[i].idSerie==clientes[j].idSerie)
            {
                printf("%s\t", clientes[j].nombre);
            }
        }
    };
}


int contarSeries(eCliente clientes[], int tamc, int ser)
{
    int i, contaser=0;
    for(i=0; i<tamc; i++)
    {
        if(clientes[i].idSerie==ser )
        {
            contaser++;
        }
    }
    return contaser;
};


void mostraSercli(eSerCli sercli[], int tams)
{
    int i;
    printf("*************************************************************************************\nseries con clientes \n");
    for(i=0; i<tams; i++)
    {
        printf("\n%d\t%d", sercli[i].idCliente, sercli[i].idSerie);
    };
}

void contarSercli(eSerCli sercli[], int tams)
{
    int i;
    printf("*************************************************************************************\nseries con clientes numeros \n");
    for(i=0; i<tams; i++)
    {
        printf("\n%d\t%d", sercli[i].idCliente, sercli[i].idSerie);
    };


}


//void cargarconser(eContador contador[],eCliente clientes[],eSerie series[],int tams)
//{
 //   int i, j:
 //   for(i=0; i<tams; i++)
  //  {

  //      eContador[i].idSerie = eSerie[i].idSerie;
  //      eContador[i].idCliente= eCliente[i].idCliente;
  //      for(j=0; j<tams; j++)
 //       {
  //          if(series[i].idSerie==clientes[j].idSerie)
 //           {
 //               eContador[i].contador++;
 //           }
 //       }
 //   };


    // int i, j;
    //for(i=0; i<tams; i++)
    //{
    //  for(j=0; j<tamc; j++)
    //  {
    //     if(series[i].idSerie==clientes[j].idSerie)
    //     {
    //         contador[i].contador++;
    //    }
    // }
    // };




