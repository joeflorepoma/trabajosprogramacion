#include <stdio.h>
#include <stdlib.h>

int main()
{

    int var = 9;
    int* pInt;
    pInt=&var;

    printf("%d\n", pInt);
    printf("%d\n", pInt+1);
    printf("%d\n", pInt+2);
    printf("%d\n", pInt+0);
    printf("%d\n", pInt-1);
    pInt++;
    printf("%d\n", pInt);
    printf("%d", pInt+1);

    return 0;
}
