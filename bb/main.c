#include <stdio.h>
#include <stdlib.h>

int main()
{
    int var=9;
    int*pInt;
    printf("%d\n",pInt);


    pInt=&var;
    printf("%d\n",var);
    printf("%d\n",*pInt);

    *pInt=85;

    printf("%d\n",var);
    printf("%d\n",*pInt);
    printf("%p\n",&var);
    printf("%p\n",pInt);
    printf("%p",&pInt);


    return 0;
}
