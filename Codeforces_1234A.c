#include <stdio.h>
#include <math.h>
int main() {
	int T;
	scanf("%d", &T);

	for (int test_case = 0; test_case < T; test_case++) {
		int n;
		int sum = 0;
		int c;
		scanf("%d", &n);
		for (int i = 0; i < n; i++) {
			scanf("%d", &c);
			sum += c;
		}
		printf("%d\n", (int)ceil( sum / (double)n));
	}
}