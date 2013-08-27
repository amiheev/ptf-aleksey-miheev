package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	public String nameone;
	public String nametwo;
	public String addressone;
	public String phoneone;
	public String phonetwo;
	public String phonethree;
	public String emailone;
	public String emailtwo;
	public String birthdayday;
	public String birthdaymonth;
	public String birthdayyear;
	public String group;
	public String addresstwo;
	public String homeone;
	
	public ContactData() {
		
	}

	public ContactData(String nameone, String nametwo, String addressone,
			String phoneone, String phonetwo, String phonethree,
			String emailone, String emailtwo, String birthdayday,
			String birthdaymonth, String birthdayyear, String group,
			String addresstwo, String homeone) {
		this.nameone = nameone;
		this.nametwo = nametwo;
		this.addressone = addressone;
		this.phoneone = phoneone;
		this.phonetwo = phonetwo;
		this.phonethree = phonethree;
		this.emailone = emailone;
		this.emailtwo = emailtwo;
		this.birthdayday = birthdayday;
		this.birthdaymonth = birthdaymonth;
		this.birthdayyear = birthdayyear;
		this.group = group;
		this.addresstwo = addresstwo;
		this.homeone = homeone;
	}

	@Override
	public String toString() {
		return "ContactData [nameone=" + nameone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((nameone == null) ? 0 : nameone.hashCode());
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
		if (nameone == null) {
			if (other.nameone != null)
				return false;
		} else if (!nameone.equals(other.nameone))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return this.nameone.toLowerCase().compareTo(other.nameone.toLowerCase());
	}
	
	
}