/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_connection_hot_members {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected peer_connection_hot_members(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_connection_hot_members obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_connection_hot_members(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public peer_connection_hot_members(SWIGTYPE_p_boost__weak_ptrT_libtorrent__torrent_t t, SWIGTYPE_p_libtorrent__aux__session_interface ses, SWIGTYPE_p_libtorrent__aux__session_settings sett) {
    this(libtorrent_jni.new_peer_connection_hot_members(SWIGTYPE_p_boost__weak_ptrT_libtorrent__torrent_t.getCPtr(t), SWIGTYPE_p_libtorrent__aux__session_interface.getCPtr(ses), SWIGTYPE_p_libtorrent__aux__session_settings.getCPtr(sett)), true);
  }

  public void setM_ses(SWIGTYPE_p_libtorrent__aux__session_interface value) {
    libtorrent_jni.peer_connection_hot_members_m_ses_set(swigCPtr, this, SWIGTYPE_p_libtorrent__aux__session_interface.getCPtr(value));
  }

  public SWIGTYPE_p_libtorrent__aux__session_interface getM_ses() {
    return new SWIGTYPE_p_libtorrent__aux__session_interface(libtorrent_jni.peer_connection_hot_members_m_ses_get(swigCPtr, this), false);
  }

  public SWIGTYPE_p_libtorrent__aux__session_settings getM_settings() {
    return new SWIGTYPE_p_libtorrent__aux__session_settings(libtorrent_jni.peer_connection_hot_members_m_settings_get(swigCPtr, this), false);
  }

}
