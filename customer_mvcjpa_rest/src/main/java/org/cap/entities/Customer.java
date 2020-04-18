package org.cap.entities;


import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="customers")
public class Customer {
@Id
@GeneratedValue
private int custId;
private String custName;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}


@Override
public int hashCode() {
return Objects.hash(custId);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (custId != other.custId)
		return false;
	return true;
}

}
