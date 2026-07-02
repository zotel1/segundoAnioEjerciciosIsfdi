#include <stdio.h>

int main() {
    // Bucle for
    printf("Conteo for: ");
    for (int i = 1; i <= 5; i++) {
        printf("%d ", i);
    }
    
    // Bucle while
    printf("\nConteo while: ");
    int count = 5;
    while(count > 0) {
        printf("%d ", count);
        count--;
    }
    printf("\n");
    return 0;
}