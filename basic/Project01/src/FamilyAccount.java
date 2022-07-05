
public class FamilyAccount {
	public static void main(String[] args) {
		boolean running = true;
		String details = "��֧\t�˻����\t��֧���\t˵   ��\n";
		int balance = 10000;
		
		while(running) {
			
			System.out.println("-----------------��ͥ��֧����-----------------");
			System.out.println("                  1 ��֧��ϸ");
			System.out.println("                  2 �Ǽ�����");
			System.out.println("                  3 �Ǽ�֧��");
			System.out.println("                  4 ��   ��\n");
			System.out.print("                   ��ѡ��(1-4)��");
			
			char selection = Utility.readMenuSelection();
			
			switch(selection) {
				case '1':
					System.out.println("-----------------��ǰ��֧��ϸ-----------------");
					System.out.println(details);
					System.out.println("--------------------------------------------");
					break;
				case '2':
					System.out.println("���������");
					int within = Utility.readNumber();
					System.out.println("��������˵����");
					String withinInfo = Utility.readString();
					
					balance += within;
					details += ("����\t"+balance+"\t"+within+"\t"+withinInfo+"\n");
					
					System.out.println("-------------------�Ǽ����-------------------");
					break;
				case '3':
					System.out.println("����֧����");
					int expend = Utility.readNumber();
					System.out.println("����֧��˵����");
					String expendInfo = Utility.readString();
					
					if(balance >= expend) {						
						balance -= expend;
						details += ("֧��\t"+balance+"\t"+expend+"\t"+expendInfo+"\n");
					} else {
						System.out.println("����");
					}
					
					System.out.println("-------------------�Ǽ����-------------------");
					break;
				case '4':
					System.out.println("ȷ���Ƿ��˳�(Y/N)");
					char isExit = Utility.readConfirmselection();
					
					if(isExit == 'Y') {						
						running = false;
					}
					break;
			}	
		}
	}
}
