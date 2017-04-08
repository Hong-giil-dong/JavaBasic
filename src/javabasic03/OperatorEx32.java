package javabasic03;
class OperatorEx32 {
	public static void main(String args[]) { 
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x; // x의 0보다 크면 양수로 표시하고 0보다 작으면 음수로 표시한다.
		// x는 10이므로 0보다 크고 양수 표시
		absY = y >= 0 ? y : -y; // y의 값이 0보다 크면 양수, 작으면 음수
		// y는 -5이므로 0보다 작고 음수 표시
		absZ = z >= 0 ? z : -z; // z값이 0보다 크면 양수, 적으면 음수로 표시
		//z는 0하고 같으므로 양수 표시

		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  //x의 값이 0보다 크면 0인지 비교해보고 0이면 공백 아니면 -를 붙인다
		// x는 10이므로 0보다 크므로 +가 붙음
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');  //y의 값이 0보다 크면 0인지 비교해보고 0이면 공백 아니면 -를 붙인다.
		// x는 -5고 0보다 작고 0하고 같지 않으므로 -가 붙음
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');  //z의 값이 0보다 크면 0인지 비교해보고 0이면 공백 아미면 -를 붙인다.
		// z는 0이고 0보다 크지않으며 0하고 같으므로 공백이 붙음

		System.out.printf("x=%c%d%n", signX, absX); 
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
}
