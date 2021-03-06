package realmrelay.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public class UseItemPacket extends Packet {
	
	public static final byte ID = 35;
	
	public int time;
	public SlotObject slotObject = new SlotObject();
	public Location itemUsePos = new Location();
	public int useType;

	@Override
	public byte id() {
		return ID;
	}

	@Override
	public void parseFromInput(DataInput in) throws IOException {
		this.time = in.readInt();
		this.slotObject.parseFromInput(in);
		this.itemUsePos.parseFromInput(in);
		this.useType = in.readUnsignedByte();
	}

	@Override
	public void writeToOutput(DataOutput out) throws IOException {
		out.writeInt(this.time);
		this.slotObject.writeToOutput(out);
		this.itemUsePos.writeToOutput(out);
		out.writeByte(this.useType);
	}

}
