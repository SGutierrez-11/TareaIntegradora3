package model;

public class LineUp{
 
 private String date;
 private boolean[][] formation;
 
 private Tactics tactics;
 
 public LineUp(){
	 this.date=date;
	 this.formation=formation;
	 this.tactics=tactics;
 }
 
 public String getDate(){
	 return date;
 }
 
 public void setDate(String date){
	 this.date=date;
 }
 
 public boolean[] getFormation(){
	 return formation;
 }
 
 public void setFormation(){
	 this.formation=formation;
 }
 
}