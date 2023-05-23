package com.dsa.generics.school;

/**
 *
 * @param <T>
 * @apiNote A generic interface that performs operations on classes that it wraps.
 */
public interface Attendance<T> {

    /**
     * @param members is any class that requires a count */
    public int studentType(T members);
}
