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
		
		System.out.println("연봉 :" + totalAnnualSalary + ", 세후연봉 : " + annualSalaryAfterTax);
		System.out.println("보너스 :" + annualBonus+ ", 세후 보너스 :" + bonusAfterTax);
		System.out.println("지급액 :" + (totalIncome));

	}

}
