package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		
		int monthSalary = 1000000;
		int totalAnnualSalary = monthSalary * 12;
		int tax = (totalAnnualSalary / 100) * 10;
		int annualSalaryAfterTax = totalAnnualSalary - tax;
		int bonus = (monthSalary / 10) * 2;
		int annualBonus = bonus * 4;
		int bonusTax = (annualBonus / 1000) * 55;
		int bonusAfterTax = annualBonus - bonusTax;
		int totalIncome = bonusAfterTax + annualSalaryAfterTax;
		
		System.out.println("���� :" + totalAnnualSalary + ", ���Ŀ��� : " + annualSalaryAfterTax);
		System.out.println("���ʽ� :" + annualBonus+ ", ���� ���ʽ� :" + bonusAfterTax);
		System.out.println("���޾� :" + (totalIncome));

	}

}
