package onboarding;

import java.util.List;

class Problem1 {
	public static int solution(List<Integer> pobi, List<Integer> crong) {
		int answer = Integer.MAX_VALUE;      

		// ����ó�� �ڵ�
		if(checkException(pobi, crong) == -1) {
			return -1;
		}

		return answer;
	}

	// ���� ó�� �޼ҵ�
	public static int checkException(List<Integer> pobi, List<Integer> crong) {
		int result = 0;

		// ������ �������� ¦������ Ȯ��
		if(pobi.get(1) % 2 != 0 || crong.get(1) % 2 != 0) {
			return -1;
		}

		// ������ �������� ���� ���������� ū��, ���̰� 1���� Ȯ��
		if(pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1) {
			return -1;
		}

		// �� ������ �� 1������, Ȥ�� 400�������� �ִ��� Ȯ��
		if(pobi.get(0) == 1 || pobi.get(1) == 400) {
			return -1;
		}

		if(crong.get(0) == 1 || crong.get(1) == 400) {
			return -1;
		}

		return result;
	}
}