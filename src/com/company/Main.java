package com.company;

public class Main {

    public static void main(String[] args) {
	// Declarare Array
        int[] exampleArray=new int[15];
        System.out.println("Vectorul este: ");

        // Initializare Array
        for(int i=0; i<exampleArray.length;i++){
            exampleArray[i]=i+2;
            System.out.println("ExampleArray["+i+"]="+ exampleArray[i]+" ");
        }

        //Accesare elemente din Array
        int index=4;
        System.out.println("Accesam unul din elementele sirului: "+exampleArray[index]);

        //Modificare element din Array
        exampleArray[index]=-761;
        System.out.println("Accesam unul din elementele sirului: "+exampleArray[index]);

        String[] numePers=new String[6];
            numePers[0]="Ionut";
            numePers[1]="Mihaela";
            numePers[2]="Raluca";
            numePers[3]="Sara";
            numePers[4]="Andrei";
            System.out.println(numePers[5]);
            for(int i=0;i<numePers.length;i++){
                System.out.println(numePers[i]);
            }
        System.out.println(" ");
            for(String numeTemporar: numePers){
                System.out.println(numeTemporar);
            }
    }
}
