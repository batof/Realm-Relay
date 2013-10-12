package realmrelay.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public class SquareHitPacket extends Packet {
	
	public static final byte ID = 41;
	
	public int time;
	public int bulletId;
	public int objectId;

	@Override
	public byte id() {
		return ID;
	}

	@Override
	public void parseFromInput(DataInput in) throws IOException {
		this.time = in.readInt();
		this.bulletId = in.readUnsignedByte();
		this.objectId = in.readInt();
	}

	@Override
	public void writeToOutput(DataOutput out) throws IOException {
		out.writeInt(this.time);
		out.writeByte(this.bulletId);
		out.writeInt(this.objectId);
	}

}
