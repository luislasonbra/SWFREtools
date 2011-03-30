package tv.porst.swfretools.parser.actions.as3;

import tv.porst.splib.binaryparser.UINT8;
import tv.porst.swfretools.parser.SWFParserHelpers;
import tv.porst.swfretools.parser.structures.EncodedS24;

public class AS3Ifeq extends AS3Instruction {

	private final EncodedS24 offset;

	public AS3Ifeq(final UINT8 opcode, final EncodedS24 offset) {
		super(opcode);

		this.offset = offset;
	}

	@Override
	public int getBitLength() {
		return SWFParserHelpers.addBitLengths(getOpcode(), offset);
	}

	/**
	 * Returns the
	 *
	 * @return The
	 */
	public EncodedS24 getOffset() {
		return offset;
	}

}
