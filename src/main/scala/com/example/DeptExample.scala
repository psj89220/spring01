package com.example

object DeptExample {
	var dept = new Dept 						// () 생략가능
	dept.deptno = 10
	dept.dname = "총무부"
	dept.loc = "서울"
	
	println("deptno = " + dept.deptno);
	println("dname = " + dept.dname);
	println("loc = " + dept.loc);
}