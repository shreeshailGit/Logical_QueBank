package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap_Test {

	public static void main(String[] args) {
      List<Employee1> list = new ArrayList<>();
      
		Employee1 e1 = new Employee1(101,"Jack",Arrays.asList("Mumbai","Pune","Noida","Banglore"));
		Employee1 e2 = new Employee1(102,"Warner",Arrays.asList("Mumbai","Banglore"));
		Employee1 e3 = new Employee1(103,"Starc",Arrays.asList("Mumbai","Pune","Noida"));

		list.add(e1);list.add(e2);list.add(e3);
		//System.out.println(list);
	
     	Set<String> distinctCities = list.stream().flatMap(e->e.getCityWorkedIn().stream()).collect(Collectors.toSet());
	   System.out.println(distinctCities);
	   
	   //Map method
	   // function u pass to the flatmap()  operation returns a stream of value
	      //map() used for transformation only
	   
	   
	   
 	  // function u pass to the flatmap()  operation returns a stream of value
	 //flatmap() used for transformation and flattening
	}

}
class Employee1 {
	private Integer eid;
	private String ename;
	private List<String> cityWorkedIn;
	
	public Employee1(Integer eid, String ename, List<String> cityWorkedIn) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.cityWorkedIn = cityWorkedIn;
	}
	
	

	public Integer getEid() {
		return eid;
	}



	public void setEid(Integer eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public List<String> getCityWorkedIn() {
		return cityWorkedIn;
	}



	public void setCityWorkedIn(List<String> cityWorkedIn) {
		this.cityWorkedIn = cityWorkedIn;
	}



	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", cityWorkedIn=" + cityWorkedIn + "]";
	}
	
	
}