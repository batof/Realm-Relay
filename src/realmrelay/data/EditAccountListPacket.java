package realmrelay.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public class EditAccountListPacket extends Packet {
	
	public static final byte ID = 31;
	
	public int accountListId;
	public boolean add;
	public int objectId;

	@Override
	public byte id() {
		return ID;
	}

	@Override
	public void parseFromInput(DataInput in) throws IOException {
		this.accountListId = in.readInt();
		this.add = in.readBoolean();
		this.objectId = in.readInt();
	}

	@Override
	public void writeToOutput(DataOutput out) throws IOException {
		out.writeInt(this.accountListId);
		out.writeBoolean(this.add);
		out.writeInt(this.objectId);
	}

}
