
public class FamilyAccount {
	public static void main(String[] args) {
		boolean running = true;
		String details = "收支\t账户金额\t收支金额\t说   明\n";
		int balance = 10000;
		
		while(running) {
			
			System.out.println("-----------------家庭收支记账-----------------");
			System.out.println("                  1 收支明细");
			System.out.println("                  2 登记收入");
			System.out.println("                  3 登记支出");
			System.out.println("                  4 退   出\n");
			System.out.print("                   请选择(1-4)：");
			
			char selection = Utility.readMenuSelection();
			
			switch(selection) {
				case '1':
					System.out.println("-----------------当前收支明细-----------------");
					System.out.println(details);
					System.out.println("--------------------------------------------");
					break;
				case '2':
					System.out.println("本次收入金额：");
					int within = Utility.readNumber();
					System.out.println("本次收入说明：");
					String withinInfo = Utility.readString();
					
					balance += within;
					details += ("收入\t"+balance+"\t"+within+"\t"+withinInfo+"\n");
					
					System.out.println("-------------------登记完成-------------------");
					break;
				case '3':
					System.out.println("本次支出金额：");
					int expend = Utility.readNumber();
					System.out.println("本次支出说明：");
					String expendInfo = Utility.readString();
					
					if(balance >= expend) {						
						balance -= expend;
						details += ("支出\t"+balance+"\t"+expend+"\t"+expendInfo+"\n");
					} else {
						System.out.println("余额不足");
					}
					
					System.out.println("-------------------登记完成-------------------");
					break;
				case '4':
					System.out.println("确认是否退出(Y/N)");
					char isExit = Utility.readConfirmselection();
					
					if(isExit == 'Y') {						
						running = false;
					}
					break;
			}	
		}
	}
}
