package realmrelay.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public class EnemyHitPacket extends Packet {
	
	public static final byte ID = 58;
	
	public int time;
	public int bulletId;
	public int targetId;
	public boolean kill;

	@Override
	public byte id() {
		return ID;
	}

	@Override
	public void parseFromInput(DataInput in) throws IOException {
		this.time = in.readInt();
		this.bulletId = in.readUnsignedByte();
		this.targetId = in.readInt();
		this.kill = in.readBoolean();
	}

	@Override
	public void writeToOutput(DataOutput out) throws IOException {
		out.writeInt(this.time);
		out.writeByte(this.bulletId);
		out.writeInt(this.targetId);
		out.writeBoolean(this.kill);
	}

}
