package tv.porst.swfretools.parser.actions.as3;

import tv.porst.splib.binaryparser.UINT8;
import tv.porst.swfretools.parser.SWFParserHelpers;
import tv.porst.swfretools.parser.structures.EncodedU30;

public class AS3Setslot extends AS3Instruction {

	private final EncodedU30 slotIndex;

	public AS3Setslot(final UINT8 opcode, final EncodedU30 slotIndex) {
		super(opcode);

		this.slotIndex = slotIndex;
	}

	@Override
	public int getBitLength() {
		return SWFParserHelpers.addBitLengths(getOpcode(), slotIndex);
	}

	/**
	 * Returns the
	 *
	 * @return The
	 */
	public EncodedU30 getSlotIndex() {
		return slotIndex;
	}

}
