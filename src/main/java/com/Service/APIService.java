package com.Service;

import org.springframework.stereotype.Service;

@Service
public class APIService {
	public int getNewCode(int fcode) {
		System.out.println("Searching for: "+fcode);
		int result = 0;
		while(true) {
			fcode++;
			if(test(fcode)==1){
				result = fcode;
				break;
			}
		}
		return result;
	}
	public int test(int num) {
		if(num==0)
				return 0;
		return (num%9==0)?9:(num%9);
	}

}
