package zz.test;
//average类

import java.util.Scanner;

@Deprecated
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total total = new Total();
		total.setInput(0);
		total.setValid(0);
		int [] value = new int[100];
		double sum = 0;
		double average = 0;
		int i = 1;
		
		//获取输入流
		Scanner scanner = new Scanner(System.in); 
		System.out.println("请输入值域最小值：\n ");
		int minimum = scanner.nextInt();
		System.out.println("请输入值域最大值： \n");
		int maximum = scanner.nextInt();
		
		do {
					System.out.println("请输入有效值并以-999结束 \n");
					value[i] = scanner.nextInt();	
					System.out.println("========:  " + i);
		if (value[i] >= minimum && value[i] <= maximum) {
			total.setValid(total.getValid()+1);
			sum = sum + value[i];
		}
		i++;
		total.setInput(i); //本来没有，但我觉得要加
		} while (value[i-1] != -999 && total.getInput()<100);
		
		if (total.getValid() > 0) {
			average = sum / total.getValid();
			System.out.println("平均值为： "+average);
			System.out.println("有效数字总和： "+sum);
			System.out.println("有效数字个数： "+total.getValid());
		}else {
			average = -999;
			System.out.println("计算错误，数值超出范围或其他原因！");
		}
	}

}


