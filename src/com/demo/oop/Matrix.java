package com.demo.oop;

public class Matrix {
	
	long[][] mat;
	int rows, cols;
	
	public Matrix() {
		mat = null;
		rows = 0;
		cols = 0;
	}
	
	Matrix (int r, int c) {
		rows = r;
		cols = c;
		mat = new long[rows][cols];
	}
	
	int noOfRows() {
		return rows;
	}
	
	int noOfCols() {
		return cols;
	}
	
	long getElement(int i, int j) {
		return mat[i][j];
	}
	
	void setElement(int i, int j, long val) {
		if(i<rows && j<cols) {
			mat[i][j] = val;
		} else {
			System.out.println("Invalid position.");
		}
	}
	
	void printMatrix() {
		for(int x = 0; x<rows; x++) {
			for(int y = 0; y<cols; y++) {
				System.out.print(mat[x][y] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Matrix m1 = new Matrix(3, 4);
		m1.printMatrix();
		System.out.println();
		Matrix m2 = new Matrix(3, 5);
		m2.printMatrix();
		System.out.println();
		m1.setElement(1, 3, 5);
		m1.printMatrix();
		System.out.println();
		m2.setElement(2, 3, 8);
		m2.printMatrix();
		System.out.println();
		
		Operation o = new Operation();
		o.add(m1, m2);
	}
}

class Operation {
	
	Matrix result;
	
	public Operation() {
		result = null;
	}
	
	void add(Matrix m1, Matrix m2) {
		if(m1.noOfRows() == m2.noOfRows() && m1.noOfCols() == m2.noOfCols()) {
			result = new Matrix(m1.noOfRows(), m1.noOfCols());
			for(int x = 0; x<m1.noOfRows(); x++) {
				for(int y = 0; y<m1.noOfCols(); y++) {
					result.setElement(x, y, (m1.getElement(x,y) + m2.getElement(x,y)));
				}
				System.out.println();
			}

		} else {
			System.out.println("Incompatible Matrices.");
		}
	}
	
	void multiply(Matrix m1, Matrix m2) {
		if(m1.noOfRows() == m2.noOfCols() && m1.noOfCols() == m2.noOfCols()) {}
	}
}