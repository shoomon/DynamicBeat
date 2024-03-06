package dynamic_beat_1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;//crtl+shift+o : 필요한 클래스를 라이브러리로 임포트 할 수 있다.

//JFrame은 Grapic User Interface를 기반으로 작동하는 프로그램을 동작하도록 해준다.(텍스트 기반 프로그램 X)
public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic; //더블버퍼링을 위해 화면 전체의 이미지를 담는 인스턴스들

	private Image introBackground; //추가한 이미지파일을 담는 인스턴스
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); //한번 만들어진 게임창은 사용자가 임의로 크기를 조절할 수 없음.
		setLocationRelativeTo(null); //게임창이 화면에 정중앙에 온다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임창을 닫으면 프로그램이 종료된다.
		setVisible(true); //게임창이 눈에 보이게 해줌.
		
		introBackground = new ImageIcon(Main.class.getResource("../images/IntroBackground.jpg")).getImage(); //introBackground변수 초기화
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	} //(정해진 약속)JFrame을 상속받은 GUI기반 게임에서 가장 처음 그림을 그려주는 함수
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint(); //반복적으로 paint함수 호출
	}
	
}
