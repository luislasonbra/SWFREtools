package tv.porst.swfretools.parser.actions.as3;

import tv.porst.splib.binaryparser.UINT8;
import tv.porst.swfretools.parser.structures.EncodedU30;

public class AS3Inlocal extends AS3Instruction {

	public AS3Inlocal(final UINT8 opcode, final EncodedU30 index) {
		super(opcode);
	}

}
