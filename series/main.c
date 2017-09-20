#include <stdio.h>
#include <stdlib.h>
#include "funciones.h"
#include "string.h"



int main()
{
    int contaSaen=0, contaGot=0, contaFre=0, contaPb=0, contaTnt=0;


    eSerie series[5];
    eCliente clientes[10];
    eContador contador[5];



    cargarSerie(series);
    cargarClientes(clientes);



    mostrarSerie(series, 5);
    mostrarClientes(clientes, 10);
    mostraCyS(clientes, series, 5, 10);
    mostraSyC(series, clientes, 5, 10);
    mostraSercli(sercli, 20);


    contaSaen= contarSeries(clientes, 10, 13);//3
    printf("\n\nLa cantidad de clientes que ven Saenfield es: %d\n", contaSaen);


   //cargarconser(contador, clientes, series, 10);


    return 0;
}

