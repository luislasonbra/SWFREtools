package tv.porst.swfretools.dissector.gui.main.panels;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import tv.porst.splib.gui.GuiHelpers;
import tv.porst.swfretools.parser.structures.AS3Code;
import tv.porst.swfretools.parser.tags.DoABCTag;

/**
 * Panel to display ActionScript 3 code.
 */
public final class AS3CodePanel extends JPanel {

	/**
	 * Creates a new panel object.
	 * 
	 * @param code The code to display in the panel.
	 */
	public AS3CodePanel(final AS3Code code) {
		super(new BorderLayout());

		final JTextArea area = new JTextArea(AS3CodePrinter.getCodeText(code));
		area.setEditable(false);
		area.setFont(new Font(GuiHelpers.getMonospaceFont(), 0, 12));

		add(new JScrollPane(area));
	}

	/**
	 * Creates a new panel object.
	 * 
	 * @param tag The tag that contains the code to display.
	 */
	public AS3CodePanel(final DoABCTag tag) {
		super(new BorderLayout());

		final JTextArea area = new JTextArea(AS3CodePrinter.getCodeText(tag));
		area.setEditable(false);
		area.setFont(new Font(GuiHelpers.getMonospaceFont(), 0, 12));

		add(new JScrollPane(area));
	}
}