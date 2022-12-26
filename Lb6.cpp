#include <iostream>
 
int main()
{
    int arr[] = { 15, 3, 7, 9, 2, 12, 17, 4, 8};
    int n = sizeof(arr) / sizeof(int);
 
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
 
    std::cout << sum;
 
    return 0;
}