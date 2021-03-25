package com.tyss.objectclass.hasgcode;

public class Person1 {
	int pid;
	String name;


	public Person1(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
		
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid != other.pid)
			return false;
		return true;
	}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid+"=="+name;
	}	

}
