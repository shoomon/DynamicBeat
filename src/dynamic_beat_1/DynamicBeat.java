package dynamic_beat_1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;//crtl+shift+o : �ʿ��� Ŭ������ ���̺귯���� ����Ʈ �� �� �ִ�.

//JFrame�� Grapic User Interface�� ������� �۵��ϴ� ���α׷��� �����ϵ��� ���ش�.(�ؽ�Ʈ ��� ���α׷� X)
public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic; //������۸��� ���� ȭ�� ��ü�� �̹����� ��� �ν��Ͻ���

	private Image introBackground; //�߰��� �̹��������� ��� �ν��Ͻ�
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); //�ѹ� ������� ����â�� ����ڰ� ���Ƿ� ũ�⸦ ������ �� ����.
		setLocationRelativeTo(null); //����â�� ȭ�鿡 ���߾ӿ� �´�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����â�� ������ ���α׷��� ����ȴ�.
		setVisible(true); //����â�� ���� ���̰� ����.
		
		introBackground = new ImageIcon(Main.class.getResource("../images/IntroBackground.jpg")).getImage(); //introBackground���� �ʱ�ȭ
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	} //(������ ���)JFrame�� ��ӹ��� GUI��� ���ӿ��� ���� ó�� �׸��� �׷��ִ� �Լ�
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint(); //�ݺ������� paint�Լ� ȣ��
	}
	
}
