package com.example.tests;

public class ContactData implements Comparable<ContactData>  {
	public String name;
	public String lastname;
	public String addressone;
	public String phoneone;
	public String phonetwo;
	public String phonethree;
	public String emailOne;
	public String emailTwo;
	public String birthdayday;
	public String birthdaymonth;
	public String birthdayyear;
	public String group;
	public String addresstwo;
	public String homeone;
	
	public ContactData() {
		
	}

	@Override
	public String toString() {
		return "ContactData [nameone=" + name + ", nametwo=" + lastname
				+ ", addressone=" + addressone + ", addresstwo=" + addresstwo
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ContactData other = (ContactData) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return this.name.toLowerCase().compareTo(other.name.toLowerCase());
		
	}
}