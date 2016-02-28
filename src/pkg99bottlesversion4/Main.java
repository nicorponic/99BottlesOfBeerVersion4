/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg99bottlesversion4;

/**
 *
 * @author N1CO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        int beer = 99;
        StringBuilder sb = new StringBuilder();
        String data[] = new String[]{" bottles of beer on the wall\n",
            " bottles of beer.\nTake one down, pass it around,\n",
            "Better go to the store and buy some more.",
            " bottle of beer on the wall,\n",
            " bottle of beer.\nTake one down, pass it around,\n",
            "No more bottles of beer on the wall\n"};

        do {

            sb.append(beer).append(data[0]).append(beer).append(data[1]).append(--beer).append(data[0]).append("\n");

        } while (beer > 1);

        sb.append(beer).append(data[3]).append(beer).append(data[4]).append(data[5]).append("\n");

        System.out.println(sb.append(data[2]).toString());

    }
}
