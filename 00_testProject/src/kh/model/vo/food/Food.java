package kh.model.vo.food;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kcal;
	byte[] serializefood;
	
	public Food() {
		super();
	}
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getKcal() {
		return kcal;
	}
	protected void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
	public void fileSave(String fileName) {
		
		Food sample = new Food("사과", 20);
		File f1 = new File(fileName);
		System.out.println("파일 존재 유무 : " + f1.exists()); //파일존재유무
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1))){
				oos.writeObject(sample);
		
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
	
}
