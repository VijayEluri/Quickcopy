package be.vbsteven.quickcopy;

public class Group implements Comparable<Group> {
	public int id;
	public String name;
	
	public Group(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Group another) {
		return this.name.compareTo(another.name);
	}
	
	
}
