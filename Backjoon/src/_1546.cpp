#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int N; // 시험본 과목의 개수
	
	cin >> N;
	float *grade; // 현재 성적
	float *new_grade; // 갱신 성적
	float sum = 0.0;
	float average = 0.0;
	grade = new float[N];
	new_grade = new float[N];
	for (int i = 0; i < N; i++) {
		cin >> grade[i];
		
	}

	float max = grade[0];

	for (int i = 1; i < N; i++) {
		if (max < grade[i]) {
			max = grade[i];
		}
	}

	for (int i = 0; i < N; i++) { // 성적 조작
		new_grade[i] = (grade[i] / max) * 100;
		sum += new_grade[i];
	}

	average = (sum / N);

	cout << average << endl;
}

