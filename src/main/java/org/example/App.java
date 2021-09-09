package org.example;
import java.util.Scanner;
/**
 * How many people? 8
 * How many pizzas do you have? 2
 * How many slices per pizza? 8
 * 8 people with 2 pizzas (16 slices)
 * Each person gets 2 pieces of pizza.
 * There are 0 leftover pieces.
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */


public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        System.out.print( "How many people? " );
        int people=in.nextInt();
        System.out.print( "How many pizzas do you have? " );
        int pizzas=in.nextInt();
        System.out.print( "How many slices per pizza? " );
        int slices=in.nextInt();
        int slicesPer=(pizzas*slices)/people;
        System.out.println( people+ " people with "+ pizzas+ " pizzas ("+(pizzas*slices)+ " slices)" );
        System.out.println( "Each person gets "+slicesPer+" pieces of pizza." );
        int leftover=(slicesPer*people)-(pizzas*slices);
        System.out.println( "There are "+(leftover*(-1))+" leftover pieces." );
    }
}
