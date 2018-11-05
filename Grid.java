//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
	private Drawable[][] grid;
	
	public Grid()
	{
		setSize(0,0);
	}

	public Grid(int rows, int cols)
	{
		setSize(rows,cols);
	}

	public void setSize(int rows, int cols)
	{
		grid = new Drawable[rows][cols];
	}

	public void setSpot(int row,int col, Drawable val)
	{
		grid[row][col]=val;
	}
	
	public Drawable getSpot(int row, int col)
	{
		return grid[row][col];
	}
	
	public int getNumRows()
	{
		return grid.length;
	}
	
	public int getNumCols()
	{
		return grid[0].length;
	}

	public boolean drawGrid(Graphics window)
	{
		boolean full=true;
	    for(int r=0;r<grid.length;r++)
	    {
	         for(int c=0;c<grid[r].length;c++)
	         {
	        	 Drawable k = grid[r][c];
	        	 if (k!=null)
	        	 {
	        		 k.draw(window);
	        	 }
	        	 else
	        		 full=false;
	         }
	      }

		return full;
	}
	
	public String toString()
	{
		String output="";
		for (int r=0;r<getNumRows();r++)
		{
			for (int c=0;c<getNumCols();c++)
			{
				if (grid[r][c]!=null)
				{
					output+=grid[r][c].getX() + " ";
					output+=grid[r][c].getY() + " ";
					output+=grid[r][c].getWidth() + " ";
					output+=grid[r][c].getHeight() + " ";
					
					output+=((Piece)grid[r][c]).getName() + " ";
					output+=((Piece)grid[r][c]).getColor() + " ";
				}
			}
		}
		return output;
	}
}