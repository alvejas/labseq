package com.app;

import java.math.BigInteger;

public class Operations {

    public int labseqOperation(int currentN) {
        {

                // Base Case
                if (currentN == 0 || currentN == 2) {
                    return 0;
                }

                if (currentN == 1 || currentN == 3){

                    return 1;

            }

                // Recursive call
                return labseqOperation(currentN - 4) + labseqOperation(currentN - 3);

        }

    }

}
