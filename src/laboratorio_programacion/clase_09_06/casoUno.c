#include <stdio.h>

int main()
{
    int nota;
    printf("Ingrese calificación del examen (1-10): ");
    scanf("%d", &nota);

    if (nota >= 8)
    {
        printf("Promocionado\n");
    }
    else if (nota >= 6)
    {
        printf("Regular\n");
    }
    else
    {
        printf("Desaprobado / Recuperatorio\n");
    }
    return 0;
}