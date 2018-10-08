#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

#include "validaciones.h"
#include "juegos.h"
#include "clientes.h"
#include "alquileres.h"

#define CANTJUE 6
#define CANTCLI 3
#define CANTALQ 18
#define ESC 27

/** \brief Inicializa el estado en un array de gamess
 * \param games el array donde hay que buscar
 * \param cantidad la longitud del array
 * \return devuelve void
 */

void inicializarAlquiler(eAlquileres rent[], int cantidad)
{
    int i;

    for(i=0; i<cantidad; i++)
    {
        rent[i].estado = 0;
    }
}

/** \brief busca el primer lugar libre en el array
 * \param games el array donde se va a buscar
 * \param cantidad indica la longitud del array
 * \return  -1 si no hay espacio libre y (i) si hay la posicion del mismo
 */

int buscarEspacioLibreAlquiler(eAlquileres rent[], int cantidad)
{
    int i;
    int indice = -1;// devuelve -1 si no hay mas espaciop libre

    for(i=0; i<cantidad; i++)
    {
        if(rent[i].estado == 0)
        {
            indice = i;// devolvera cualquier otro numero si encuentra un espacio libre
            break;
        }
    }
    return indice;
}

/**
 * \brief Busca la primer ocurrencia de un libro mediante su codigo
 * \param games Es el array en el cual buscar
 * \param cantidad Indica la logitud del array
 * \param codigo Es el valor que se busca
 * \return Si no hay ocurrencia (-1) y si la hay la posicion de la misma (i)
 */


int buscarAlquilerPorCodigo(eAlquileres rent[], int cantidad, int auxCodAlquiler)
{
    int i;
    int indice = -1;// el id no esta en la base de datos

    for(i=0; i<cantidad; i++)
    {
        if(rent[i].estado == 1 && rent[i].CodigoAlquiler == auxCodAlquiler)
        {
            indice = i;// se encontro el id en la base de datos
            break;
        }
    }
    return indice;
}

void mostrarUnAlquiler(eAlquileres rent)
{
    printf("\n | %6d  | %10d | %10d | %10d | %10d | %10d |\n", rent.CodigoAlquiler, rent.idCliente, rent.idJuego, rent.date.dia, rent.date.mes, rent.date.anio);
}

void ingresoDatosAlquileres(eAlquileres rent[],int espacioLibre, int auxCodAlquiler, int auxIdCliente, int auxIdJuego, int auxDia, int auxMes, int auxAnio)
{
    rent[espacioLibre].CodigoAlquiler = auxCodAlquiler;
    rent[espacioLibre].idCliente = auxIdCliente;
    rent[espacioLibre].idJuego = auxIdJuego;
    rent[espacioLibre].date.dia = auxDia;
    rent[espacioLibre].date.mes = auxMes;
    rent[espacioLibre].date.anio = auxAnio;
    rent[espacioLibre].estado = 1;
}

void altaAlquiler(eAlquileres rent[], eClientes client[], int cantidad, int cantClientes, int auxCodAlquiler, int auxIdCliente, int auxIdJuego, int auxDia, int auxMes, int auxAnio)
{
    int espacioLibre;
    int busqueda;

    system("cls");

    printf("\n\t-----Alta de Alquileres-----\t\n\n");


    espacioLibre = buscarEspacioLibreAlquiler(rent, cantidad);

    if(espacioLibre == -1)
    {
        printf("\nNo queda memoria libre...\n\n");
    }
    else
    {
        auxCodAlquiler = getValidInt("\nIngresa codigo de Alquiler: \n", "\nIngrese solo numeros\n\n", 1, 1000);

        busqueda = buscarAlquilerPorCodigo(rent, cantidad, auxCodAlquiler);

        if(busqueda != -1)
        {
            printf("\nEl Codigo Ingresado ya existe.\n");
            printf("\n | %6s  | %11s | %11s | %11s | %11s | %11s \n", "Cod. alquiler", "Cod.Cliente", "Cod. juego", "Dia", "Mes", "anio");
            mostrarUnAlquiler(rent[busqueda]);

        }
        else
        {
            auxIdCliente = getValidInt("Ingrese el codigo de cliente: \n", "\nIngrese solo numeros.\n", 1, 10000);
            auxIdJuego = getValidInt("Ingrese el codigo de juego; \n", "\nIngrese solo numeros.\n", 1, 10000);
            auxDia = getValidInt("Ingrese el dia: \n", "\nIngrese solo numeros.\n", 1, 31);
            auxMes = getValidInt("Ingrese el mes: \n", "\nIngrese solo numeros.\n", 1, 12);
            auxDia = getValidInt("Ingrese el anio: \n", "\nIngrese solo numeros.\n", 1, 9999);

            ingresoDatosAlquileres(rent, espacioLibre, auxCodAlquiler, auxIdCliente, auxIdJuego, auxDia, auxMes, auxAnio);
        }
    }

    system("pause");
}

void adminAlquileres(eAlquileres rent[], eClientes client[], int cantidad, int cantClientes)
{

    int auxCodigoAlquiler = 0;
    int auxIdCliente = 0;
    int auxIdJuego = 0;
    int auxDia = 0;
    int auxMes = 0;
    int auxAnio = 0;

    char opcion;

    do
    {
        system("cls");
        printf("\n-------\tABM ALQUILERES\t-------\n");
        printf("\n1.- Alta: \n2.- Modificacion : \n3.- Baja : \n4.- Listar: \nESC.- Para salir...\n\n");

        opcion = getch();

        switch(opcion)
        {
        case '1':
            altaAlquiler(rent, client, cantidad, cantClientes,auxCodigoAlquiler,auxIdCliente,auxIdJuego,auxDia,auxMes,auxAnio);

            break;
        case '2':

            break;
        case '3':

            break;
        case '4':

            break;
        case ESC:
            system("cls");
            break;
        default:
            system("cls");
            printf("\n\nOpcion no encontrada, ingrese una opcion valida...\n");
            system("pause");
            break;
        }

    }
    while(opcion != ESC);
}

