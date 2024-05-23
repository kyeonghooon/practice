package server_swing;

import java.io.IOException;
import java.net.ServerSocket;

public class MyThreadServer extends AbstractServer {
	
	public MyThreadServer(ServerSocket serverSocket, ServerFrame frame) {
		super(serverSocket, frame);
	}
	
	@Override
	protected void setupServer() throws IOException {
		// 추상 클래스 --> 부모 -- 자식 (부모 기능의 확장 또는 사용)
		// 서버측 소켓 통신 -- 준비물 : 서버 소켓
		super.setServerSocket(new ServerSocket(5000));
		System.out.println(">>> Server started on port 5000 <<<");
	}

	@Override
	protected void connection() throws IOException {
		// 서버 소켓.accept() 호출이다
		frame.getChatArea().append("사용자의 접속을 기다립니다.\n");
		super.setSocket(super.getServerSocket().accept());
		frame.getChatArea().append("사용자와 연결완료\n");
		System.out.println(">>> 클라이언트와 연결됨 <<<");
	}
	
//	public static void main(String[] args) {
//		MyThreadServer myThreadServer = new MyThreadServer();
//		myThreadServer.run();
//	}
}
