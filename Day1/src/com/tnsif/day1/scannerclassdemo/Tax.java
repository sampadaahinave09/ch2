//declration and scanner class
package com.tnsif.day1.scannerclassdemo;

public class Tax {
	public void calTax(Person p)
	{
		if(p.getAge()>65 || p.getGender().equals("Female"))
		{
			p.setTax(0);
			System.out.println("No tax");
		}else {
			if(p.getIncome() < 160000)
			{
				p.setTax(0);
				System.out.println("Tax not payable");
			}else if(p.getIncome() > 160000 && p.getIncome() <= 500000)
			{
				p.setTax((p.getIncome() - 160000) * 10/100);
				
			}else if(p.getIncome() > 160000 && p.getIncome() <= 800000)
			{
				p.setTax((p.getIncome() - 160000) * 20/100);
				
			}else
			{
				p.setTax((p.getIncome() - 160000) * 30/100);

			}
		}
 }
	

}
