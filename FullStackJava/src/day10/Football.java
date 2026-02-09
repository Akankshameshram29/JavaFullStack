package day10;

public class Football extends player {
 
  int goals;
  int highScore;
  int assist;
  
  public Football(String name, int age, String gender, int goals, int assist, int highScore) {
	  this.name =name;
	  this.age = age;
	  this.gender = gender;
	  this.goals = goals;
	  this.assist = assist;
	  this.highScore = highScore;
	  
  }
  
  public int getGoals() {
	  return goals;
  }
  public int getAssist() {
	  return assist;
  }
  public String getGender() {
	  return gender;
  }
  
  public String getName() {
	  return name;
  }
  
  public int getAge() {
	  return age;
  }
  
  public int highScore() {
	  return highScore;
  }
  
  
}
