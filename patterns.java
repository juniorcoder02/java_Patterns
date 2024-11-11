public class patterns {

    // Function to print a hollow rectangle of given dimensions
    // Algorithm:
    // 1. Iterate through each row from 1 to totrows.
    // 2. For each row, iterate through each column from 1 to totcols.
    // 3. Print '*' if the current position is on the border (first row, last row,
    // first column, or last column).
    // 4. Otherwise, print a space.
    // 5. Move to the next line after printing all columns in a row.
    public static void hollow_rectangle(int totrows, int totcols) {
        // Loop through each row
        for (int i = 1; i <= totrows; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= totcols; j++) {
                // Check if the current position is on the border
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*"); // Print '*' for border positions
                } else {
                    System.out.print(" "); // Print space for inner positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Function to print an inverted and rotated half pyramid of stars
    // Algorithm:
    // 1. Iterate through each row from 1 to n.
    // 2. For each row, print (n - i) spaces followed by i stars.
    // 3. Move to the next line after printing all columns in a row.
    public static void inverted_rotated_halfPyramid(int n) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    // Function to print a half pyramid of numbers
    // Algorithm:
    // 1. Iterate through each row from 1 to n.
    // 2. For each row, print numbers from 1 to (n - i + 1).
    // 3. Move to the next line after printing all columns in a row.
    public static void half_pyramid_withNumbers(int n) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print numbers in decreasing order
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }

    // Function to print Floyd's Triangle
    // Algorithm:
    // 1. Initialize a counter to 1.
    // 2. Iterate through each row from 1 to n.
    // 3. For each row, print numbers starting from the counter value.
    // 4. Increment the counter after each number.
    // 5. Move to the next line after printing all columns in a row.
    public static void floyds_triangle(int n) {
        int counter = 1; // Initialize the counter
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " "); // Print the current counter value
                counter++; // Increment the counter
            }
            System.out.println(); // Move to the next line
        }
    }

    // Function to print a 0-1 triangle
    // Algorithm:
    // 1. Iterate through each row from 1 to n.
    // 2. For each row, iterate through each column from 1 to i.
    // 3. Print '1' if the sum of the row and column indices is even.
    // 4. Print '0' if the sum of the row and column indices is odd.
    // 5. Move to the next line after printing all columns in a row.
    public static void zero_one_triangle(int n) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // Check if the sum of row and column indices is even
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); // Move to the next line
        }
    }

    // Function to print a solid rhombus
    // Algorithm:
    // 1. Iterate through each row from 1 to n.
    // 2. For each row, print (n - i) spaces followed by n stars.
    // 3. Move to the next line after printing all columns in a row.
    public static void solid_rhombus(int n) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Function to print a hollow rhombus
    // Algorithm:
    // 1. Iterate through each row from 1 to n.
    // 2. For each row, print (n - i) spaces followed by stars and spaces.
    // 3. Print '*' for the border positions and space for inner positions.
    // 4. Move to the next line after printing all columns in a row.
    public static void hollow_rhombus(int n) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) { // Check for border positions
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }

    // Function to print a diamond pattern
    // Algorithm:
    // 1. Iterate through each row from 1 to n to print the upper part of the
    // diamond.
    // 2. For each row, print (n - i) spaces followed by (2 * i - 1) stars.
    // 3. Iterate through each row from n to 1 to print the lower part of the
    // diamond.
    // 4. For each row, print (n - i) spaces followed by (2 * i - 1) stars.
    // 5. Move to the next line after printing all columns in a row.
    public static void diamond(int n) {
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        // Lower part of the diamond
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Function to print a butterfly pattern
    // Algorithm:
    // 1. Iterate through each row from 1 to n to print the upper part of the
    // butterfly.
    // 2. For each row, print i stars followed by (2 * (n - i)) spaces and then i
    // stars.
    // 3. Iterate through each row from n to 1 to print the lower part of the
    // butterfly.
    // 4. For each row, print i stars followed by (2 * (n - i)) spaces and then i
    // stars.
    // 5. Move to the next line after printing all columns in a row.
    public static void butterfly(int n) {
        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print the first part of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print the second part of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print the first part of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print the second part of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        // Call the function to print a hollow rectangle with 10 rows and 7 columns
        // hollow_rectangle(10, 7);

        // Call the function to print an inverted and rotated half pyramid with 5 rows
        // inverted_rotated_halfPyramid(5);

        // Call the function to print a half pyramid of numbers with 5 rows
        // half_pyramid_withNumbers(5);

        // Call the function to print Floyd's Triangle with 5 rows
        // floyds_triangle(5);

        // Call the function to print a 0-1 triangle with 5 rows
        // zero_one_triangle(5);

        // Call the function to print a solid rhombus with 7 rows
        // solid_rhombus(7);

        // Call the function to print a hollow rhombus with 8 rows
        // hollow_rhombus(8);

        // Call the function to print a diamond pattern with 6 rows
        // diamond(6);

        // Call the function to print a butterfly pattern with 5 rows
        butterfly(5);
    }
}
