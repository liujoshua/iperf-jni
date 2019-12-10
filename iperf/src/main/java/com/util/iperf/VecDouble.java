/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.util.iperf;

public class VecDouble {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VecDouble(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VecDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libiperfJNI.delete_VecDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VecDouble() {
    this(libiperfJNI.new_VecDouble__SWIG_0(), true);
  }

  public VecDouble(long n) {
    this(libiperfJNI.new_VecDouble__SWIG_1(n), true);
  }

  public long size() {
    return libiperfJNI.VecDouble_size(swigCPtr, this);
  }

  public long capacity() {
    return libiperfJNI.VecDouble_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libiperfJNI.VecDouble_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libiperfJNI.VecDouble_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libiperfJNI.VecDouble_clear(swigCPtr, this);
  }

  public void add(double x) {
    libiperfJNI.VecDouble_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return libiperfJNI.VecDouble_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    libiperfJNI.VecDouble_set(swigCPtr, this, i, val);
  }

}