#include <stdio.h>
#include <stdlib.h>
void swap(int*n1, int*n2);

int main()
{
    int a = 9;
    int b = 14;

    swap(&a,&b);

    printf("a=%d - b=%d",a,b);


    return 0;
}

void swap(int*n1, int*n2)
{
    int aux;
    aux =*n1;
    *n1=*n2;
    *n2=aux;
}
