import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;

public class Snake {

	protected Shell shell;
	private Text txtCiao;

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
		shell.setSize(550, 500);
		shell.setText("SWT Application");
		
		Label lblSnake = new Label(shell, SWT.NONE);
		lblSnake.setBounds(20, 10, 58, 22);
		lblSnake.setText("Snake");
		
		Label lblPunteggio = new Label(shell, SWT.NONE);
		lblPunteggio.setBounds(262, 10, 67, 15);
		lblPunteggio.setText("Punteggio");
		
		Label lblClassifica = new Label(shell, SWT.NONE);
		lblClassifica.setBounds(457, 10, 67, 15);
		lblClassifica.setText("Classifica");
		
		List list = new List(shell, SWT.BORDER);
		list.setBounds(432, 29, 92, 75);
		
		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));	
		Label lblPatrick = new Label(shell, SWT.NONE);
		lblPatrick.setBounds(20, 62, 55, 15);
		lblPatrick.setText("Patrick");
		canvas.setBounds(10, 110, 514, 342);
		
		txtCiao = new Text(shell, SWT.BORDER);
		txtCiao.setText("ciao");
		txtCiao.setBounds(10, 55, 76, 21);
		
		Label lblMondo = new Label(shell, SWT.NONE);
		lblMondo.setBounds(189, 70, 55, 15);
		lblMondo.setText("mondo");
		
		Label lblBach = new Label(shell, SWT.NONE);
		lblBach.setBounds(331, 70, 55, 15);
		lblBach.setText("bach");

	}
}
