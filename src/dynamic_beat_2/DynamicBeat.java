package dynamic_beat_2;

import javax.swing.JFrame;//crtl+shift+o : �ʿ��� Ŭ������ ���̺귯���� ����Ʈ �� �� �ִ�.

//JFrame�� Grapic User Interface�� ������� �۵��ϴ� ���α׷��� �����ϵ��� ���ش�.(�ؽ�Ʈ ��� ���α׷� X)
public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); //�ѹ� ������� ����â�� ����ڰ� ���Ƿ� ũ�⸦ ������ �� ����.
		setLocationRelativeTo(null); //����â�� ȭ�鿡 ���߾ӿ� �´�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����â�� ������ ���α׷��� ����ȴ�.
		setVisible(true); //����â�� ���� ���̰� ����.
		
	}
	
}
