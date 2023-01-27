// JAVA recursive function to
// solve tower of hanoi puzzle
import java.util.*;
import java.io.*;
import java.math.*;
class GFG
{
	
static void towerOfHanoi(int n, int from_rod,
					int to_rod, int aux_rod,FileWriter writer)
{
	if (n == 1)
	{
		System.out.println("Move disk 1 from T"+
						from_rod+" to T"+to_rod);
		try {
			writer.write("\n" + "1 "+
					from_rod+" "+to_rod);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return;
	}
	towerOfHanoi(n - 1, from_rod, aux_rod, to_rod,writer);
	System.out.println("Move disk "+ n + " from T" +
					from_rod +" to T" + to_rod );
	try {
		writer.write("\n" + n + " " +
				from_rod +" " + to_rod);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	towerOfHanoi(n - 1, aux_rod, to_rod, from_rod,writer);
}

// Driver code
public static void main(String args[])
{
	
	int n = 4, s=1,d=2,t=5; // Number of disks
	String filename;
	String my_ID = "Bijaya";
	filename = new String(my_ID + "_ToH_n" + n + "_t" + t + "_s" + s + "_d" + d + ".txt");
	try {
		// Create the Writer object for writing to "filename"
		FileWriter writer = new FileWriter(filename, true);

		// Write the first line: n, t, s, d
		writer.write(n + "\t" + t + "\t" + s + "\t" + d);
		//towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
		towerOfHanoi(n, s, d, t,writer); // A, B and C are names of rods

	// Close the file
	writer.close();

} catch (IOException e) {
	e.printStackTrace();
}
	}
}

// This code is contributed by jyoti369


