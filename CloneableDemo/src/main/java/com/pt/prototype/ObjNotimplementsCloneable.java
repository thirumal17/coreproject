package com.pt.prototype;

public class ObjNotimplementsCloneable {
private String nostate;

public String getNostate() {
	return nostate;
}

public void setNostate(String nostate) {
	this.nostate = nostate;
}

@Override
public String toString() {
	return "ObjNotimplementsCloneable [nostate=" + nostate + "]";
}

}
