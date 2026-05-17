package java18;

import java.util.Arrays;

import jdk.incubator.vector.*;
//Continues incubating APIs for vector computations using SIMD (Single Instruction, Multiple Data).


public class VectorAPI {
    public static void main(String[] args) {
        VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;
        float[] a = {1f, 2f, 3f, 4f};
        float[] b = {5f, 6f, 7f, 8f};
        float[] result = new float[4];

        FloatVector va = FloatVector.fromArray(SPECIES, a, 0);
        FloatVector vb = FloatVector.fromArray(SPECIES, b, 0);
        FloatVector vc = va.add(vb);
        vc.intoArray(result, 0);

        System.out.println(Arrays.toString(result)); // [6.0, 8.0, 10.0, 12.0]
    }
}

//✅ Benefits:
//Hardware acceleration for mathematical operations.
//
//Boosts performance in AI, ML, image processing, etc.

