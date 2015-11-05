

	import java.awt.Graphics;
	import javax.swing.JApplet;

	public class tictac extends JApplet {
		public void paint(Graphics canvas) {
			
			canvas.drawLine(30, 250, 30, 20);
			canvas.drawLine(100, 250, 100, 20);
			canvas.drawLine(0, 100, 200,100);
			canvas.drawLine(0, 200, 200, 200);
			canvas.drawLine(100, 100, 200, 20);
			canvas.drawLine(100, 20, 200, 100);
			canvas.drawLine(100, 250, 200, 200);
			canvas.drawLine(100, 100, 200, 200);
			canvas.drawLine(100, 200, 200, 100);
			canvas.drawLine(100, 200, 200, 250);
			canvas.drawLine(150, 1, 150, 250);
			
		}
	}
