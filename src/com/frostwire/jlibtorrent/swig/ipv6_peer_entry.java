/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class ipv6_peer_entry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ipv6_peer_entry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ipv6_peer_entry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_ipv6_peer_entry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIp(SWIGTYPE_p_boost__asio__ip__address_v6__bytes_type value) {
    libtorrent_jni.ipv6_peer_entry_ip_set(swigCPtr, this, SWIGTYPE_p_boost__asio__ip__address_v6__bytes_type.getCPtr(value));
  }

  public SWIGTYPE_p_boost__asio__ip__address_v6__bytes_type getIp() {
    long cPtr = libtorrent_jni.ipv6_peer_entry_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_boost__asio__ip__address_v6__bytes_type(cPtr, false);
  }

  public void setPort(int value) {
    libtorrent_jni.ipv6_peer_entry_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return libtorrent_jni.ipv6_peer_entry_port_get(swigCPtr, this);
  }

  public ipv6_peer_entry() {
    this(libtorrent_jni.new_ipv6_peer_entry(), true);
  }

}
