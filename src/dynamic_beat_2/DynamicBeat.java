package dynamic_beat_2;

import javax.swing.JFrame;//crtl+shift+o : 필요한 클래스를 라이브러리로 임포트 할 수 있다.

//JFrame은 Grapic User Interface를 기반으로 작동하는 프로그램을 동작하도록 해준다.(텍스트 기반 프로그램 X)
public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); //한번 만들어진 게임창은 사용자가 임의로 크기를 조절할 수 없음.
		setLocationRelativeTo(null); //게임창이 화면에 정중앙에 온다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임창을 닫으면 프로그램이 종료된다.
		setVisible(true); //게임창이 눈에 보이게 해줌.
		
	}
	
}
