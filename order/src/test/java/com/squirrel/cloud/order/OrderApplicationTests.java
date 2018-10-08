package com.squirrel.cloud.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void getSum(){
		System.out.println(getN(5));
	}


	//0.1.1.2.3.5.8.13.21.55
	public int getN(int n){

		if(n == 1)
			return 0 ;

		if(n == 2)
			return 1;

		return getN(n-1) + getN(n-2);

	}


}
