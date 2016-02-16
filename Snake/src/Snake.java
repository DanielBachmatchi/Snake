import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class Snake {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Snake window = new Snake();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(721, 500);
		shell.setText("SWT Application");
		
		Label lblSnake = new Label(shell, SWT.NONE);
		lblSnake.setBounds(20, 10, 58, 22);
		lblSnake.setText("Snake");
		
		Label lblPunteggio = new Label(shell, SWT.NONE);
		lblPunteggio.setBounds(262, 10, 67, 15);
		lblPunteggio.setText("Punteggio");
		
		Label lblClassifica = new Label(shell, SWT.NONE);
		lblClassifica.setBounds(575, 68, 67, 15);
		lblClassifica.setText("Classifica");
		
		List list = new List(shell, SWT.BORDER);
		list.setBounds(564, 110, 92, 342);
		
		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		canvas.setBounds(10, 110, 514, 342);
		
		Label lblInspunteggio = new Label(shell, SWT.NONE);
		lblInspunteggio.setBounds(262, 45, 84, 15);
		lblInspunteggio.setText("InsPunteggio");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(85, 21, 40, 25);
		btnNewButton.setText("UP");
		
		Button btnRight = new Button(shell, SWT.NONE);
		btnRight.setBounds(131, 40, 40, 25);
		btnRight.setText("RIGHT");
		
		Button btnLeft = new Button(shell, SWT.NONE);
		btnLeft.setBounds(38, 45, 40, 25);
		btnLeft.setText("LEFT");
		
		Button btnDown = new Button(shell, SWT.NONE);
		btnDown.setBounds(85, 68, 40, 25);
		btnDown.setText("DOWN");

	}
}
