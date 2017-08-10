package cn.sfturing.thread.binarytree;

public class BinaryNode {
	private BinaryNode leftNode;
	private BinaryNode rightNode;
	private int data;
	private boolean lFlag =false;
	private boolean rFlag = false;
	
	public BinaryNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	public BinaryNode getLeftNode() {
		return leftNode; 
	}

	public void setLeftNode(BinaryNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean islFlag() {
		return lFlag;
	}

	public void setlFlag(boolean lFlag) {
		this.lFlag = lFlag;
	}

	public boolean isrFlag() {
		return rFlag;
	}

	public void setrFlag(boolean rFlag) {
		this.rFlag = rFlag;
	}

	@Override
	public String toString() {
		return "BinaryNode{" +
				"leftNode=" + leftNode +
				", rightNode=" + rightNode +
				", data=" + data +
				", lFlag=" + lFlag +
				", rFlag=" + rFlag +
				'}';
	}
}
