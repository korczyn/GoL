package com.capgemini.gol;

import com.capgemini.gol.LifeUI.Figure;

public class Figures {

	/**
	 * Prints chosen figure on Swing board
	 * 
	 * @param c
	 *            - starting cell. Other Cells coordinates are calculated based
	 *            on coordinates of c
	 * @param f
	 *            - choose figure to paint
	 */
	public void printFigure(Cell c, Figure f) {
		int x = c.getCoords().get(0);
		int y = c.getCoords().get(1);

		switch (f) {
		case glider:
			findCellAndResurrect(x, y);
			findCellAndResurrect(x + 1, y + 1);
			findCellAndResurrect(x, y + 2);
			findCellAndResurrect(x + 1, y + 2);
			findCellAndResurrect(x - 1, y + 2);
			updateBoard();
			break;
		case square:
			findCellAndResurrect(x, y);
			findCellAndResurrect(x + 1, y);
			findCellAndResurrect(x, y + 1);
			findCellAndResurrect(x + 1, y + 1);
			updateBoard();
			break;
		case fountain:
			findCellAndResurrect(x, y);
			findCellAndResurrect(x + 0, y + 1);
			findCellAndResurrect(x - 1, y + 1);
			findCellAndResurrect(x - 2, y - 1);
			findCellAndResurrect(x - 3, y - 1);
			findCellAndResurrect(x - 3, y + 0);
			findCellAndResurrect(x - 4, y + 0);
			findCellAndResurrect(x - 5, y + 1);
			findCellAndResurrect(x - 5, y + 2);
			findCellAndResurrect(x - 5, y + 3);
			findCellAndResurrect(x - 6, y + 3);
			findCellAndResurrect(x - 5, y + 4);
			findCellAndResurrect(x - 5, y + 5);
			findCellAndResurrect(x - 6, y + 5);
			findCellAndResurrect(x - 5, y + 6);
			findCellAndResurrect(x - 5, y + 7);
			findCellAndResurrect(x - 6, y + 7);
			findCellAndResurrect(x - 5, y + 8);
			findCellAndResurrect(x - 5, y + 9);
			findCellAndResurrect(x - 4, y + 5);
			findCellAndResurrect(x - 4, y + 10);
			findCellAndResurrect(x - 3, y + 10);
			findCellAndResurrect(x - 3, y + 11);
			findCellAndResurrect(x - 2, y + 11);
			findCellAndResurrect(x, y + 10);
			findCellAndResurrect(x, y + 9);
			findCellAndResurrect(x - 1, y + 9);
			findCellAndResurrect(x - 5, y + 11);
			findCellAndResurrect(x - 6, y + 11);
			findCellAndResurrect(x - 5, y + 12);
			findCellAndResurrect(x - 5, y + 13);
			findCellAndResurrect(x - 6, y + 14);
			findCellAndResurrect(x - 7, y + 14);
			findCellAndResurrect(x - 7, y + 13);
			findCellAndResurrect(x - 5, y - 1);
			findCellAndResurrect(x - 5, y - 2);
			findCellAndResurrect(x - 5, y - 3);
			findCellAndResurrect(x - 6, y - 1);
			findCellAndResurrect(x - 6, y - 4);
			findCellAndResurrect(x - 7, y - 4);
			findCellAndResurrect(x - 7, y - 3);
			findCellAndResurrect(x - 8, y + 3);
			findCellAndResurrect(x - 8, y + 2);
			findCellAndResurrect(x - 8, y + 7);
			findCellAndResurrect(x - 8, y + 8);
			findCellAndResurrect(x - 10, y + 7);
			findCellAndResurrect(x - 10, y + 6);
			findCellAndResurrect(x - 11, y + 5);
			findCellAndResurrect(x - 10, y + 4);
			findCellAndResurrect(x - 10, y + 3);
			findCellAndResurrect(x - 10, y + 9);
			findCellAndResurrect(x - 10, y + 10);
			findCellAndResurrect(x - 10, y + 1);
			findCellAndResurrect(x - 10, y + 0);
			findCellAndResurrect(x - 11, y + 11);
			findCellAndResurrect(x - 12, y + 11);
			findCellAndResurrect(x - 12, y + 10);
			findCellAndResurrect(x - 11, y - 1);
			findCellAndResurrect(x - 12, y - 1);
			findCellAndResurrect(x - 12, y + 0);
			findCellAndResurrect(x - 12, y + 2);
			findCellAndResurrect(x - 12, y + 8);
			findCellAndResurrect(x - 13, y + 5);
			updateBoard();
			break;
		case gospel_gun:
			findCellAndResurrect(x + 0, y + 0);
			findCellAndResurrect(x - 1, y + 0);
			findCellAndResurrect(x - 1, y + 1);
			findCellAndResurrect(x + 0, y + 1);
			findCellAndResurrect(x + 0, y + 10);
			findCellAndResurrect(x - 1, y + 10);
			findCellAndResurrect(x + 1, y + 10);
			findCellAndResurrect(x - 2, y + 11);
			findCellAndResurrect(x - 3, y + 12);
			findCellAndResurrect(x - 3, y + 13);
			findCellAndResurrect(x + 2, y + 11);
			findCellAndResurrect(x + 3, y + 12);
			findCellAndResurrect(x + 3, y + 13);
			findCellAndResurrect(x + 0, y + 14);
			findCellAndResurrect(x - 1, y + 16);
			findCellAndResurrect(x + 0, y + 16);
			findCellAndResurrect(x + 1, y + 16);
			findCellAndResurrect(x + 0, y + 17);
			findCellAndResurrect(x - 2, y + 15);
			findCellAndResurrect(x + 2, y + 15);
			findCellAndResurrect(x - 1, y + 20);
			findCellAndResurrect(x - 1, y + 21);
			findCellAndResurrect(x - 2, y + 21);
			findCellAndResurrect(x - 3, y + 21);
			findCellAndResurrect(x - 3, y + 20);
			findCellAndResurrect(x - 2, y + 20);
			findCellAndResurrect(x - 4, y + 22);
			findCellAndResurrect(x + 0, y + 22);
			findCellAndResurrect(x - 4, y + 24);
			findCellAndResurrect(x - 5, y + 24);
			findCellAndResurrect(x + 0, y + 24);
			findCellAndResurrect(x + 1, y + 24);
			findCellAndResurrect(x - 3, y + 34);
			findCellAndResurrect(x - 2, y + 34);
			findCellAndResurrect(x - 2, y + 35);
			findCellAndResurrect(x - 3, y + 35);
			updateBoard();
			break;
		}

	}

	private void findCellAndResurrect(int x, int y) {
		Cell c = Neighbourhood.getCellByCoords(x, y);
		c.ressurect();
	}

	private void updateBoard() {
		for (int i = 0; i < LifeUI.cells.length; i++) {
			if (Game.board.get(i).isAlive()) {
				LifeUI.cells[i].setIcon(LifeUI.aliveColor);
			} else {
				LifeUI.cells[i].setIcon(LifeUI.deadColor);
			}
		}
	}

}
