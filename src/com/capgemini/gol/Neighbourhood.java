package com.capgemini.gol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Neighbourhood {

	/**
	 * Checks if Cell with given coordinates fits the 2D board (coordinates
	 * greater or equal 0 and lower than size)
	 * 
	 * @param size
	 *            - size of a board
	 * @param x
	 *            - x coordinate of Cell
	 * @param y
	 *            - y coordinate of Cell
	 * @return true if Cell fits in the board
	 * @return false otherwise
	 */
	public static boolean checkNeighbours2D(int size, int x, int y) {
		return x < size && y < size && x >= 0 && y >= 0;
	}

	/**
	 * Checks if Cell with given coordinates fits the 3D board (coordinates
	 * greater or equal 0 and lower than size)
	 * 
	 * @param size
	 *            - size of a board
	 * @param x
	 *            - x coordinate of Cell
	 * @param y
	 *            - y coordinate of Cell
	 * @param z
	 *            - z coordinate of Cell
	 * @return true if Cell fits in the board
	 * @return false otherwise
	 */
	public static boolean checkNeighbours3D(int size, int x, int y, int z) {
		return x < size && y < size && z < size && x >= 0 && y >= 0 && z >= 0;
	}

	
	/**
	 * Looks for a Cell with given coordinates in list of Cells. Returns it when found
	 * @param x - x coordinate of Cell
	 * @param y - y coordinate of Cell
	 * @return Cell if Cell with given coordinates has been found
	 * @return null otherwise
	 */
	public static Cell getCellByCoords(int x, int y) {
		for (int i = 0; i < Game.board.size(); i++) {
			if (Game.board.get(i).getCoords().get(0).equals(x) && Game.board.get(i).getCoords().get(1).equals(y)) {
				return Game.board.get(i);
			}
		}
		return null;
	}

	/**
	 * Finds given Cell's 2D neighbourhood based on preset rules
	 * @param c - Cell to find neighbours of
	 * @return - List of Cells making neigbourhood of given Cell
	 */
	public static List<Cell> setNeighbours2D(Cell c) {
		List<Cell> neighbours = new ArrayList<Cell>();
		List<Integer> tmp_coords = c.getCoords();
		int x = tmp_coords.get(0);
		int y = tmp_coords.get(1);

		int tmp_x = x - 1;
		int tmp_y = y - 1;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x - 1;
		tmp_y = y;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x - 1;
		tmp_y = y + 1;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x;
		tmp_y = y - 1;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x;
		tmp_y = y + 1;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x + 1;
		tmp_y = y - 1;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x + 1;
		tmp_y = y;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		tmp_x = x + 1;
		tmp_y = y + 1;
		if (checkNeighbours2D(Game.size, tmp_x, tmp_y))
			neighbours.add(getCellByCoords(tmp_x, tmp_y));

		return neighbours;

	}

	// public static List<Cell> setNeighbours3D(Cell c) {
	// List<Cell> neighbours = new ArrayList<Cell>();
	// String[] tmp_coords = c.getCoords().split(" ");
	// int x = Integer.parseInt(tmp_coords[0]);
	// int y = Integer.parseInt(tmp_coords[1]);
	// int z = Integer.parseInt(tmp_coords[2]);
	//
	// int tmp_x = x;
	// int tmp_y = y;
	// int tmp_z = z;
	//
	// // tmp_z = z - 1
	// tmp_x = x - 1;
	// tmp_y = y - 1;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x - 1;
	// tmp_y = y;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x - 1;
	// tmp_y = y + 1;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y - 1;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y + 1;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y - 1;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y + 1;
	// tmp_z = z - 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// // tmp_z = z
	// tmp_x = x - 1;
	// tmp_y = y - 1;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x - 1;
	// tmp_y = y;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x - 1;
	// tmp_y = y + 1;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y - 1;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y + 1;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y - 1;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y + 1;
	// tmp_z = z;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// // tmp_z = z + 1
	// tmp_x = x - 1;
	// tmp_y = y - 1;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x - 1;
	// tmp_y = y;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x - 1;
	// tmp_y = y + 1;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y - 1;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x;
	// tmp_y = y + 1;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y - 1;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// tmp_x = x + 1;
	// tmp_y = y + 1;
	// tmp_z = z + 1;
	// if (checkNeighbours3D(Game.size, tmp_x, tmp_y, tmp_z))
	// neighbours.add(
	// getCellByCoords(String.valueOf(tmp_x) + " " + String.valueOf(tmp_y) + " "
	// + String.valueOf(tmp_z)));
	//
	// return neighbours;
	//
	// }
}
