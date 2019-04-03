package com.pt.prototype;

public class ProtoDemo implements Cloneable {
	private String state;
	private ObjNotimplementsCloneable notsupport;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ObjNotimplementsCloneable getNotsupport() {
		return notsupport;
	}

	public void setNotsupport(ObjNotimplementsCloneable notsupport) {
		this.notsupport = notsupport;
		
	}
	

	@Override
	public String toString() {
		return "ProtoDemo [state=" + state + ", notsupport=" + notsupport + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		ProtoDemo pr = new ProtoDemo();
		pr.setState("state changed");
		ObjNotimplementsCloneable notsupport = new ObjNotimplementsCloneable();
		notsupport.setNostate("clone obj changed");
		pr.setNotsupport(notsupport);
		ProtoDemo copyofprotodemo = (ProtoDemo) pr.clone();
		System.out.println(copyofprotodemo);
		copyofprotodemo.setState("state again changed");
		ObjNotimplementsCloneable notsupports = new ObjNotimplementsCloneable();
		notsupports.setNostate("clone obj again changed");
		copyofprotodemo.setNotsupport(notsupports);
		
		System.out.println(copyofprotodemo);
		// here the real object of notsupport changes because of shallow copy
		//to avoid this class ObjNotimplementsCloneable should implements cloneable
		//then the state of ObjNotimplementsCloneable will not change if any modifications 
		//done on clone object
		System.out.println(notsupport);
		System.out.println(pr.state);
		

	}
}
