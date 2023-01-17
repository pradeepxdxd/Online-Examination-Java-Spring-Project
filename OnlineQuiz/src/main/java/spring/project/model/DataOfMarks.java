package spring.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataOfMarks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int marks;
	private String name;
	
	public DataOfMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataOfMarks(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "DataOfMarks [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
}
