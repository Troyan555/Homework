package hw6;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator {
    public static int doCalc(String[][] arr) {
        int summ = 0;
        try {
            if (arr.length != 4) // lines
            {
                throw new ArraySizeException("Size !=4");
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i].length != 4) //columns
                    {
                        throw new ArraySizeException("Size error");
                    }
                    try {
                        summ += parseInt(arr[i][j], 10);
                    } catch (NumberFormatException a) {
                        throw new ArrayDataException("Error " + Integer.toString(i) + "\t" + Integer.toString(j));
                    }
                }
            }
        } catch (ArrayDataException a) {
            a.PrintMessage();
            return 0;
        } catch (ArraySizeException a) {
            a.PrintMessage();
            //return 0;
        }
        return summ;
    }
}
