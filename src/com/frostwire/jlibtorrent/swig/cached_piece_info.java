/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class cached_piece_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected cached_piece_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cached_piece_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_cached_piece_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStorage(SWIGTYPE_p_libtorrent__piece_manager value) {
    libtorrent_jni.cached_piece_info_storage_set(swigCPtr, this, SWIGTYPE_p_libtorrent__piece_manager.getCPtr(value));
  }

  public SWIGTYPE_p_libtorrent__piece_manager getStorage() {
    long cPtr = libtorrent_jni.cached_piece_info_storage_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_libtorrent__piece_manager(cPtr, false);
  }

  public void setBlocks(bool_vector value) {
    libtorrent_jni.cached_piece_info_blocks_set(swigCPtr, this, bool_vector.getCPtr(value), value);
  }

  public bool_vector getBlocks() {
    long cPtr = libtorrent_jni.cached_piece_info_blocks_get(swigCPtr, this);
    return (cPtr == 0) ? null : new bool_vector(cPtr, false);
  }

  public void setLast_use(SWIGTYPE_p_ptime value) {
    libtorrent_jni.cached_piece_info_last_use_set(swigCPtr, this, SWIGTYPE_p_ptime.getCPtr(value));
  }

  public SWIGTYPE_p_ptime getLast_use() {
    return new SWIGTYPE_p_ptime(libtorrent_jni.cached_piece_info_last_use_get(swigCPtr, this), true);
  }

  public void setNext_to_hash(int value) {
    libtorrent_jni.cached_piece_info_next_to_hash_set(swigCPtr, this, value);
  }

  public int getNext_to_hash() {
    return libtorrent_jni.cached_piece_info_next_to_hash_get(swigCPtr, this);
  }

  public void setPiece(int value) {
    libtorrent_jni.cached_piece_info_piece_set(swigCPtr, this, value);
  }

  public int getPiece() {
    return libtorrent_jni.cached_piece_info_piece_get(swigCPtr, this);
  }

  public void setKind(cached_piece_info.kind_t value) {
    libtorrent_jni.cached_piece_info_kind_set(swigCPtr, this, value.swigValue());
  }

  public cached_piece_info.kind_t getKind() {
    return cached_piece_info.kind_t.swigToEnum(libtorrent_jni.cached_piece_info_kind_get(swigCPtr, this));
  }

  public void setNeed_readback(boolean value) {
    libtorrent_jni.cached_piece_info_need_readback_set(swigCPtr, this, value);
  }

  public boolean getNeed_readback() {
    return libtorrent_jni.cached_piece_info_need_readback_get(swigCPtr, this);
  }

  public cached_piece_info() {
    this(libtorrent_jni.new_cached_piece_info(), true);
  }

  public enum kind_t {
    read_cache(libtorrent_jni.cached_piece_info_read_cache_get()),
    write_cache(libtorrent_jni.cached_piece_info_write_cache_get()),
    volatile_read_cache(libtorrent_jni.cached_piece_info_volatile_read_cache_get());

    public final int swigValue() {
      return swigValue;
    }

    public static kind_t swigToEnum(int swigValue) {
      kind_t[] swigValues = kind_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (kind_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + kind_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private kind_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private kind_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private kind_t(kind_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
