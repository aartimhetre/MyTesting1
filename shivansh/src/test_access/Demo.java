package test_access;

import access_specifier.AS1;

public class Demo extends AS1{

	public static void main(String[] args) {
		AS1 s1=new AS1();
s1.test2();//calling public method fromAS1 CLASS

Demo d=new Demo();
d.test2();//public
d.test3();//protected
//d.test1();default cnt called
//d.test4();private cant called
	}

}
