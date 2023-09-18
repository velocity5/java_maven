package tutorial_java;

public class contructorExercise {

	// instance variable
	int id;
	String name;
	String add;

	contructorExercise(int id, String name){
//		this(id,name); Java-8 ko cho goi lai constructor nua
		this.id = id;
		this.name = name;
	}

	contructorExercise(int id, String name, String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}

	void display(){
		System.out.println(id + " " + name + " " + add);
	}

	public static void main(String[] args) {
		contructorExercise cE = new contructorExercise(12,"Nguyen Van A");
		contructorExercise cE1 = new contructorExercise(20,"Nguyen Van Be","32, Nguyen Cong Tru");
		cE1.display();
		cE.display();
	}

}
