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

int main()
{
    eJuegos juegos[CANTJUE] = {{1,"evil",123.123,1},
                                {2,"zelda",32.13,1},
                                {3,"pacman",11.32,1},
                                {4,"tetris",13.23,1},
                                {5,"caballeros", 154.33,1},
                                {6,"street",10.23,1},};
    //inicializarJuego(juegos, CANTJUE);

    eClientes clientes[CANTCLI] = {{1,"flores","joseph","alberti 965","1123948998",1},
                                    {2,"bodoque","benito","alberto 743","1123324334",1},
                                    {3, "poma","elizabeth","maipu 132","1143345445",1},};
    //inicializarClientes(clientes, CANTCLI);

    eAlquileres renta[CANTALQ];
    inicializarAlquiler(renta, CANTALQ);

    char opcion;

    do
    {
        printf("\n------------  MENU PRINCIPAL ------------");
        printf("\n1 - ABM JUEGOS \n2 - ABM CLIENTES \n3 - ABM ALQUILERES \nESC - SALIR\n\n\n");
        opcion = getch();

        switch(opcion)
        {
        case '1':
            system("cls");
            adminJuegos(juegos, CANTJUE);
            break;
        case '2':
            system("cls");
            adminClientes(clientes, CANTCLI);
            break;
        case '3':
            system("cls");
            adminAlquileres(renta,clientes,CANTALQ,CANTCLI);
            break;
        case ESC:
            system("cls");
            printf("\n\nPrograma finalizado.\n");
            system("pause");
            break;
        default:
            system("cls");
            printf("\n\nOpcion no encontrada, ingrese una opcion valida...\n");
            system("pause");
            break;
        }

    }
    while(opcion != ESC);

    return 0;
}
