package com.lizewu.thread;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bounce {
	
	
	
	public Bounce() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		JFrame frame = new BounceFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class BallRunnable implements Runnable
{
	private Ball ball;
	private Component component;
	public static final int STEPS = 1000;
	public static final int DELAY = 20;
	public BallRunnable(Ball aBall,Component aComponent)
	{
		this.ball = aBall;
		this.component = aComponent;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			for(int i = 1;i <= STEPS; i++)
			{
				ball.move(component.getBounds());
				component.repaint();
				Thread.sleep(DELAY);
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
class Ball
{
	private static final int XSIZE = 15;
	private static final int YSIZE = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;
	
	/*
	 * 如果碰到边界，就会返回
	 */
	public void move(Rectangle2D bounds)
	{
		x += dx;
		y += dy;
		if (x < bounds.getMinX())
		{
			x = bounds.getMinX();
			dx = -dx;
		}
		if (x + XSIZE >= bounds.getMaxX())
		{
			x = bounds.getMaxX() - XSIZE;
			dx = -dx;
		}
		if(y < bounds.getMinY())
		{
			y = bounds.getMinY();
			dy = -dy;
		}
		if(y + YSIZE >= bounds.getMaxY())
		{
			y = bounds.getMaxX() - YSIZE;
			dy = -dy;
		}
	}
	/**
	 * 根据当前坐标得到球的形状在
	 */
	public Ellipse2D getShape()
	{
		return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
	}
}

/**
 * 
 * 画出球的面板
 * 
 */
 class BallPanel extends JPanel
 {
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	 
	/**
	 * 把球放到面板上
	 * 
	 * @param b 添加球
	 */
	 public void add(Ball b)
	 {
		 balls.add(b);
	 }
	 
	 public void paintComponent(Graphics g)
	 {
		 super.paintComponent(g);
		 Graphics2D g2 = (Graphics2D) g;
		 for(Ball b : balls)
		 {
			 g2.fill(b.getShape());
		 }
	 }
 }
 
 /**
  * 画出一个有按钮和面板的窗体
  */
 class BounceFrame extends JFrame
 {
	 private BallPanel panel;
	 private static final int DEFAULT_WIDTH = 450;
	 private static final int DEFAULT_HEIGHT = 350;
	 private static final int STEPS = 1000;
	 private static final int DELAY = 30;
	 /**
	  * 构造1个带有按钮和和滚球面板
	  */
	 public BounceFrame()
	 {
		 setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		 setTitle("Bounce");
		 
		 panel = new BallPanel();
		 add(panel,BorderLayout.CENTER);
		 JPanel buttonPanel = new JPanel();
		 addButton(buttonPanel,"Start",
				 new ActionListener()
			 {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					addBall();
				}
				 
			 }
		 );
		 
		 addButton(buttonPanel,"Close",
				 new ActionListener()
				 {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.exit(0);
					}
			 
				 });
		  add(buttonPanel,BorderLayout.SOUTH);
		}
	 /**
	  * 把按钮加到容器中
	  * @param c
	  * @param title
	  * @param listener
	  */
	 public void addButton(Container c,String title, ActionListener listener)
	 {
		 JButton button = new JButton(title);
		 c.add(button);
		 button.addActionListener(listener);
	 }
 

 public void addBall()
 {
	 //try
	 //{
		 Ball ball = new Ball();
		 panel.add(ball);
		 Runnable r = new BallRunnable(ball,panel);
//		 for(int i = 0;i <= STEPS;i++)
//		 {
		 
		
			Thread t = new Thread(r);
			 
					
				 t.start();
			

	
	
		 
			 //ball.move(panel.getBounds());
			// panel.paint(panel.getGraphics());
			 //Thread.sleep(DELAY);
//		 }
//	 }catch(InterruptedException e)
//	 {
//		 e.printStackTrace();
//		 throw new RuntimeException(e);
//	 }
  }
 } 
 
 
 /*
  * 暂时忘记了怎么写判断两个按钮
  */
 class ButtonListener implements ActionListener
 {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String checkButton =  e.getActionCommand();
		if(checkButton.equals("Start"))
		{
			new BounceFrame().addBall();
		}else
		{
			System.exit(0);
		}
	}
	 
 }
 