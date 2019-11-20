package com.ustglobal.sorting.set;

import java.util.Comparator;

public class CustomerSortById implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.id>o2.id) {
			return 1;
		}else if (o1.id<o2.id) {
			return -1;
		}else {
			return 0;
		}
	}
}
