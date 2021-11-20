package org.com.cap.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Answer {
private ArrayList<String> l;
private HashSet<String> s;
private HashMap <Integer,String> mp;



public ArrayList<String> getL() {
	return l;
}
public void setL(ArrayList<String> l) {
	this.l = l;
}
public HashSet<String> getS() {
	return s;
}
public void setS(HashSet<String> s) {
	this.s = s;
}
public HashMap<Integer, String> getMp() {
	return mp;
}
public void setMp(HashMap<Integer, String> mp) {
	this.mp = mp;
}

}
