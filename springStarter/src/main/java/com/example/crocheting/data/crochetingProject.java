package com.example.crocheting.data;

public class crochetingProject {

	private String name;
	private String hook;
	private int width;
	private int length;
	private int depth;

	public crochetingProject(String name, String hook, int width, int length, int depth) {
		super();
		setName(name);
		setHook(hook);
		setWidth(width);
		setDepth(depth);
		setLength(length);
	}

	public crochetingProject() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHook() {
		return hook;
	}

	public void setHook(String hook) {
		this.hook = hook;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "project [name=" + name + ", hook size =" + hook + ", width=" + width + ", length =" + length
				+ ", depth =" + depth + "]";
	}
}
