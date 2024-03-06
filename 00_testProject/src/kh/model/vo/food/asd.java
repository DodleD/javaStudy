package kh.model.vo.food;

import java.io.FileWriter;
import java.io.IOException;

public class asd {

	
	
	public void output() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("test.txt",true);
			fw.write(97);
			fw.write(65);
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
