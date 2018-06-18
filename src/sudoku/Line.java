package sudoku;

import java.util.List;

public class Line {
	
	private List<Integer> line;
	
	public boolean existsInLine(Integer element) {
		return line.contains(element);
	}
	
	public boolean isLineOk() {
		// Arrumar para quando as duas últimas posições são iguais
		for (Integer i = 0; i < 8; i ++) {
			for (Integer j = i + 1; j > i; j ++) {
				if(line.get(i) == line.get(j)) {
					return false;
				}
			}
		} 
		
		return true;
	}
	
	public void setLine(List<Integer> line) {
		this.line = line;
	}

}
