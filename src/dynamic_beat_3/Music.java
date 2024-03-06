package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {

	private Player player; //jLayer의 라이브러리 중 하나
	private boolean isLoop; //곡이 무한반복인지 한번만 재생되고 꺼지는지
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music (String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
	
	public int getTime() {
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); //해당 스레드를 중지한다.
	}
	
	@Override
	public void run() { //run은 Thread를 상속받으면 무조건 사용해야하는 함수
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while(isLoop); //isLoop가 true이면 곡이 무한반복
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}