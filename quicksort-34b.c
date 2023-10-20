#include <stdio.h>

void swap(int i, int j) {
    int temp;
    temp = i;
    i = j;
    j = temp;
}

void quicksort(int a[], int left, int right) {
    int i = left;
    int j = right;
    int temp;
    int flag = 0;
    while (flag != 1) {
        flag = 1;
        for (i = left; i < right; i++) {
            if (a[i] > a[i + 1]) {
                swap(a[i], a[i + 1]);

                flag = 0;
            }
        }
        for (j = right; j > left; j--) {
            if (a[j] < a[j - 1]) {
                swap(a[j], a[j - 1]);
                flag = 0;
            }
        }
    }
}

int main() {
    int a[10];
    int i;
    for (i = 0; i < 10; i++) {
        a[i] = i * i;
    }
    quicksort(a, 0, 9);
    for (int i = 0; i < 10; i++) {
        printf("%d ", a[i]);
    }
    return 0;
}
