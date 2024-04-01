#include <iostream>
#include <cstdlib> // for system function
using namespace std;

int main() {
    system("cls"); // Clear screen (Windows)

    int n, a[25], i, j, temp;
    cout << "Enter Number Of Elements:";
    cin >> n;
    cout << "\nEnter Array Elements:";
    for (i = 0; i < n; i++) {
        cin >> a[i];
    }

    // Bubble Sort
    for (i = 0; i < n; i++) {
        for (j = i + 1; j < n; j++) {
            if (a[i] > a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    // Display sorted elements
    cout << "\nSorted Elements Are:";
    for (i = 0; i < n; i++) {
        cout << a[i] << "\t";
    }

    cin.get(); // Pause the program

    return 0;
}
