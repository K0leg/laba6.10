package com.proger1;

public class Car extends Transport {

    public Car (float _speed, int _weight, String _color, byte[] _coordinates){
        // System.out.println("Object is created");
        setValues(_speed, _weight, _color,_coordinates);
        System.out. println(getValues());
    }
}
