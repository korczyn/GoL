package com.capgemini.gol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

	public static int size = 75;
	public static List<Cell> board;

	/**
	 * Creates a list of Cells of size Game.size*Game.size
	 * 
	 * @return list of Cells
	 */
	public static List<Cell> createCells() {
		List<Cell> list = new ArrayList<Cell>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Cell c = new Cell(new ArrayList<Integer>(Arrays.asList(i, j)));
				list.add(c);
			}
		}
		return list;
	}

	/**
	 * Initialize the board by finding neighbourhood of each Cell
	 */
	public static void init() {
		board = createCells();
		for (Cell c : board) {
			c.setNeighboursList(Neighbourhood.setNeighbours2D(c));
		}
	}

	/**
	 * Changes state of Cell basing on given Game of Life rules
	 * 
	 * @param c
	 *            - Cell which state we want to determine
	 */
	static void changeState(Cell c) {
		boolean isAlive = c.isAlive();
		int aliveNeighbours = c.getAliveNeighbours();

		if (isAlive && aliveNeighbours < 2) {
			c.kill();
		} else if (isAlive && (aliveNeighbours == 2 || aliveNeighbours == 3)) {

		} else if (isAlive && aliveNeighbours > 3) {
			c.kill();
		} else if (!isAlive && aliveNeighbours == 3) {
			c.ressurect();
		}
	}

	/**
	 * Calculates next generation by counting alive neighbours and changing
	 * state of each Cell
	 */
	public static void calculateNextGeneration() {

		for (Cell cell : board) {
			cell.countAliveNeighbours();
		}
		for (Cell cell : board) {
			changeState(cell);
		}

	}
}
