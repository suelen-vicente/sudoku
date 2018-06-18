package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import sudoku.Line;

class LineTest {

	@Test
	void lineIsNotOkay() {
		List<Integer> lineList = new ArrayList<Integer>();
		Line line = new Line();
		
		lineList.add(1);
		lineList.add(2);
		lineList.add(3);
		lineList.add(4);
		lineList.add(5);
		lineList.add(6);
		lineList.add(7);
		lineList.add(8);
		lineList.add(8);
		
		line.setLine(lineList);
		
		assertFalse(line.isLineOk());
		
	}

}
