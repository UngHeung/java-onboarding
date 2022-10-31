package onboarding;

import java.util.List;

class Problem1 {
	public static int solution(List<Integer> pobi, List<Integer> crong) {
		int answer = Integer.MAX_VALUE;      

		// ����ó�� �ڵ�
		if(checkException(pobi, crong) == -1) {
			return -1;
		}

		// ��ȯ ���� �����ϴ� �ڵ�(���� Ȯ��)
		answer = compareValue(pageMaxValue(pobi), pageMaxValue(crong));

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

	// �ִ� ���� ���ϴ� �޼ҵ�
	public static int pageMaxValue(List<Integer> page) {
		// �ִ� ��
		int maxValue = 0;
		// ��� ���� �� �� �ִ� ��
		int totalAddition = 0;
		// ��� ���� �� �� �ִ� ��
		int totalMultiplication = 0;

		for(int i = 0; i < 2; i++) {
			// ���� ��
			int additionValue = 0;
			// ���� ��
			int multiplicationValue = 0;

			additionValue = page.get(i) % 10;
			multiplicationValue = page.get(i) % 10;

			// �� �ڸ� �̻��� ���
			if(9 < page.get(i)) {
				additionValue += page.get(i) % 100 / 10;
				multiplicationValue *= page.get(i) % 100 / 10;
			}

			// �� �ڸ� �̻��� ���
			if(99 < page.get(i)) {
				additionValue += (page.get(i) / 100);
				multiplicationValue *= (page.get(i) / 100);
			}

			// �� ������ �� ��� ���� �� �� ���� ū ��
			if(totalAddition < additionValue) {
				totalAddition = additionValue;
			}

			// �� ������ �� ��� ���� �� �� ���� ū ��
			if(totalMultiplication < multiplicationValue) {
				totalMultiplication = multiplicationValue;
			}
		}

		// ���� ���� �ִ� ���� ���� ���� �ִ� �� �� �� ū ��
		if(totalAddition >= totalMultiplication) {
			maxValue = totalAddition;
		}

		if(totalMultiplication >= totalAddition) {
			maxValue = totalMultiplication;
		}

		return maxValue;
	}

	// ���ڸ� ���ϴ� �޼ҵ�
	public static int compareValue(int pobi, int crong) {
		int result = 0;
		
		// ���� ��
		if (pobi > crong) {
			result = 1;
		}

		// ũ�� ��
		if (crong > pobi) {
			result = 2;
		}

		// ���º�
		if (pobi == crong) {
			result = 0;
		}

		return result;
	}
}