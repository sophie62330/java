package fr;

public class Student {
	String nom;
	int note1;
	int note2;
	
	public Student() {}
	
	public Student(String nom,int note1,int note2) {
		this.nom=nom;
		this.note1=note1;
		this.note2=note2;
	}

	public double calcMoy() {
		return (((double)this.note1+(double)this.note2)/2);
	}
	
	public void show() {
		System.out.println("Nom : "+this.nom+" - moyenne : "+this.calcMoy());
	}
	
	@Override
	public String toString() {
		return "Student [nom=" + this.nom + ", note1=" + this.note1 + ", note2=" + this.note2 + "]";
	}
	
	
}
