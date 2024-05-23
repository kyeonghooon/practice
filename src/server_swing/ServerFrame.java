package server_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;import javax.swing.event.AncestorListener;

public class ServerFrame extends JFrame {

	private JTextArea chatArea;
	private JScrollPane scrollPane;
	private JTextField portField;
	private JButton startButton;
	private JButton endButton;
	private MyThreadServer myThreadServer;
	private Thread serverThread;
	private ServerFrame mContext;

	public ServerFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		mContext = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);

		chatArea = new JTextArea();
		scrollPane = new JScrollPane(chatArea);
		scrollPane.setSize(500, 550);
		scrollPane.setLocation(50, 100);

		portField = new JTextField(20);
		portField.setSize(250, 20);
		portField.setLocation(200, 660);

		startButton = new JButton("서버 실행");
		startButton.setSize(150, 40);
		startButton.setLocation(100, 700);

		endButton = new JButton("서버 종료");
		endButton.setSize(150, 40);
		endButton.setLocation(280, 700);
	}

	private void setInitLayout() {
		setLayout(null); // 좌표값으로 배치
		setResizable(false); // 프레임 조절 불가
		setLocationRelativeTo(null); // JFrame을 모니터 가운데 자동 배치
		setVisible(true);

		add(scrollPane);
		add(portField);
		add(startButton);
		add(endButton);
	}

	private void addEventListener() {
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					chatArea.append("포트번호:[" + portField.getText() +"]를 시작합니다.\n");
					serverThread = new Thread(() -> {
						try {
							myThreadServer = new MyThreadServer(new ServerSocket(Integer.parseInt(portField.getText())),
									mContext);
							myThreadServer.run();
						} catch (NumberFormatException e1) {
							e1.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					serverThread.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		endButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	public static void main(String[] args) {
		new ServerFrame();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(new Font("볼드", Font.BOLD, 12));
		g.setColor(new Color(50, 50, 195));
		g.drawString("PORT NUMBER  :", 90, 705);
	}

	public JTextArea getChatArea() {
		return chatArea;
	}

}
