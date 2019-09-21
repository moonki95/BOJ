#include <iostream>

using namespace std;

int main() {

	int num;
	int sum = 0;
	int arr[42] = {0,};
	for (int i = 0; i < 10; i++) {
		cin >> num;
		arr[num % 42] = 1;
	}
	for (int i = 0; i < 42; i++) {
		sum += arr[i];
	}
	cout << sum<<"\n";
	return 0;
}
